package com.Mini;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddMemberController
 */
@WebServlet("/AddMemberController")
public class AddMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dob=request.getParameter("dob");
		String city=request.getParameter("city");
		
		Member m =new Member();
		m.setId(id);
		m.setFname(fname);
		m.setLname(lname);
		m.setDob(dob);
		m.setCity(city);
		
		MemberDao memberDao=new MemberDao();
		String result=memberDao.addMember(m);
		
		if(result.equals(Results.SUCCESS))
		{
			session.setAttribute("fname",m.getFname());
			session.setAttribute("lname",m.getLname());
			RequestDispatcher rd=request.getRequestDispatcher("/memberSuccess.jsp");
			rd.forward(request, response);
		}
		
	}

}
