// 예매기계
public class TicketMachine {

	public MovieInfo mvInfo;
	
	public TicketMachine() {
		mvInfo = new MovieInfo();
	}
	
	public String[] movieInfo() {
		System.out.println("TicketMachine : MovieInfo를 통해 상영관에 남아있는 자리 정보를 알아봅니다.");
		String[] seatInfo = {mvInfo.getMvName(), mvInfo.getMvThreater(), mvInfo.getMvTime(), mvInfo.getMvSeats()};
		return seatInfo;
	}
}
