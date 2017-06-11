import java.util.ArrayList;
import java.util.List;

// 손님
public class Customer {

	List<String> movies = new ArrayList<String>();
	
	String mvName;
	String mvTime;
	boolean isPossibleReserve = true;

	public Customer(String customerName) {

	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay한테 현재 상영중인 영화정보를 받아옵니다.");
		movies.addAll(mvDisplay.findCurrentMovies());
		for(int i=0; i<movies.size(); i++) {
//			System.out.println(movies.get(i));
		}
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee에게 A영화를 4D로 1시에 보고싶다고 말합니다.");

		// 임의로 영화를 하나 지정해준다.
		mvName= movies.get(0);

		isPossibleReserve = employee.isPossibleReserve(this, mvName);

		if (isPossibleReserve) {
			System.out.println("customer : 예매해주세요.");
			employee.reserveMovie(this, mvName, mvTime);
		} else {
			System.out.println("Customer : 네 알겠습니다.");
		}
	}
}