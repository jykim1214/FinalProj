// 직원
public class Employee {

	public TicketMachine ticketMachine;
	public boolean isSeat; // 좌석 여부

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public void reserveMovie(Customer customer, String mvName) {
		System.out.println("Employee : TicketMachine에게 A영화의 영화 정보를 물어봅니다.");
		ticketMachine.movieInfo();
	}

}
