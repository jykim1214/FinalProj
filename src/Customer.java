// 손님
public class Customer {

	String mvName;
	boolean isPossibleReserve = true;

	public Customer(String customerName) {
	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay한테 현재 상영중인 영화정보를 받아옵니다.");
		mvName = mvDisplay.findCurrentMovies();
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee에게 A영화를 4D로 1시에 보고싶다고 말합니다.");

		isPossibleReserve = employee.reserveMovie(this, mvName);

		if (isPossibleReserve) {
			System.out.println("customer : 예매해주세요.");
			employee.doReserveMovie();
		} else {
			System.out.println("Customer : 네 알겠습니다.");
		}
	}
}