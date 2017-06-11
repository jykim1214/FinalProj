import java.util.ArrayList;
import java.util.List;

// 보여질 영화 정보
public class MovieDisplay {

	ArrayList<MovieInfo> movieInfo = new ArrayList<MovieInfo>();
	List<String> mvName = new ArrayList<String>();

	public MovieDisplay() {
		movieInfo.add(new MovieInfo("미녀와야수", "129분", "판타지, 뮤지컬", "전체연령가"));
		movieInfo.add(new MovieInfo("대립군", "130분", "드라마", "15세"));
	}

	public List<String> findCurrentMovies() {
		System.out.println("MovieDisplay : 현재 상영중인 영화 정보를 Customer에게 알려줍니다.");

		System.out.println("******현재 상영 가능한 영화******");
		for (int i = 0; i < movieInfo.size(); i++) {
			mvName.add(movieInfo.get(i).getMvName());
			System.out.println("  제목 : " + mvName.get(i));
		}
		System.out.println("**************************");

		return mvName;
	}

	public void setMovieInformation(MovieInfo mvInfo) {
		for (int i = 0; i < movieInfo.size(); i++) {
			mvName.add(movieInfo.get(i).getMvName());
		}

	}
}