package movie;

import java.sql.Connection;
import java.util.*;

public class Movies {
	String MVname;
	String MVserial;
	String RD; // 오픈 날짜
	String WD; // 종영 날짜
	String Gerne;

	String SS; // 상영 여부

	public Movies(String MVname, String MVserial, String RD, String WD, String Gerne, String SS) {
		super();
		this.MVname = MVname;
		this.MVserial = MVserial;
		this.RD = RD;
		this.WD = WD;
		this.Gerne = Gerne;
		this.SS = SS;
	}
	 public Movies(String MVname, String MVserial){
		 super();
		 this.MVname = MVname;
		 this.MVserial = MVserial;
	 }

	public String getGerne() {
		return Gerne;
	}

	public void setGerne(String gerne) {
		Gerne = gerne;
	}

	public String getMVname() {
		return MVname;
	}

	public void setMVname(String mVname) {
		MVname = mVname;
	}

	public String getMVserial() {
		return MVserial;
	}

	public void setMVserial(String mVserial) {
		MVserial = mVserial;
	}

	public String getRD() {
		return RD;
	}

	public void setRD(String rD) {
		RD = rD;
	}

	public String getWD() {
		return WD;
	}

	public void setWD(String wD) {
		WD = wD;
	}

	public String isSS() {
		return SS;
	}

	public void setSS(String sS) {
		SS = sS;
	}
	
// 디폴트 투스트링 : 리스트의 주소값 : 해시  출력
	public String toString() {
		return "영화제목 :"+MVname+"\n영화 코드 :"+MVserial+"\n영화 개시일 :"+RD+"\n영화 종료일 :"+WD+"\n장르 :"+Gerne+"\n개봉여부 :"+ SS
				+"\n=====================================";
		
	}


}

