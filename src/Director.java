
public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
	}

	private void playScenario() {
		System.out.println("Director : 시나리오를 시작합니다.");
		System.out.println("Director : Customer를 생성합니다.");
		String customerName = "김진영";
		Customer customer = new Customer(customerName);

		System.out.println("Director : Employee를 생성합니다.");
		Employee employee = new Employee();
		
		System.out.println("Director : Customer에게 최신 영화정보를 확인하도록 지시합니다.");
		MovieDisplay mvDisplay = new MovieDisplay();
		customer.findNewMovie(mvDisplay);

		System.out.println("Director : Customer에게 영화를 예매하도록 지시합니다.");
		customer.reserveMovie(employee);
	}

}
