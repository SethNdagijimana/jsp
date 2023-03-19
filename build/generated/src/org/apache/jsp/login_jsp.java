package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("<title>Sign In </title>\r\n");
      out.write("\r\n");
      out.write("<!-- Font Icon -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Sing in  Form -->\r\n");
      out.write("\t\t<section class=\"sign-in\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"signin-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"signin-image\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/welcome2.jpg\" alt=\"sing up image\">\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"signup.jsp\" class=\"signup-image-link\">Create an\r\n");
      out.write("\t\t\t\t\t\t\taccount</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"signin-form\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"form-title\">Sign In</h2>\r\n");
      out.write("\t\t\t\t\t\t<form method=\"POST\" action=\"signin.jsp\" class=\"register-form\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"login-form\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"Email\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"zmdi zmdi-email material-icons-name\"></i></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"email\" name=\"email\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Your email\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"password\"><i class=\"zmdi zmdi-lock\"></i></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"password\" name=\"password\" id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Password\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"remember-me\" id=\"remember-me\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"agree-term\" /> <label for=\"remember-me\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label-agree-term\"><span><span></span></span>Remember\r\n");
      out.write("\t\t\t\t\t\t\t\t\tme</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"signin\" id=\"signin\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-submit\" value=\"Log in\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- JS -->\r\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
