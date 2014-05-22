package jp.co.jjs.java_seminer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OmikujiServlet
 */
@WebServlet("/OmikujiServlet")
public class OmikujiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public OmikujiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String omikujiParam = request.getParameter("omikuji");

        PrintWriter out = response.getWriter();


        long num = Math.round(Math.random()*11);

        if (num == 10) {
            omikujiParam = "大吉";
            request.setAttribute("omikuji", omikujiParam);

        } else if (num >= 7) {
            omikujiParam = "吉";
            request.setAttribute("omikuji", omikujiParam);

        } else if (num >= 5) {
            omikujiParam = "中吉";
            request.setAttribute("omikuji", omikujiParam);

        } else if (num >= 3) {
            omikujiParam = "小吉";
            request.setAttribute("omikuji", omikujiParam);

        }else {
            omikujiParam = "凶";
            request.setAttribute("omikuji", omikujiParam);
        }

        RequestDispatcher dispacher = request.getRequestDispatcher("omikuji.jsp");
        dispacher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");


        String omikujiParam = request.getParameter("omikuji");

        PrintWriter out = response.getWriter();

        long num = Math.round(Math.random()*11);

        if (num == 10) {
            omikujiParam = "大吉";
            request.setAttribute("omikuji", omikujiParam);

        } else if (num >= 7) {
            omikujiParam = "吉";
            request.setAttribute("omikuji", omikujiParam);

        } else if (num >= 5) {
            omikujiParam = "中吉";
            request.setAttribute("omikuji", omikujiParam);

        } else if (num >= 3) {
            omikujiParam = "小吉";
            request.setAttribute("omikuji", omikujiParam);

        }else {
            omikujiParam = "凶";
            request.setAttribute("omikuji", omikujiParam);
        }
        RequestDispatcher dispacher = request.getRequestDispatcher("omikuji.jsp");
        dispacher.forward(request, response);
	}

}
