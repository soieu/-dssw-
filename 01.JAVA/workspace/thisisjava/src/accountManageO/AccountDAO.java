package accountManageO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class AccountDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public AccountDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root1234");
		} catch (Exception e) {}
		
	}
	
	public int insert(AccountVO acc) {}
	public int delete(AccountVO acc) {}
	
	public List<AccountVO> selectAll() {
		public List<AccountVO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM account_number ORDER BY account_id DESC");
			AccountVO vo;
			
			while(rs.next()) {
				vo = new AccountVO(); // 항상 새로운 배열
				vo.setId(rs.getInt("account_id"));
				vo.setNumber(rs.getString("account_number"));
				vo.setMaster(rs.getString("account_master"));
				vo.setBalance(rs.getInt("account_balance"));
				list.add(vo);
			}
		}
	}
	
}
