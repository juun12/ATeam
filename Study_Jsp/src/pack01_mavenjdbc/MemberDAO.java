package pack01_mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//데이터베이스와 연동하여 데이터를 가지고오고 보내고, 전송을 할수있는 클래스
//1.연결 , 2.전송(파라메터도 전송) => 3.결과(List구조의 결과,Resultset) 
public class MemberDAO {
	int student_no = 99;
	private Connection con;//DB와 연결 (전송로)을 하는 연결객체
	private PreparedStatement ps ;//전송로를 통해서 어떠한 데이터를 주거나 받는 전송객체
								  //Update,Delete,Insert
	private ResultSet rs;		  //Select결과를 받는 객체 (결과객체)
	//ojdbc8
	//을 가져온이유 <- lib oracle.jdbc.driver.OracleDriver <- 이용
	public void getConn() {
		//DB접속 정보가 필요함 ,url , userName , password
		String url = "jdbc:oracle:thin:@125.136.151.206:1521:XE";
		String user = "javatest";
		String password = "0000"; 
		
		//동적 클래스 로딩이 필요함.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.setLoginTimeout(3);
			con = DriverManager.getConnection(url, user, password);

//			if(!con.isClosed()) {
//				System.out.println("열림");
//				ps = con.prepareStatement(
//						"select 1 as num from dual "
//						);
//				rs =ps.executeQuery();//전송객체가 DB에서 sql을 실행하고 결과를 가지고옴.
//				while(rs.next()) {
//					System.out.println(rs.getInt("num"));
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//1.Connection 전송로 만들고 2.전송로 통해서 ps 가 데이터를 이동시키는 처리
	//이동이 완료되면(ps) 3.그 결과를 rs가 받는다.
	
	//db연결을 닫을때는 Db를 사용할때의 역순으로 닫아주면 된다.
	//수도파이프 -> 물이이동-> 수도꼭지 돌림
	//수도꼭지돌림->물이동멈춤->수도파이프에 물이 안흐름
	public void dbClose() {
		try {//null.close();
			if(rs != null) { rs.close(); }
			if(ps != null) { ps.close();}
			if(con != null) { con.close();}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String rtnStr(String msg) {
		//공백문자를 제거하고 한글자 이상 입력했는지 체크.
		//3글자 이상 입력했는지 체크
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(msg);
			String inputData = sc.nextLine();
			if(inputData.trim().length() > 0) {
				return inputData;
			}
		}//무한 반복문 아래 코드는 실행될수가없다 , break가 없다면
		//그래서 나는 오류.
	}
	
	public void memberJoin() {
		//아이디 중복 확인 메소드가 필요함.
		
		String user_id = "";
		while(true) {
			 user_id = rtnStr("아이디를 입력하세요.(1글자 이상)");
			if(!idCheck(user_id)) {
				System.out.println("아이디가 중복 되었습니다.");
			}else {
				break;
			}
		}
		String user_pw =  rtnStr("비밀번호를 입력하세요.(1글자 이상)");
		String firstname = rtnStr("성을 입력하세요.(1글자 이상)");
		String lastname =  rtnStr("이름 입력하세요.(1글자 이상)");
		//1.연결객체 2.전송객체 3.select(ResultSet으로 받을 필요가 x)
		String sql = "INSERT INTO user_tbl ( STUDENT_NO, USER_ID, USER_PW, FIRSTNAME, LASTNAME) " + 
				"        VALUES       (?, ? , ? , ? , ? ) ";
		getConn();//연결이 됨.!
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, student_no);
			ps.setString(2, user_id);
			ps.setString(3, user_pw);
			ps.setString(4, firstname);
			ps.setString(5, lastname);
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*STUDENT_NO	NUMBER		int
		USER_ID	VARCHAR2(50 BYTE)	String
		USER_PW	VARCHAR2(50 BYTE)	String
		FIRSTNAME	VARCHAR2(50 BYTE)	String
		LASTNAME	VARCHAR2(50 BYTE)	String */	
	}
	// 1 , 0 || true , false , "OK" , "NG" , 1.1 , 1.2?
	public boolean idCheck(String id) {
		//1.연결 객체가 필요함.
		getConn();
		String sql = "select count(*) cnt " + 
					 	"from user_tbl " + 
				"where STUDENT_NO = 99 " + 
				"AND user_id = ? ";//? == 오라클 문장 String 에 파라메터 추가하기
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , id);
			rs = ps.executeQuery();//쿼리 실행한 결과를 받아주기.
			while(rs.next()) {
				if(rs.getInt("cnt") == 1) {
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		return true;
	}

	public MemberDTO login(String id , String pw) {
		MemberDTO dto = null;
		//1.연결 2.전송 3.결과
		getConn();//1.끝
		String sql = "select * " + 
				"from user_tbl " + 
				"where student_no = ? " + 
				"and USER_ID = ? " + 
				"and USER_PW = ? " ;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, student_no);
			ps.setString(2, id);
			ps.setString(3, pw);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new MemberDTO(student_no
						, rs.getString("user_id")
						, rs.getString("user_pw")
						, rs.getString("firstname")
						, rs.getString("lastname")
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		
		return dto;
	}

	public void updateMember(MemberDTO dto) {
		//1.연결 2.전송 3.결과(select일때는 rs 그외에는 int로 받으면됨)
		getConn();
		String sql = "update user_tbl SET user_pw = 'aaa' , firstname = 'ff' , lastname = 'll', update_ymd = sysdate " + 
				"where STUDENT_NO = 99 and user_id = 'id'  ";
		try {
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
}
