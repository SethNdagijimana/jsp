package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta name=\"author\" content=\"\" />\n");
      out.write("<title>Welcome to Your Dashboard</title>\n");
      out.write("\n");
      out.write("<link href=\"css/index-styles.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\">\n");
      out.write("  <nav class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\" id=\"mainNav\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\t<a class=\"navbar-brand\" href=\"#page-top\">Web Tech</a>\n");
      out.write("\t<button class=\"navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded\"\n");
      out.write("\t\t\t\ttype=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\"\n");
      out.write("\t\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\tMenu <i class=\"fas fa-bars\"></i>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("\t  <ul class=\"navbar-nav ms-auto\">\n");
      out.write("\t\t<li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"#portfolio\">course</a></li>\n");
      out.write("\t\t<li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"#about\">About</a></li>\n");
      out.write("\t\t<li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"#contact\">Contact</a></li> \n");
      out.write("                <li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"\">Logout</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t  </ul>\n");
      out.write("\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<!-- Masthead-->\n");
      out.write("\t<header class=\"masthead bg-primary text-white text-center\">\n");
      out.write("\t\t<div class=\"container d-flex align-items-center flex-column\">\n");
      out.write("\n");
      out.write("                    <img class=\"masthead-avatar mb-5\" src=\"assets/img/avataaars.svg\"\n");
      out.write("\t\t\t\talt=\"...\" />\n");
      out.write("\n");
      out.write("\t\t\t<h1 class=\"masthead-heading text-uppercase mb-0\">Welcome Web Tech </h1>\n");
      out.write("\t\t\t<!-- Icon Divider-->\n");
      out.write("\t\t\t<div class=\"divider-custom divider-light\">\n");
      out.write("\t\t\t\t<div class=\"divider-custom-line\"></div>\n");
      out.write("\t\t\t\t<div class=\"divider-custom-icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-star\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"divider-custom-line\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<p class=\"masthead-subheading font-weight-light mb-0\">Java\n");
      out.write("\t\t\t\tDevelopment - Web Development - jsp</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- Portfolio Section-->\n");
      out.write("\t<section class=\"page-section portfolio\" id=\"portfolio\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Portfolio Section Heading-->\n");
      out.write("\t\t\t<h2\n");
      out.write("\t\t\t\tclass=\"page-section-heading text-center text-uppercase text-secondary mb-0\">course</h2>\n");
      out.write("\t\t\t<!-- Icon Divider-->\n");
      out.write("\t\t\t<div class=\"divider-custom\">\n");
      out.write("\t\t\t\t<div class=\"divider-custom-line\"></div>\n");
      out.write("\t\t\t\t<div class=\"divider-custom-icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-star\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"divider-custom-line\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- Portfolio Grid Items-->\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t<!-- Portfolio Item 1-->\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-lg-4 mb-5\">\n");
      out.write("\t\t\t\t\t<div class=\"portfolio-item mx-auto\" data-bs-toggle=\"modal\"\n");
      out.write("\t\t\t\t\t\tdata-bs-target=\"#portfolioModal1\">\n");
      out.write("\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\tclass=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\n");
      out.write("\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"portfolio-item-caption-content text-center text-white\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-plus fa-3x\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<img class=\"img-fluid\" src=\"assets/img/portfolio/cabin.png\"\n");
      out.write("\t\t\t\t\t\t\talt=\"...\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
