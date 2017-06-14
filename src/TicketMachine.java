import java.util.ArrayList;
import java.util.List;

// 예매기계
public class TicketMachine {

	List<ScreenInfo> screenInfos = new ArrayList<ScreenInfo>();
	List<String> mvTime = new ArrayList<String>();

	public TicketMachine() {
		screenInfos.add(new ScreenInfo("미녀와야수", "2시", "1관", 10));
		screenInfos.add(new ScreenInfo("미녀와야수", "4시30분", "1관", 5));
		screenInfos.add(new ScreenInfo("대립군", "1시", "2관", 0));
		screenInfos.add(new ScreenInfo("대립군", "1시30분", "3관", 2));
	}

	public void setScreenInformation(ScreenInfo screenInfo) {
		List<ScreenInfo> scInfo = new ArrayList<ScreenInfo>();
		scInfo.addAll(screenInfos);
	}

	public List<String> isPossibleReserveTime(String mvName) {
		System.out.println("TicketMachine : Employee에게 영화에 대한 정보를 알려준다.");

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
						System.out.println("TicketMachine : '"+mvName+"' "+ mvTime+" 영화를 예매하였습니다.");
						screenInfos.get(i).setMvSeat(screenInfos.get(i).getMvSeat()-1);
					}
				}
			}
		}
	}
}