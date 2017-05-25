import java.util.List;

public class MovieDisplay {

	public MovieInfo mvInfo;

	public MovieDisplay() {
		mvInfo = new MovieInfo();
	}

	public MovieInfo findCurrentMovies() {
		System.out.println("MovieDisplay : 현재 상영중인 영화 정보를 Customer에게 알려줍니다.");
		String[] mvinfo = {mvInfo.getMvName(), mvInfo.getMvTime(), mvInfo.getMvSeats()};
		return mvInfo;
	}
}