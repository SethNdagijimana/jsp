<%@page import="com.stud.model.StudentJspModel"%>
<%@page import="com.sms.service.StudentService"%>
<%@page import="com.sms.service.StudentServiceInterface" %>
<jsp:useBean id="studBean" class="com.sms.beans.StudentBean" scope="request" />
<%
//        studBean.setRegNo(request.getParameter("regNo"));
          studBean.setEmail(request.getParameter("email"));
          
        String action = request.getParameter("action");
        StudentServiceInterface stud = new StudentService();
        StudentJspModel student= stud.getStudent(studBean.getEmail());
        studBean.setFullname(student.getFullname());
        studBean.setEmail(student.getEmail());
        studBean.setGender(student.getGender());
        studBean.setAge(student.getAge());
        studBean.setContact(student.getContact());
//        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        studBean.setDob(formatter.format(student.getDob()));
        request.setAttribute("action", action);
        request.getRequestDispatcher("registration.jsp").forward(request, response);
    
%>