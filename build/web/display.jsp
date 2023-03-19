
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.stud.dao.StudentJspDao"%>
<%@page import="com.stud.model.StudentJspModel"%>
<link href="./css/table.css" rel="stylesheet" type="text/css"/>
<%@include file="registration.jsp" %>
<div class="wrapper">
    <div class="table">
        <div class="row header blue">
           
            <div class="cell">
                First Name
            </div>
            <div class="cell">
                email
            </div>
             <div class="cell">
                gender
            </div>
             <div class="cell">
                age
            </div>
             <div class="cell">
                contact
            </div>
            <div class="cell">
                Action
            </div>
        </div>
        
  <%
            List<StudentJspModel> students = new ArrayList<StudentJspModel>();
//            StudentServiceInterface studService = new StudentService();
               StudentJspDao studService = new StudentJspDao();
//            students = studService.getStudents();
                 students= studService.findAll();
//            for (Student student : students) {
              for (StudentJspModel student : students){
        %>
        
        <div class="row">
            <div class="cell" data-title="fullName">
                <%--<%=student.getRegNo()%>--%>
                <%=student.getFullname() %>
            </div>
            <div class="cell" data-title="email">
                <%--<%=student.getFistName()%>--%>
                <%=student.getEmail() %>
            </div>
            <div class="cell" data-title="gender">
                <%--<%=student.getLastName()%>--%>
                <%=student.getGender() %>
            </div>
            <div class="cell" data-title="age">
                <%--<%=student.getDob()%>--%>
                <%=student.getAge() %>
            </div>
             <div class="cell" data-title="contact">
                <%--<%=student.getDob()%>--%>
                <%=student.getContact() %>
            </div>
           
            <div class="cell" data-title="Action">
                <a href="editStudent.jsp?regNo=<%=student.getEmail()%>&action=Update">Edit</a>
                <a href="editStudent.jsp?regNo=<%=student.getEmail()%>&action=Delete">Delete</a>

            </div>
        </div>
        <%}%>
    </div>
</div>


