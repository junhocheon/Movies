package movie;


import java.sql.Connection;
import java.util.ArrayList;

public class Consumarinfo {
   DBUtil db = new DBUtil();
   public void Consumerinfo() {
      ArrayList<Consumar> Addr = new ArrayList<>();

      try {
         Connection conn = db.getConnection();
         db.stmt = conn.createStatement();
         String sql1 = "use consumerinfo";
         db.stmt.executeUpdate(sql1);

         String sql = "select * from Bookingstatus";
         db.rs = db.stmt.executeQuery(sql);

         while (db.rs.next()) {
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
            String ts = db.rs.getString("TicketStatus");

            Consumar addr = new Consumar(Id, infoname, Pnum, sn, mt, hall, seatn, nOp, oT, pM, ts);
            Addr.add(addr);
         }

      } catch (Exception e) {
         e.printStackTrace();

      }
      for (Consumar list : Addr) {
         System.out.println(list);
      }
   }
}