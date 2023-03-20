package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExam {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int r = 0;
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB 접속
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"testuser",
					"test1234"
					);
			//3. statement 객체 생성
			String sql = "INSERT INTO emp_ex (empno, ename, salary) VALUES(emp_ex_seq.nextval,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "바보");
			pstmt.setInt(2, 1000);
			
			
//			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 4. sql 실행(처리)
			//select -> executeQuery
			//insert/update/delete => executeUpdate
			
			r = pstmt.executeUpdate();
			//5. 결과처리
			
			if(r>0) System.out.println("정상적으로 등록되었습니다.");
			
			System.out.println("연결 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//해지는 역순으로 ~ 요즘은 상관없대..
			if(pstmt != null) {try {pstmt.close();System.out.println("연결 끊기");} catch (SQLException e) {}}
			if(conn != null) {try {conn.close();System.out.println("연결 끊기");} catch (SQLException e) {}}
		}
	}

}

