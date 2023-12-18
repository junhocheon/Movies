package movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieSQL {
	DBUtil db = new DBUtil();
	Scanner sc = new Scanner(System.in);

	public void MovieList(String mvname) {

		String sql = "delete FROM MOVIES WHERE  movieSerialNumber = ?";
		try {
			Connection conn = db.getConnection();
			db.stmt = conn.createStatement();
			String sql1 = "use CINEMAMANAGEMENT";
			db.stmt.executeUpdate(sql1); // insert delete update

			// select resultSet
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mvname);
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("DB작업중 문제 발생: " + e.getMessage());
			e.printStackTrace(); // 예외 상세 정보 출력
		}
		System.out.println("삭제 완료");
	}

	public void DelMovieList() {
		ArrayList<Movies> Addr = new ArrayList<>();
		ArrayList<Movies> All = new ArrayList<>();
		try {
			Connection conn = db.getConnection();
			db.stmt = conn.createStatement();
			String sql1 = "use cinemamanagement";
			db.stmt.executeUpdate(sql1);

			String sql = "select * from movies";
			db.rs = db.stmt.executeQuery(sql);

			while (db.rs.next()) {
				String name = db.rs.getString("MovieTitle");
				String serial = db.rs.getString("MovieSerialNumber");
				String gerne = db.rs.getString("Genre");
				String re = db.rs.getString("ReleaseDate");
				String wd = db.rs.getString("WithdrawDate");
				String ss = db.rs.getString("ScreeningStatus");

				Movies mov = new Movies(name, serial, re, wd, gerne, ss);
				Addr.add(mov);

			}

		} catch (Exception e) {
		}

		for (Movies list : Addr) {
			System.out.println(list);
		}
		System.out.println("삭제 메뉴는 1번 돌아가기는 2번");
		int a = Integer.parseInt(sc.nextLine());
		if (a == 1) {
			System.out.println("삭제 하실 영화명 입력해 주세요");
			String ss = sc.nextLine();
			for (Movies list : Addr)
				if (list.MVname.toLowerCase().equals(ss.toLowerCase())) {
					ss = list.MVserial;
					MovieList(ss);
					break;
				} else {
					System.out.println("잘못된 영화명 입니다");
					break;
				}
		} else if (a == 2) {
		} else {
			System.out.println("잘못된 입력 입니다");
		}
	}

}
