/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2023-01-15 14:36:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:replace", org.apache.taglibs.standard.functions.Functions.class, "replace", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/Users/andreibergners/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("jar:file:/Users/andreibergners/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("file:/Users/andreibergners/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar", Long.valueOf(1673731876759L));
  }

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Home Page</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/jumbotron-narrow.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/home.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/jquery.growl.css\"/>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("    <script src=\"/js/jquery.growl.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"header clearfix\">\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"nav nav-pills pull-right\">\n");
      out.write("                <li class=\"active\" id=\"home\"><a href=\"#\">Home</a></li>\n");
      out.write("                <li id=\"qsLogoutBtn\"><a href=\"#\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <h3 class=\"text-muted\">App.com</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("        <h3>Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("!</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row marketing\">\n");
      out.write("        <div class=\"col-lg-6\">\n");
      out.write("            <h4>Subheading</h4>\n");
      out.write("            <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>\n");
      out.write("\n");
      out.write("            <h4>Subheading</h4>\n");
      out.write("            <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet\n");
      out.write("                fermentum.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-lg-6\">\n");
      out.write("            <h4>Subheading</h4>\n");
      out.write("            <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>\n");
      out.write("\n");
      out.write("            <h4>Subheading</h4>\n");
      out.write("            <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet\n");
      out.write("                fermentum.</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p> &copy; 2016 Company Inc</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(\"#qsLogoutBtn\").click(function(e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $(\"#home\").removeClass(\"active\");\n");
      out.write("        $(\"#password-login\").removeClass(\"active\");\n");
      out.write("        $(\"#qsLogoutBtn\").addClass(\"active\");\n");
      out.write("        // assumes we are not part of SSO so just logout of local session\n");
      out.write("        window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, '')}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/logout\";\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
