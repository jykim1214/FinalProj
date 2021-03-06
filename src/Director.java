// 감독
public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
	}

	private void playScenario() {
		System.out.println("Director : 시나리오를 시작합니다.");

		System.out.println("Director : Customer를 생성합니다.");
		Customer customer = new Customer();

		System.out.println("Director : Employee를 생성합니다.");
		Employee employee = new Employee();

		MovieInfo mvInfo = new MovieInfo();
		ScreenInfo screenInfo = new ScreenInfo();
		MovieDisplay mvDisplay = new MovieDisplay();
		TicketMachine ticketMachine = new TicketMachine();
		
		System.out.println("Director : MovieDisplay에게 MovieInfo로 부터 영화 정보를 받아오도록 지시합니다.");
		mvDisplay.setMovieInformation(mvInfo);
		
		System.out.println("Director : TicketMachine에게 ScreenInfo로부터 상영정보를 받아오도록 지시합니다.");
		ticketMachine.setScreenInformation(screenInfo);

		System.out.println("Director : Customer에게 최신 영화정보를 확인하도록 지시합니다.");
		customer.findNewMovie(mvDisplay);
		
		System.out.println("Director : Customer에게 영화 시간에 대한 정보를 물어보도록 지시합니다.");
		customer.askMovieTime(employee);

		System.out.println("Director : Customer에게 영화를 예매하도록 지시합니다.");
		customer.reserveMovie(employee);
	}
}
