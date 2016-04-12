package com.institute.controller;
import com.institute.dao.StudentDao;
import com.institute.models.students;
import com.institute.dao.CollegeDao;
import com.institute.models.officer;
import com.institute.models.Department;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.*;


public class LoginControllerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("student")){
		 String url = "/Login.jsp";
		 getServletContext().getRequestDispatcher(url).forward(request, response);
		}
		else if (action.equals("signup_page")){
			 String url = "/Signup.jsp";
			 getServletContext().getRequestDispatcher(url).forward(request, response);
			}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 String url = "";
				 HttpSession session = request.getSession();
				 String action = request.getParameter("action");
			 	  
				   	String emailid = request.getParameter("emailid");
				   	String password = request.getParameter("password");
				   	System.out.println(emailid);
				   	//students model=null;
				   	//officer model=null;
					 
	      if (action.equals("student")){
			
	    	   	students model = new students();
			   	StudentDao studentdao = new StudentDao();
			   	model = studentdao.check_for_email_password(emailid);

				  if(model != null){
				  if(emailid.equals(model.getEmailid())&& password.equals(model.getPassword())){
					  session.setAttribute("email", model.getEmailid());
					  url="/Home.jsp";
				  }
				  else if(emailid.equals(model.getEmailid())&& !password.equals(model.getPassword())){
					  request.setAttribute("errmessage", "*incorrect password");
					  request.setAttribute("given_email", emailid);
					  request.setAttribute("given_password", password);
					  url="/Login.jsp";
				  }
				}
				  else {
					  request.setAttribute("errmessage", "*incorrect credentials");
					  request.setAttribute("given_email", emailid);
					  request.setAttribute("given_password", password);
					  url="/Login.jsp";
				}
			
			       
			
	      } 
	      else if(action.equals("office")){
	    	  officer model = new officer();
	    	  CollegeDao collegedao = new CollegeDao();
	    	  model= collegedao.check_for_email_password_office(emailid);

			  if(model != null){
			  if(emailid.equals(model.getEmailid())&& password.equals(model.getPassword())){
				  session.setAttribute("email", model.getEmailid());
				  url="/Home.jsp";
			  }
			  else if(emailid.equals(model.getEmailid())&& !password.equals(model.getPassword())){
				  request.setAttribute("errmessage", "*incorrect password");
				  request.setAttribute("given_email", emailid);
				  request.setAttribute("given_password", password);
				  url="/Officer_login.jsp";
			  }
			}
			  else {
				  request.setAttribute("errmessage", "*incorrect credentials");
				  request.setAttribute("given_email", emailid);
				  request.setAttribute("given_password", password);
				  url="/Officer_login.jsp";
			}
		
		       
		
	      }
	      else{
	    	  Department model = new Department();
    	  CollegeDao collegedao = new CollegeDao();
    	  model = collegedao.check_for_email_password_department(emailid);

		  if(model != null){
		  if(emailid.equals(model.getEmailid())&& password.equals(model.getPassword())){
			  session.setAttribute("email", model.getEmailid());
			  url="/ApplicationForm.jsp";
		  }
		  else if(emailid.equals(model.getEmailid())&& !password.equals(model.getPassword())){
			  request.setAttribute("errmessage", "*incorrect password");
			  request.setAttribute("given_email", emailid);
			  request.setAttribute("given_password", password);
			  url="/Department_login.jsp";
		  }
		}
		  else {
			  request.setAttribute("errmessage", "*incorrect credentials");
			  request.setAttribute("given_email", emailid);
			  request.setAttribute("given_password", password);
			  url="/Department_login.jsp";
		}
  
      }
	      
		        getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}
}
