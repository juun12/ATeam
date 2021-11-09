import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hs.do")	//Servlet Mapping 자동설정
public class HelloServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		//클라이언트 요청을 받는다. 매개변수를 가져온다 ->HttpServletRequest
		//2.비지니스 로직: DB와 연동하여 결과를 리턴한다. 별도의 클래스에 작성
		//3.프리젠테이션 로직 :결과를 응답(html,jsp) -> HttpServletResponse
		response.setContentType("text/html; charset=utf-8"); //MIME Type
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Response Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Welcome to Hello Servlet!</h3>");
		out.println("</body>");
		
		
		out.println("</html>");
	}//service()
}//class

