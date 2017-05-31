// 보여질 영화 정보
public class MovieDisplay {

	String mvName;

	public MovieDisplay() {
	}

	public String findCurrentMovies() {
		System.out.println("MovieDisplay : 현재 상영중인 영화 정보를 Customer에게 알려줍니다.");
		return mvName;
	}

	public void getMovieInformation(MovieInfo mvInfo) {
		mvName = mvInfo.getMvName();
	}
}