<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.stud.dao.StudentJspDao"%>
<%@page import="com.stud.model.StudentJspModel"%>
<%
    
    try{
        
        StudentJspModel student = new StudentJspModel();
        student.setEmail(request.getParameter("email"));
        student.setPassword(request.getParameter("password"));
        
        StudentJspDao studDao = new StudentJspDao();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
         StudentJspModel user = studDao.findStudentByEmail(email);
         Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jsp", "postgres", "19930");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM studentjspmodel WHERE email='" + email + "' AND password='" + password + "'");
    
    boolean redirect = false;
    String redirectPage = "signup.jsp";
    
    if (rs.next()) {
        if (rs.getString("email") != null && rs.getString("gender") != null && rs.getString("contact") != null && rs.getString("age") != null && rs.getString("password") != null) {
            redirect = true;
            redirectPage = "dashboard.jsp";
        }

        else {
            redirect = true;
            redirectPage = "registration.jsp";
        }
    }
    else {

        redirect = true;
        redirectPage = "login.jsp";
    }

    if (redirect) {
        response.sendRedirect(redirectPage);
    }
        
         if(user !=null && user.getEmail().equals(student.getEmail()) || user !=null && user.getPassword().equals(student.getPassword())){
             HttpSession sess = request.getSession();
             sess.setAttribute("email", user);
             response.sendRedirect("registration.jsp");
         }else{
             request.setAttribute("Error Message", "invalid email or password");
             RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
             rd.forward(request, response);
         }
    }catch(Exception ex){
        ex.printStackTrace();
    }

%>