package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Admission</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Font Icon -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Main css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Sign up form -->\r\n");
      out.write("\t\t<section class=\"signup\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"signup-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"signup-form\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"form-title\">Registration </h2>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<form method=\"\" action=\"\" class=\"register-form\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"register-form\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"name\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"zmdi zmdi-account material-icons-name\"></i></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"name\" id=\"name\" placeholder=\"Your Name\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"email\" name=\"email\" id=\"email\" placeholder=\"Your Email\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"pass\"><i class=\"zmdi zmdi-gender\"></i></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"gender\" id=\"pass\" placeholder=\"Your Gender\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"re-pass\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"re_pass\" id=\"re_pass\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Repeat your password\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"contact\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"contact\" id=\"contact\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Contact no\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"agree-term\" id=\"agree-term\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"agree-term\" /> <label for=\"agree-term\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label-agree-term\"><span><span></span></span>I\r\n");
      out.write("\t\t\t\t\t\t\t\t\tagree all statements in <a href=\"#\" class=\"term-service\">Terms\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tof service</a></label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"signup\" id=\"signup\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-submit\" value=\"Register\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- JS -->\r\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
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
