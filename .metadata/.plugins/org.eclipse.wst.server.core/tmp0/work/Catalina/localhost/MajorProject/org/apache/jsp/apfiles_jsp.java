/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2020-03-28 14:45:29 UTC
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

public final class apfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<div   style=\"background-color:#3e4444; padding-top: 10px; padding-left: 0px;\">\r\n");
      out.write("\t\t<div id=\"header\" class=\"container\">\r\n");
      out.write("\t\t\t<div id=\"logo\" style=\"width: 650px; height: 100%; top: 0em;\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"font-size: 30px;\">A Network Coding and DES\r\n");
      out.write("\t\t\t\t\t\tBased Dynamic Encryption Scheme for Moving Target Defense</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"uhome.jsp\" accesskey=\"1\" title=\"\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"search.jsp\" accesskey=\"2\" title=\"\">Search</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"apfiles.jsp\" accesskey=\"3\"\r\n");
      out.write("\t\t\t\t\t\ttitle=\"\">Requested Files</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"logout.jsp\" accesskey=\"5\" title=\"\">Logout</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"banner\" class=\"container\" style=\"padding-top: 100px;\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Request Files</h2>\r\n");
      out.write("\t\t\t\t");

					session = request.getSession(false);
					String sql = "select fid from keyrequest where userid='"+session.getAttribute("uid")+"' and status1='Approved'";
					List<String> lt = Dao.getFid(sql);
					Iterator<String> itr = lt.iterator();
				
      out.write("\r\n");
      out.write("\t\t\t\t<table style=\"width: 1150px; padding-left: 150px;\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">FID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">Key1</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">Key2</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">Key3</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">Key4</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"color: white;\">Download</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t");

						while(itr.hasNext()){
								String fid = itr.next();
								sql = "select * from ukeys where fid='"+fid+"' and userid='"+session.getAttribute("uid")+"'";
								if(Dao.getData(sql) == true){
								sql = "select * from ukeys where fid='"+fid+"'";
								List<String> lt1 = Dao.getUKeys(sql);
								Iterator<String> itr1 = lt1.iterator();
								while(itr1.hasNext()){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(fid);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"download.jsp?fid=");
      out.print(fid);
      out.write("\" class=\"actions\">Download</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t");

								}
						}else{
							System.out.println("hilal");
							sql = "select * from data where fid='"+fid+"'";
							List<String> lt1 = Dao.getKeys(sql);
							Iterator<String> itr1 = lt1.iterator();
							while(itr1.hasNext()){
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(fid);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(itr1.next());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><a href=\"download.jsp?fid=");
      out.print(fid);
      out.write("\" class=\"actions\">Download</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
						}
								}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"three-column\" class=\"container\" style=\"text-align:justify;text-align-last: center;\">\r\n");
      out.write("\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t<h2><b>DESIGN OF THE DYNAMIC ENCRYPTION SCHEME </b></h2>\r\n");
      out.write("\t\t\t<span class=\"byline\">The basic procedures of the proposed encryption scheme</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"boxA\">\r\n");
      out.write("\t\t\t<p> In this step, the plain-text is converted to a \r\n");
      out.write("binary intermediate sequence z1 based on a high-dimensional binary invertible matrix generated by the concept of NC. The main purpose of this step is to extend the key space of the algorithm, so as to resist the exhaustive attack.  </p>\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"button button-alt\"> Inner-Layer Encryption Embedding NC</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"boxB\">\r\n");
      out.write("\t\t\t<p> The middle layer encryption step adopts DES to encode intermediate sequence z1, and get another intermediate sequence z2. The main purpose of this step to bring non-linearity into the encryption scheme, and hence to effectively defense the analysis attack. </p>\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"button button-alt\" style=\"margin-left:25px;\" >Middle-Layer DES Encryption</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"boxC\"  >\r\n");
      out.write("\t\t\t<p> In this, NC is adopted again to generate a low-dimensional binary invertible matrix  to encode intermediate sequence z2, and the cipher-text is subsequently obtained. The purpose is to construct the triple encryption model to resist the man-in-the-middle attack. </p>\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"button button-alt\" style = \"margin-top:4px\" >Outer-Layer Encryption Embedding NC</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"boxD\" style=\"padding-left:400px; padding-top:270px; width:400px\">\r\n");
      out.write("\t\t\t<p>The dynamic update procedure to the ciphertext can be regarded as a rerun of step (c) based on a new binary encoding matrix. It is particularly designed to realize dynamic security protection. The flexibility to choose the new binary encoding matrix endows a tradeoff between efficiency and security, which enhances the adaptability to different application scenarios. </p>\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"button button-alt\">Dynamic Update of the Ciphertext</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"welcome\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t<h2>GENERAL DESCRIPTION</h2>\r\n");
      out.write("\t\t\t<p style=\" font-size:18px;\"> <strong>Index Terms:</strong> Moving target defense, dynamic defense theory, cyber security, linear network coding, DES.</p>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<p style=\"text-align:justify;text-align-last: center; font-weight:;\"> <strong> Abstract:</strong> Unlike prior efforts in cybersecurity research, a dynamic defense theory, called moving target defense (MTD), increases the complexity and costs for attacks by effectively restricting the vulnerability exposure and the attack opportunities through various continually-changing evaluation, development mechanisms and strategy. Data Encryption Standard (DES) was the classical scheme of the traditional symmetric-key encryption schemes. In this paper, we propose a dynamic 3-layer encryption scheme based on DES and network coding, with a low-complexity partial key update mechanism. Based on the theoretical analysis, the new scheme is shown to have the benefit to achieve a dynamic transition between efficiency and security, which increases its adaptability to various cyber conditions. The simulation results also show that the running ratio of the new scheme is relatively lower than or comparable to the triple DES.\r\n");
      out.write("\t</p>\r\n");
      out.write("\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t<li><a href=\"#\" class=\"button\">MORE..</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"copyright\" class=\"container\">\r\n");
      out.write("\t<p> &copy; All rights reserved | Designed by DCET 2020.</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
