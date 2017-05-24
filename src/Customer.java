
public class Customer {

	public Customer(String customerName) {
		
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : MovieDisplay한테 현재 상영중인 영화정보를 받아옵니다.");
		MovieDisplay movieDisplay = new MovieDisplay();
		movieDisplay.currentMovie();
		
		System.out.println("Customer : Employee에게 A영화를 4D로 1시에 보고싶다고 말합니다.");
		employee.reservation(movieDisplay.mvInfo);
	}

}
