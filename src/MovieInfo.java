// ��ȭ ����
public class MovieInfo {

	private String mvName;
	private String mvRunningTime;
	private String mvGenre;
	private String mvAge;

	public MovieInfo() {
		
	}
	
	public MovieInfo(String Name, String RunningTime, String Genre, String Age) {
		mvName = Name;
		mvRunningTime = RunningTime;
		mvGenre = Genre;
		mvAge = Age;
	}

	public String getMvName() {
		return mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;
	}

	public String getMvRunningTime() {
		return mvRunningTime;
	}

	public void setMvRunningTime(String mvRunningTime) {
		this.mvRunningTime = mvRunningTime;
	}

	public String getMvGenre() {
		return mvGenre;
	}

	public void setMvGenre(String mvGenre) {
		this.mvGenre = mvGenre;
	}

	public String getMvAge() {
		return mvAge;
	}

	public void setMvAge(String mvAge) {
		this.mvAge = mvAge;
	}
}