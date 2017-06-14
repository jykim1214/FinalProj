import java.util.ArrayList;
import java.util.List;

// 직원
public class Employee {

	public TicketMachine ticketMachine;
	public List<String> mvTime = new ArrayList<String>(); // 좌석 여부

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public List<String> askMvTime(Customer customer, String mvName) {
		System.out.println("Employee : Ticketmachine에게 '"+mvName+"'영화에 대한 정보를 물어봅니다.");
		mvTime = ticketMachine.isPossibleReserveTime(mvName);
		
		System.out.print("Employee : '"+mvName+"' 영화의 현재 예매 가능한 시간은 ");
		for(int i=0; i<mvTime.size(); i++) {
			System.out.print(mvTime.get(i) + ", ");
		}
		System.out.println("입니다.");
		
		return mvTime;
	}

	public void reserveMovie(Customer customer, String mvName, String mvTime) {
		System.out.println("Employee : '"+mvName+"' "+mvTime+" 영화를 예매하겠습니다.");
		ticketMachine.doReserve(customer, mvName, mvTime);
	}

}