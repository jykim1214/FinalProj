import java.util.ArrayList;
import java.util.List;

// 손님
public class Customer {

	private String mvName;
	private List<String> movies = new ArrayList<String>();
	private List<String> mvTime = new ArrayList<String>();

	public Customer() {

	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay한테 현재 상영중인 영화정보를 받아옵니다.");
		movies.addAll(mvDisplay.findCurrentMovies());
	}

	public void askMovieTime(Employee employee) {
		// 임의로 영화를 하나 지정해준다.
		mvName = movies.get(0);
		System.out.println("Customer : Employee에게 '미녀와야수'영화를 보고싶다고 말합니다.");

		mvTime = employee.askMvTime(this, mvName);
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : '" + mvName + "' 영화 " + mvTime.get(0) + "꺼 예매해 주세요");
		employee.reserveMovie(this, mvName, mvTime.get(0));
	}
}