/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2020-03-16 11:03:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import com.dao.Dao;
import java.util.List;

public final class fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<!--\r\n");
      out.write("Design by TEMPLATED\r\n");
      out.write("http://templated.co\r\n");
      out.write("Released for free under the Creative Commons Attribution License\r\n");
      out.write("\r\n");
      out.write("Name       : Assembly \r\n");
      out.write("Description: A two-column, fixed-width design with dark color scheme.\r\n");
      out.write("Version    : 1.0\r\n");
      out.write("Released   : 20140330\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Didact+Gothic\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"main.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 6]><link href=\"default_ie6.css\" rel=\"stylesheet\" type=\"text/css\" /><![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header-wrapper\" style=\"padding-top: 10px; padding-left: 0px;\">\r\n");
      out.write("\t\t<div id=\"header\" class=\"container\">\r\n");
      out.write("\t\t\t<div id=\"logo\" style=\"width: 600px; height: 100%; top: 0em;\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"font-size: 30px;\">A Network Coding and DES\r\n");
      out.write("\t\t\t\t\t\tBased Dynamic Encryption Scheme for Moving Target Defense</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"uhome.jsp\" accesskey=\"1\" title=\"\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"search.jsp\" accesskey=\"2\" title=\"\">Search</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"apfiles.jsp\" accesskey=\"3\" title=\"\">Requested Files</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"logout.jsp\" accesskey=\"5\" title=\"\">Logout</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"banner\" class=\"container\" style=\"padding-top: 100px;\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Files</h2>\r\n");
      out.write("\t\t\t\t");

					String fname = request.getParameter("sub");
					String sql = "select * from data where fname like '%"+fname+"%'"; 
					List<String> lt = Dao.getUFile(sql);
					Iterator<String> itr = lt.iterator();
				
      out.write("\r\n");
      out.write("\t\t\t\t<table style=\"width: 1150px; padding-left: 150px;\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">FID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">UserID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">FileName</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">Download</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">Key Request</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t");

						while(itr.hasNext()){
							String fid = itr.next();
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(fid);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(itr.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(itr.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"FDownload?fid=");
      out.print(fid);
      out.write("\" class=\"actions\">Download</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"KeyReq?fid=");
      out.print(fid);
      out.write("\" class=\"actions\">Request</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"three-column\" class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Feugiat lorem ipsum dolor sed veroeros</h2>\r\n");
      out.write("\t\t\t\t<span class=\"byline\">Donec leo, vivamus fermentum nibh in\r\n");
      out.write("\t\t\t\t\taugue praesent a lacus at urna congue</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"boxA\">\r\n");
      out.write("\t\t\t\t<p><b>OBJECTIVE:</b> \r\n");
      out.write("The object of this project is to protect the data owners information from attackers while it is moving in the network. By using 3 layer encryption the data will be protected in the network. In this the key updating mechanism will provide more security to the data\r\n");
      out.write("</p>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"button button-alt\">More Info</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"boxB\">\r\n");
      out.write("\t\t\t\t<p>Etiam neque. Vivamus consequat lorem at nisl. Nullam wisi a\r\n");
      out.write("\t\t\t\t\tsem semper eleifend. Donec mattis. Phasellus pellentesque, ante nec\r\n");
      out.write("\t\t\t\t\tiaculis dapibus, eros justo auctor lectus, a lobortis lorem mauris\r\n");
      out.write("\t\t\t\t\tquis nunc.</p>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"button button-alt\">More Info</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"boxC\">\r\n");
      out.write("\t\t\t\t<p>Aenean lectus lorem, imperdiet at, ultrices eget, ornare et,\r\n");
      out.write("\t\t\t\t\twisi. Pellentesque adipiscing purus. Phasellus pellentesque, ante\r\n");
      out.write("\t\t\t\t\tnec iaculis dapibus, eros justo auctor lectus, a lobortis lorem\r\n");
      out.write("\t\t\t\t\tmauris quis nunc.</p>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"button button-alt\">More Info</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"welcome\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Fusce ultrices fringilla metus</h2>\r\n");
      out.write("\t\t\t\t<span class=\"byline\">Donec leo, vivamus fermentum nibh in\r\n");
      out.write("\t\t\t\t\taugue praesent a lacus at urna congue</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tThis is <strong>Assembly</strong>, a free, fully standards-compliant\r\n");
      out.write("\t\t\t\tCSS template designed by <a href=\"http://templated.co\"\r\n");
      out.write("\t\t\t\t\trel=\"nofollow\">TEMPLATED</a>. The photos in this template are from\r\n");
      out.write("\t\t\t\t<a href=\"http://fotogrph.com/\"> Fotogrph</a>. This free template is\r\n");
      out.write("\t\t\t\treleased under the <a href=\"http://templated.co/license\">Creative\r\n");
      out.write("\t\t\t\t\tCommons Attribution</a> license, so you're pretty much free to do\r\n");
      out.write("\t\t\t\twhatever you want with it (even use it commercially) provided you\r\n");
      out.write("\t\t\t\tgive us credit for it. Have fun :)\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"button\">Etiam posuere</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"copyright\" class=\"container\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t&copy; Untitled. All rights reserved. | Photos by <a\r\n");
      out.write("\t\t\t\thref=\"http://fotogrph.com/\">Fotogrph</a> | Design by <a\r\n");
      out.write("\t\t\t\thref=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a>.\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
