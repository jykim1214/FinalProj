// ����
public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
	}

	private void playScenario() {
		System.out.println("Director : �ó������� �����մϴ�.");

		System.out.println("Director : Customer�� �����մϴ�.");
		String customerName = "������";
		Customer customer = new Customer(customerName);

		System.out.println("Director : Employee�� �����մϴ�.");
		Employee employee = new Employee();

		MovieInfo mvInfo = new MovieInfo();
		ScreenInfo screenInfo = new ScreenInfo();
		MovieDisplay mvDisplay = new MovieDisplay();
		TicketMachine ticketMachine = new TicketMachine();

		mvDisplay.setMovieInformation(mvInfo);
		ticketMachine.setScreenInformation(screenInfo);

		System.out.println("Director : Customer���� �ֽ� ��ȭ������ Ȯ���ϵ��� �����մϴ�.");
		customer.findNewMovie(mvDisplay);
		
		customer.askMovieTime(employee);

		System.out.println("Director : Customer���� ��ȭ�� �����ϵ��� �����մϴ�.");
		customer.reserveMovie(employee);
	}
}
