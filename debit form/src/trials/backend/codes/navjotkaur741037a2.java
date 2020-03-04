package trials.backend.codes;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/navjotkaur741037a2")
public class navjotkaur741037a2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public navjotkaur741037a2 () {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        
        
        String title=request.getParameter("mr");
        String fn=request.getParameter("firstName");
        String mn=request.getParameter("middleName"); 
        String ln=request.getParameter("lastName"); 
        String gender=request.getParameter("gen");
        String dateBirth=request.getParameter("db");
        String address1=request.getParameter("stad");
        String address2=request.getParameter("stad2");
        String ct=request.getParameter("city");
        String pr=request.getParameter("province");
        String postalCode=request.getParameter("zip");
        String areacode=request.getParameter("area");	
        String phone=request.getParameter("phn");	
        String em=request.getParameter("email");
        String account=request.getParameter("accnt"); 
        String brcd = request.getParameter("bcode");
        String date = request.getParameter("da");
			
        out.println("<h1>The Debit Application Form</h1>");
		out.println("<table>");
		out.println("<tr><td> title :</td><td>"+title+"</td></tr>");
		out.println("<tr><td>First Name :</td><td>"+fn+"</td></tr>");
		out.println("<tr><td>Middle Name    :</td><td>"+mn+"</td></tr>");
		out.println("<tr><td>Last Name    :</td><td>"+ln+"</td></tr>");
		out.println("<tr><td>Gender  :</td><td>"+gender+"</td></tr>");
		out.println("<tr><td>Date of Birth   :</td><td>"+dateBirth+"</td></tr>");
		out.println("<tr><td>Street Address   :</td><td>"+address1+"</td></tr>");
		out.println("<tr><td>Street Address (Line 2)    :</td><td>"+address2+"</td></tr>");
		out.println("<tr><td>City    :</td><td>"+ct+"</td></tr>");
		out.println("<tr><td>State/Province    :</td><td>"+pr+"</td></tr>");
		out.println("<tr><td>Postal Code    :</td><td>"+postalCode+"</td></tr>");
		out.println("<tr><td>Phone   :</td><td>"+areacode+"-"+phone+"</td></tr>");
		out.println("<tr><td>Email   :</td><td>"+em+"</td></tr>");
		out.println("<tr><td>Type of Account    :</td><td>"+account+"</td></tr>");
		out.println("<tr><td>Branch Code  :</td><td>"+brcd+"</td></tr>");
		out.println("<tr><td>date   :</td><td>"+date+"</td></tr>");
		out.println("</table>");
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
