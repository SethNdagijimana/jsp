<%@page import="com.stud.model.StudentJspModel"%>
<%@page import="com.sms.service.StudentService"%>
<%@page import="com.sms.service.StudentServiceInterface" %>
<jsp:useBean id="studBean" class="com.sms.beans.StudentBean" scope="request" />
<%
    try {
        StudentJspModel student = new StudentJspModel();
        student.setFullname(request.getParameter("name"));
        student.setEmail(request.getParameter("email"));
        student.setGender(request.getParameter("gender"));
        student.setAge(request.getParameter("age"));
        student.setContact(request.getParameter("contact"));


        StudentServiceInterface stud = new StudentService();

        if (request.getParameter("action").equals("Update")) {
            stud.updateStudent(student);
            studBean.setInfoMessage("Updated successfully!");
        } else if (request.getParameter("action").equals("Delete")) {
            stud.deleteStudent(student);
            studBean.setInfoMessage("Deleted successfully!");
        }else if (request.getParameter("action").equals("find")){
            stud.getStudents();
            studBean.setInfoMessage("studentFound");
        }
        else {
            stud.saveStudent(student);
            studBean.setInfoMessage("Saved successfully!");
        }
        studBean.clear();
        studBean.setErrorMessage("");
        request.getRequestDispatcher("registration.jsp").forward(request, response);
    } catch (Exception ex) {
        studBean.setErrorMessage("Error! Check student issue.");
        studBean.setInfoMessage("");
        request.getRequestDispatcher("registration.jsp").forward(request, response);
    }
%>