// 직원
public class Employee {

	public TicketMachine ticketMachine;

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public void reservation(Customer customer, String mvName) {
		System.out.println("Employee : TicketMachine에게 A영화의 영화 정보를 물어봅니다.");
		ticketMachine.movieInfo();
	}

}
