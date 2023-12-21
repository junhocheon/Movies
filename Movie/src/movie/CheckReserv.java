package movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class CheckReserv {
	static DBUtil db = new DBUtil();

	public static void find(String name) {
	      ArrayList<Consumar> Addr = new ArrayList<>();
		String sql1 = "select a.* from bookingstatus a join sign b on a.id = b.id where a.id = ?";
		try {
			Connection conn = db.getConnection();
			db.stmt = conn.createStatement();
			String sql = "use consumerinfo";
			db.stmt.executeUpdate(sql);
			
			PreparedStatement pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, name);

			db.rs = pstmt.executeQuery();
			while(db.rs.next()) {
				 	String Id = db.rs.getString("Id");
		            String infoname = db.rs.getString("infoname");
		            String Pnum = db.rs.getString("PhoneNUMBER");
		            String sn = db.rs.getString("SerialNumber");
		            String mt = db.rs.getString("MovieTitle");
		            String hall = db.rs.getString("Hall");
		            String seatn = db.rs.getString("SeatNumber");
		            String nOp = db.rs.getString("NOP");
		            String oT = db.rs.getString("OrderTime");
		            int pM = db.rs.getInt("PayMent");
		            boolean ts = db.rs.getBoolean("TicketStatus");

		            Consumar addr = new Consumar(Id, infoname, Pnum, sn, mt, hall, seatn, nOp, oT, pM, ts);
		            Addr.add(addr);
			}
			
		}catch(Exception e) {
		e.printStackTrace();
	}
		if(Addr.isEmpty()) {
			System.out.println("없는 정보 입니다");
		}else {
		for(Consumar list : Addr) {
			System.out.println(list);
		}}
	}

	public static void nonfind(String name) {
	      ArrayList<Consumar> Addr = new ArrayList<>();
		String sql1 = "select a.* from consumerinfo.bookingstatus a where a.SerialNumber = ? or a.PhoneNumber = ?";
		try {
			Connection conn = db.getConnection();
			db.stmt = conn.createStatement();
			String sql = "use consumerinfo";
			db.stmt.executeUpdate(sql);
			
			PreparedStatement pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, name);
			pstmt.setString(2, name);
			
			db.rs = pstmt.executeQuery();
			while(db.rs.next()) {
				 	String Id = db.rs.getString("Id");
		            String infoname = db.rs.getString("infoname");
		            String Pnum = db.rs.getString("PhoneNUMBER");
		            String sn = db.rs.getString("SerialNumber");
		            String mt = db.rs.getString("MovieTitle");
		            String hall = db.rs.getString("Hall");
		            String seatn = db.rs.getString("SeatNumber");
		            String nOp = db.rs.getString("NOP");
		            String oT = db.rs.getString("OrderTime");
		            int pM = db.rs.getInt("PayMent");
		            boolean ts = db.rs.getBoolean("TicketStatus");

		            Consumar addr = new Consumar(Id, infoname, Pnum, sn, mt, hall, seatn, nOp, oT, pM, ts);
		            Addr.add(addr);
			}
			
		}catch(Exception e) {
		e.printStackTrace();
	}
		if(Addr.isEmpty()) {
			System.out.println("없는 정보 입니다");
		}else {
		for(Consumar list : Addr) {
			System.out.println(list);
		}
	}

	}
}
