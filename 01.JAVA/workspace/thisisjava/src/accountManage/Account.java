package accountManage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Account {
	private String account_number;
	private int account_balance;
	private String account_master;
	
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	
	
	public int getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}
	
	
	public String getAccount_master() {
		return account_master;
	}
	public void setAccount_master(String account_master) {
		this.account_master = account_master;
	}
	
	public void setAccount(String account_number, int account_balance, String account_master)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		int r = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bank",
					"root",
					"root1234"
					);
			
			String sql = "INSERT INTO account (account_number, account_balance, account_master) VALUES(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, account_number);
			pstmt.setInt(2, account_balance);
			pstmt.setString(3, account_master);
			
			r = pstmt.executeUpdate();
			
			if(r>0) System.out.println("���: ���°� �����Ǿ����ϴ�.");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//������ �������� ~ ������ �������..
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {}}
		}

	}

	public void printAccount() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. DB ����
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bank",
					"root",
					"root1234"
					);
			//3. statement ��ü ����
			stmt = conn.createStatement();
			
			
//			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 4. sql ����(ó��)
			//select -> executeQuery
			//insert/update/delete => executeUpdate
			
			String sql = "SELECT * FROM account";
			rs = stmt.executeQuery(sql);
			
			//5. ���ó��
			while(rs.next()) {
				System.out.print(rs.getString("account_number") + "\t");
				System.out.print(rs.getString("account_balance") + "\t");
				System.out.print(rs.getString("account_master") + "\n");
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//������ �������� ~ ������ �������..
			if(rs != null) {try {rs.close();} catch (SQLException e) {}
			if(stmt != null) {try {stmt.close();} catch (SQLException e) {}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {}}
			}
		}
	}
	
	public void plusAccount(String account_number, int account_balance) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int r = 0;
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. DB ����
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bank",
					"root",
					"root1234"
					);
			//3. statement ��ü ����
			String sql = "UPDATE account SET account_balance =account_balance + ? WHERE account_number = ?";
			pstmt = conn.prepareStatement(sql);
			
			
//			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 4. sql ����(ó��)
			//select -> executeQuery
			//insert/update/delete => executeUpdate
			
			pstmt.setInt(1, account_balance);
			pstmt.setString(2, account_number);
			r = pstmt.executeUpdate();
			//5. ���ó��
			if(r>0) System.out.println("���������� ��ϵǾ����ϴ�.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//������ �������� ~ ������ �������..
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {}}
			}
		}
	

	public void minusAccount(String account_number, int account_balance) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int r = 0;
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. DB ����
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bank",
					"root",
					"root1234"
					);
			//3. statement ��ü ����
			String sql = "UPDATE account SET account_balance = account_balance - ? WHERE account_number = ?";
			pstmt = conn.prepareStatement(sql);
			
			
//			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 4. sql ����(ó��)
			//select -> executeQuery
			//insert/update/delete => executeUpdate
			
			pstmt.setInt(1, account_balance);
			pstmt.setString(2, account_number);
			r = pstmt.executeUpdate();
			//5. ���ó��
			if(r>0) System.out.println("���������� ��ϵǾ����ϴ�.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//������ �������� ~ ������ �������..
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {}}
			}
	}

}
