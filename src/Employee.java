// 직원
public class Employee {

	public TicketMachine ticketMachine;
	public boolean isSeat; // 좌석 여부

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public boolean reserveMovie(Customer customer, String mvName) {
		System.out.println("Employee : Ticketmachine에게 A영화에 대한 정보를 물어봅니다.");
		isSeat = ticketMachine.isPossibleReserve();

		if (isSeat) {
			System.out.println("Employee : 현재 영화에 자리가 있어 예매 가능합니다.");
			return true;
		} else {
			System.out.println("Employee : 해당 영화에 자리가 없습니다. 죄송합니다.");
			return false;
		}
	}

	public void doReserveMovie() {
		System.out.println("Employee : 영화를 예매하겠습니다.");
		ticketMachine.doReserve();
	}

}
