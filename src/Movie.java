public class Movie {
	private String mvName;
	private String mvRunningTime;
	private String mvGenre;
	private String mvAge;
	
	public Movie() {
		mvName = "미녀와야수";
		mvRunningTime = "129분";
		mvGenre = "판타지, 뮤지컬";
		mvAge = "전체 관람가";
	}
	
	public String getMvName() {
		return mvName;
	}

	public String getMvRunningTime() {
		return mvRunningTime;
	}

	public String getMvGenre() {
		return mvGenre;
	}

	public String getMvAge() {
		return mvAge;
	}
			
}
