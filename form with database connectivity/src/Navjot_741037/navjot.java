package Navjot_741037;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/navjot")
public class navjot extends HttpServlet {
private static final long serialVersionUID = 1L;
public navjot() {
super();
// TODO Auto-generated constructor stub
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String fn=request.getParameter("fname");
String ln=request.getParameter("lname");
String date=request.getParameter("dob");
String gn=request.getParameter("gen");
String emailid=request.getParameter("email");
String mobile=request.getParameter("mob");
String address1=request.getParameter("stad");
String address2=request.getParameter("stad2");
String city=request.getParameter("city");
String state=request.getParameter("province");
String postal=request.getParameter("zip");
String social=request.getParameter("sin");
String availability=request.getParameter("ava");


try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","Navjot","Navjot_741037");
PreparedStatement ps=con.prepareStatement(

"insert into employee (firstname,lastname,dateofbirth,gender,mobile,email,address,address2,city,state,"
+"postal,sin,availability) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
ps.setString(1,fn);
ps.setString(2,ln);
ps.setString(3,date);
ps.setString(4,gn);
ps.setString(5,emailid);
ps.setString(6,mobile);
ps.setString(7,address1);
ps.setString(8,address2);
ps.setString(9,city);
ps.setString(10,state);
ps.setString(11,postal);
ps.setString(12,social);
ps.setString(13,availability);

int i=ps.executeUpdate();
if(i>0)
out.print("You are successfully registered...");
}catch (Exception e2) {System.out.println(e2);}
out.close();
}
}