/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-02-08 01:42:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../home/top.jsp", out, false);
      out.write("\n");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${css}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/employee/register.css\" />\n");
      out.write("<div class=\"grid-item\" id=\"side_menu\">\n");
      out.write(" \t<h1><font style=\"font-size: 30px\">사원 등록</font></h1>\n");
      out.write("</div>\n");
      out.write(" <div>\n");
      out.write(" <form id=\"register_form\">\n");
      out.write("  <h1>사원정보</h1>\n");
      out.write("  <div class=\"rbox\">\n");
      out.write("   <b>매니저 <input type=\"text\" name=\"emag\" id=\"emag\"/></b>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"rbox\">\n");
      out.write("  <b>이 름 <input type=\"text\" name=\"ename\" id=\"ename\"/></b>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"rbox\">\n");
      out.write("  <b>생년월일 <input type=\"text\" name=\"ebd\" id=\"ebd\"/></b>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"rbox\">\n");
      out.write("  <b>포토 <input type=\"text\" name=\"ephoto\" id=\"ephoto\"/></b>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"rbox\">\n");
      out.write("    <b>상 세 <input type=\"text\" name=\"notes\" id=\"notes\"/> </b>   \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"selbox\">\n");
      out.write("    <input type=\"submit\" id=\"confirm_btn\"  value=\"등록\"/>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"selbox\">\n");
      out.write("    <input type=\"submit\" id=\"cancel_btn\" value=\"취소\"/>\n");
      out.write("  </div>\n");
      out.write("\t<input type=\"hidden\" name=\"cmd\" value=\"register\" />\n");
      out.write("\t<input type=\"hidden\" name=\"page\" value=\"access\" />\n");
      out.write("</form>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../home/bottom.jsp", out, false);
      out.write("\n");
      out.write("    <script>\n");
      out.write(" \t\t $('#confirm_btn').click(function(){\n");
      out.write(" \t\t\tvar emag = $('#emag').val();\n");
      out.write(" \t\t\tvar ename = $('#ename').val();\n");
      out.write(" \t\t\tvar ebd = $('#ebd').val();\n");
      out.write("\t  \t\tvar ephoto = $('#ephoto').val();\n");
      out.write("\t  \t\tvar notes = $('#notes').val();\n");
      out.write("\t  \t\t\n");
      out.write("\t  \t\t$('#register_form').attr('action','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/employee.do').submit;\n");
      out.write(" \t\t\n");
      out.write("\t\t});\n");
      out.write("\t  \t\t\n");
      out.write("// \t  \t\tif(empno === ''||ename === ''||\n");
      out.write("//\t  \t\t\t\temag === ''||ebd === ''){\n");
      out.write("//\t  \t\t\talert('필수 입력값이 없습니다.');\t\n");
      out.write("//\t  \t\t} else  {\n");
      out.write("//\t  \t\t\talert('else 로 넘어왔다~.');\n");
      out.write("//\t  \t\t\t$('#register_form').attr('action','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/employee.do').submit;\n");
      out.write("//\t  \t\t}\n");
      out.write("// \t\t\t});\n");
      out.write("\n");
      out.write("//  \t\t$('#cancel_btn').click(function(){\n");
      out.write("//  \t\t\talert('취소버튼 클릭'); \n");
      out.write(" // \t\t\t});   */\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!-- employeeID, manager,name, birthDate, photo, notes-->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
