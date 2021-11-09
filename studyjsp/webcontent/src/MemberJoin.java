

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanul.member.MemberDTO;
import com.sun.xml.internal.bind.v2.runtime.Name;

/**
 * Servlet implementation class MemberJoin
 */
@WebServlet("/memberJoin.do")
public class MemberJoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트 요청을 받는다: 매개변수를 가져온다😍🤢 ->HttpServletRequest
		request.setCharacterEncoding("utf-8");
String name =request.getParameter("name");
String id =request.getParameter("id");
String pw =request.getParameter("pw");
	int age =Integer.parseInt(request.getParameter("age"));
String addr = request.getParameter("addr");
System.out.println("이름:"+name);
System.out.println("아이디:"+id);
System.out.println("비밀번호:"+pw);
System.out.println("나이:"+age);
System.out.println("주소:"+addr);
	MemberDTO dto= new MemberDTO(name,id,pw,age,addr);
	request.setAttribute("dto", dto);
	RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
	rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
