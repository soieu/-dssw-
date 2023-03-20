package ch20.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Msexam {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. DB 접속
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test",
					"testuser",
					"test1234"
					);
			//3. statement 객체 생성
			stmt = conn.createStatement();
			
			
//			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 4. sql 실행(처리)
			//select -> executeQuery
			//insert/update/delete => executeUpdate
			
			String sql = "SELECT * FROM student";
			rs = stmt.executeQuery(sql);
			
			//5. 결과처리
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			System.out.println("연결 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//해지는 역순으로 ~ 요즘은 상관없대..
			if(rs != null) {try {rs.close();System.out.println("연결 끊기");} catch (SQLException e) {}
			if(stmt != null) {try {stmt.close();System.out.println("연결 끊기");} catch (SQLException e) {}}
			if(conn != null) {try {conn.close();System.out.println("연결 끊기");} catch (SQLException e) {}}
			}
		}

	}

}
