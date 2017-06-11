import java.util.ArrayList;
import java.util.List;

// 예매기계
public class TicketMachine {

	private List<ScreenInfo> screenInfos = new ArrayList<ScreenInfo>();

	private int mvSeat;

	public TicketMachine() {
		
	}

	public void setScreenInformation(ScreenInfo screenInfo) {
		// screenInfo정보를 입력
		screenInfos.add(new ScreenInfo("미녀와야수", "2시", "1관", 10));
		screenInfos.add(new ScreenInfo("미녀와야수", "4시30분", "1관", 5));
		screenInfos.add(new ScreenInfo("대립군", "1시", "2관", 0));
		screenInfos.add(new ScreenInfo("대립군", "1시30분", "3관", 2));
	}

	public boolean isPossibleReserve(String mvName) {
		System.out.println("TicketMachine : Employee에게 영화에 대한 정보를 알려준다.");
		
		for(int i=1; i<=screenInfos.size(); i++) {
			if(mvName==screenInfos.get(i).getMvName()){
				
			}
		}
		if (mvSeat >= 1)
			return true;
		else
			return false;
	}

	public void doReserve(String mvName, String mvTime) {
		System.out.println("TicketMachine : 영화를 예매하였습니다.");
	}

}