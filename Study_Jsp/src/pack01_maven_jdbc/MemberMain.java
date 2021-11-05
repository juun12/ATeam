package pack01_maven_jdbc;

public class MemberMain {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		dao.getConn();
	}
}
