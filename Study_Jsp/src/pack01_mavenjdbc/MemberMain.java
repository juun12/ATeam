package pack01_mavenjdbc;

public class MemberMain {
	public static void main(String[] args) {
		//프로그램 시작을 위한 Class
		MemberDAO dao = new MemberDAO();
		dao.getConn();
		//dao.memberJoin();
		String id = dao.rtnStr("아이디를 입력하세요.");
		String pw = dao.rtnStr("비밀번호를 입력하세요.");
		MemberDTO dto = null;
		dto = dao.login(id , pw); //로그인 성공시 new로 초기화한 dto가 return되고 
						   //그게 아니라면 null값이 그대로 return이 된다.
		dao.updateMember(dto);
		if(dto == null) {
			System.out.println("아이디 비밀번호를 확인하세요!!!.");
		}else {
			System.out.println(dto.getUser_id());
		}
		//회원가입 로직.
	}
}
