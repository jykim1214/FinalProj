// 상영정보

public class ScreenInfo {
	MovieInfo mvInfo;
	String mvCode;	// 영화 코드
	String mvName;	// 영화이름
	String mvTime;	// 상영시간
	String mvTheater; // 상영관
	int mvSeat=5;	// 자리
	
	public ScreenInfo() {
		mvInfo = new MovieInfo();
	}
	
	public String getMvCode() {
		return mvCode;
	}
	
	public String getMvName() {
		return mvName;
	}
	
	public void setMvName() {
		mvInfo.getMvName();
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
