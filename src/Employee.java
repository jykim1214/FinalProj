import java.util.ArrayList;
import java.util.List;

// ����
public class Employee {

	public TicketMachine ticketMachine;
	public List<String> mvTime = new ArrayList<String>(); // �¼� ����

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public List<String> askMvTime(Customer customer, String mvName) {
		System.out.println("Employee : Ticketmachine���� '"+mvName+"'��ȭ�� ���� ������ ����ϴ�.");
		mvTime = ticketMachine.isPossibleReserveTime(mvName);
		
		System.out.print("Employee : '"+mvName+"' ��ȭ�� ���� ���� ������ �ð��� ");
		for(int i=0; i<mvTime.size(); i++) {
			System.out.print(mvTime.get(i) + ", ");
		}
		System.out.println("�Դϴ�.");
		
		return mvTime;
	}

	public void reserveMovie(Customer customer, String mvName, String mvTime) {
		System.out.println("Employee : '"+mvName+"' "+mvTime+" ��ȭ�� �����ϰڽ��ϴ�.");
		ticketMachine.doReserve(customer, mvName, mvTime);
	}

}