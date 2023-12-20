package movie;

public class Consumar {
	String Id;
	String infoname;
	String Pnum;
	String sn;
	String mt;
	String hall;
	String seatn;
	String nOp;
	String oT;
	int pM;
	boolean ts;

	public Consumar(String Id, String infoname, String Pnum, String sn, String mt, String hall, String seatn,
			String nOp, String oT, int pM, boolean ts) {
		this.Id = Id;
		this.infoname = infoname;
		this.Pnum = Pnum;
		this.sn = sn;
		this.mt = mt;
		this.hall = hall;
		this.seatn = seatn;
		this.nOp = nOp;
		this.oT = oT;
		this.pM = pM;
		this.ts = ts;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getInfoname() {
		return infoname;
	}

	public void setInfoname(String infoname) {
		this.infoname = infoname;
	}

	public String getPnum() {
		return Pnum;
	}

	public void setPnum(String pnum) {
		Pnum = pnum;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getMt() {
		return mt;
	}

	public void setMt(String mt) {
		this.mt = mt;
	}

	public String getHall() {
		return hall;
	}

	public void setHall(String hall) {
		this.hall = hall;
	}

	public String getSeatn() {
		return seatn;
	}

	public void setSeatn(String seatn) {
		this.seatn = seatn;
	}

	public String getnOp() {
		return nOp;
	}

	public void setnOp(String nOp) {
		this.nOp = nOp;
	}

	public String getoT() {
		return oT;
	}

	public void setoT(String oT) {
		this.oT = oT;
	}

	public int getpM() {
		return pM;
	}

	public void setpM(int pM) {
		this.pM = pM;
	}

	public boolean getTs() {
		return ts;
	}

	public void setTs(boolean ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "아이디 :" + Id + "\t성함 :" + infoname + "\t전화번호 :" + Pnum + "\n고유번호 :" + sn + "\t영화명 :" + mt + "\tHall :"
				+ hall + "\n좌석번호 :" + seatn + "\n인원수 :" + nOp + "명" + "\n상영시간 :" + oT + "\n가격 :" + pM + "\n예약상태 : " + ts
				+ "\n" + "==========================================================\n";
	}
}