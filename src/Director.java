// ����
public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
	}

	private void playScenario() {
		System.out.println("Director : �ó������� �����մϴ�.");

		System.out.println("Director : Customer�� �����մϴ�.");
		Customer customer = new Customer();

		System.out.println("Director : Employee�� �����մϴ�.");
		Employee employee = new Employee();

		MovieInfo mvInfo = new MovieInfo();
		ScreenInfo screenInfo = new ScreenInfo();
		MovieDisplay mvDisplay = new MovieDisplay();
		TicketMachine ticketMachine = new TicketMachine();
		
		System.out.println("Director : MovieDisplay���� MovieInfo�� ���� ��ȭ ������ �޾ƿ����� �����մϴ�.");
		mvDisplay.setMovieInformation(mvInfo);
		
		System.out.println("Director : TicketMachine���� ScreenInfo�κ��� �������� �޾ƿ����� �����մϴ�.");
		ticketMachine.setScreenInformation(screenInfo);

		System.out.println("Director : Customer���� �ֽ� ��ȭ������ Ȯ���ϵ��� �����մϴ�.");
		customer.findNewMovie(mvDisplay);
		
		System.out.println("Director : Customer���� ��ȭ �ð��� ���� ������ ������� �����մϴ�.");
		customer.askMovieTime(employee);

		System.out.println("Director : Customer���� ��ȭ�� �����ϵ��� �����մϴ�.");
		customer.reserveMovie(employee);
	}
}
