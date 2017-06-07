// 상영정보
public class ScreenInfo {

	private String mvName; // 영화이름
	private String mvTime; // 상영시간
	private String mvTheater; // 상영관
	private int mvSeat = 5; // 자리

	public ScreenInfo() {
	}

	public String getMvName() {
		return mvName;
	}

	public void setMvName(MovieInfo mvInfo) {
		mvName = mvInfo.getMvName();
	}

	public String getMvTime() {
		return mvTime;
	}

	public String getMvTheater() {
		return mvTheater;
	}

	public int getMvSeat() {
		return mvSeat;
	}

}