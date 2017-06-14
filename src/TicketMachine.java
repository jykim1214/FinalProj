import java.util.ArrayList;
import java.util.List;

// ���ű��
public class TicketMachine {

	List<ScreenInfo> screenInfos = new ArrayList<ScreenInfo>();
	List<String> mvTime = new ArrayList<String>();

	public TicketMachine() {
		screenInfos.add(new ScreenInfo("�̳�;߼�", "2��", "1��", 10));
		screenInfos.add(new ScreenInfo("�̳�;߼�", "4��30��", "1��", 5));
		screenInfos.add(new ScreenInfo("�븳��", "1��", "2��", 0));
		screenInfos.add(new ScreenInfo("�븳��", "1��30��", "3��", 2));
	}

	public void setScreenInformation(ScreenInfo screenInfo) {
		List<ScreenInfo> scInfo = new ArrayList<ScreenInfo>();
		scInfo.addAll(screenInfos);
	}

	public List<String> isPossibleReserveTime(String mvName) {
		System.out.println("TicketMachine : Employee���� ��ȭ�� ���� ������ �˷��ش�.");

		for (int i = 0; i < screenInfos.size(); i++) {
			if (mvName.equals(screenInfos.get(i).getMvName())) {
				mvTime.add(screenInfos.get(i).getMvTime());
			}
		}
		return mvTime;
	}

	public void doReserve(Customer customer, String mvName, String mvTime) {
		for(int i=0; i<screenInfos.size(); i++) {
			if(mvName.equals(screenInfos.get(i).getMvName())){
				if(mvTime.equals(screenInfos.get(i).getMvTime())) {
					if(screenInfos.get(i).getMvSeat()>=1) {
						System.out.println("TicketMachine : '"+mvName+"' "+ mvTime+" ��ȭ�� �����Ͽ����ϴ�.");
						screenInfos.get(i).setMvSeat(screenInfos.get(i).getMvSeat()-1);
					}
				}
			}
		}
	}
}