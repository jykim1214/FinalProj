// 예매기계
public class TicketMachine {

	private String mvName;
	private String mvTime;
	private String mvTheater;
	private int mvSeat;

	public TicketMachine() {
		
	}

	public void setScreenInformation(ScreenInfo screenInfo) {
		// screenInfo정보를 입력
		mvName = screenInfo.getMvName();
		mvTime = screenInfo.getMvTime();
		mvTheater = screenInfo.getMvTheater();
		mvSeat = screenInfo.getMvSeat();
	}

	public boolean isPossibleReserve() {
		System.out.println("TicketMachine : Employee에게 영화에 대한 정보를 알려준다.");
		if (mvSeat >= 1)
			return true;
		else
			return false;
	}

	public void doReserve() {
		System.out.println("TicketMachine : 영화를 예매하였습니다.");
	}

}