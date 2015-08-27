package practice.servletjsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.servletjsp.beans.QuickQuestionBean;

/**
 * Servlet implementation class RequestOne
 */
public class RequestOne extends HttpServlet {
	
	//private static Logger log = Logger.getLogger(QuickQuestionServlet.class);
	//private static final String PAGE_TITLE = "Resume Review Q&A Confirmation";
	private static final String FORWARD_PAGE = "/jsp/confirm.jsp";
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Here I am Inside doPost method");
		QuickQuestionBean quickQuestionBean = new QuickQuestionBean();
		quickQuestionBean = (QuickQuestionBean) request.getAttribute("quickQuestionBean");
		System.out.println("quickQuestionBean: " + quickQuestionBean);
		String stud_fname = quickQuestionBean.getStud_fname();
		String stud_lname = quickQuestionBean.getStud_lname();
		String day_phone = quickQuestionBean.getDay_phone();
		String evening_phone = quickQuestionBean.getEvening_phone();
		String question = quickQuestionBean.getQuestion();
		String stud_email = quickQuestionBean.getStud_email();

		System.out.println("Student Firstname : " + stud_fname);
		System.out.println("Student Lastname : " + stud_lname);
		System.out.println("Day Phone : " + day_phone);
		System.out.println("Evening Phone : " + evening_phone);
		System.out.println("Question : " + question);
		System.out.println("Student Email : " + stud_email);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(FORWARD_PAGE);
		dispatcher.forward(request, response); 
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Here I am Inside doPost method");
	}
}
