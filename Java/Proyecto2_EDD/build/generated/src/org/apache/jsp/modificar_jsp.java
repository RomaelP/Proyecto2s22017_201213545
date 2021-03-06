package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<title>El Lobo Hotel</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/nuevoCSS.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body,h1,h2,h3,h4,h5,h6 {font-family: \"Raleway\", Arial, Helvetica, sans-serif}\n");
      out.write(".mySlides {display:none}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-content w3-border-left w3-border-right\">\n");
      out.write("\n");
      out.write("<!-- Sidebar/menu -->\n");
      out.write("\n");
      out.write("<nav class=\"w3-sidebar w3-light-grey w3-collapse w3-top\" style=\"z-index:3;width:260px\" id=\"mySidebar\">\n");
      out.write("<center><h2 class=\"w3-text-red\">Eliminar</h2></center>\n");
      out.write("  <div class=\"w3-bar-block\">\n");
      out.write("    \n");
      out.write("    <a href=\"#eliminarUsuario\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-user-circle\"></i>Usuario</a>\n");
      out.write("    <a href=\"#eliminarHabitacion\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-building-o\"></i>Habitacion</a>\n");
      out.write("    <a href=\"#eliminarAVL\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-money\"></i> Pago </a>\n");
      out.write("    <a href=\"#eliminarB\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-list-alt\"></i> Bitacora </a>\n");
      out.write("    <br>\n");
      out.write("    <center><h2 class=\"w3-text-blue\">Modificar</h2></center>\n");
      out.write("    \n");
      out.write("    <a href=\"#editarUsuario\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-user-circle\"></i>Usuario</a>\n");
      out.write("    <a href=\"#editarAVL\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-money\"></i> Pago </a>\n");
      out.write("    <a href=\"#editarB\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-list-alt\"></i> Bitacora </a>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <a href=\"#apartment\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-fw fa-home\"></i>Inicio</a>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Top menu on small screens -->\n");
      out.write("<header class=\"w3-bar w3-top w3-hide-large w3-black w3-xlarge\">\n");
      out.write("  <span class=\"w3-bar-item\">Rental</span>\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"w3-right w3-bar-item w3-button\" onclick=\"w3_open()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("<div class=\"w3-overlay w3-hide-large\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<div class=\"w3-main w3-white\" style=\"margin-left:260px\">\n");
      out.write("\n");
      out.write("  <!-- Push down content on small screens -->\n");
      out.write("  <div class=\"w3-hide-large\" style=\"margin-top:80px\"></div>\n");
      out.write("\n");
      out.write("  <!-- Slideshow Header -->\n");
      out.write("  <div class=\"w3-container\" id=\"apartment\">\n");
      out.write("    <h2 class=\"w3-text-green\">El Lobo Hotel</h2>\n");
      out.write("    <div class=\"w3-display-container mySlides\">\n");
      out.write("        <img src=\"Recursos/restaurant.jpg\" style=\"width:75%;margin-bottom:-6px\">\n");
      out.write("      <div class=\"w3-display-bottomleft w3-container w3-black\">\n");
      out.write("        <p>Restaurant</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <br>\n");
      out.write("  <hr>\n");
      out.write("  <div class=\"w3-container\" id=\"eliminarUsuario\">\n");
      out.write("      <h5 class=\"w3-text-red\">Eliminar Usuario</h5>\n");
      out.write("    <form action=\"elimanarUsuario\" method=\"POST\">\n");
      out.write("      <p><input class=\"w3-input w3-border\" type=\"text\" name=\"usuario\" placeholder=\"Usuario a eliminar\" required=\"\"></p>\n");
      out.write("      <button type=\"submit\" class=\"w3-button w3-green w3-third\">Eliminar Usuario</button>\n");
      out.write("    </form>\n");
      out.write("     \n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-container\" id=\"eliminarHabitacion\">\n");
      out.write("      <h5 class=\"w3-text-red\">Eliminar Habitacion</h5>\n");
      out.write("    <form action=\"elimanarHabitacion\" method=\"POST\">\n");
      out.write("      <p><input class=\"w3-input w3-border\" type=\"text\" name=\"habitacion\" placeholder=\"Habitacion a eliminar\" required=\"\"></p>\n");
      out.write("      <button type=\"submit\" class=\"w3-button w3-green w3-third\">Eliminar Habitacion</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  <div class=\"w3-container\" id=\"eliminarAVL\">\n");
      out.write("      <h5 class=\"w3-text-red\">Eliminar Pago(AVL)</h5>\n");
      out.write("    <form action=\"elimanarAVL\" method=\"POST\">\n");
      out.write("      <p><input class=\"w3-input w3-border\" type=\"text\" name=\"usuario\" placeholder=\"Tarjeta a eliminar\" required=\"\"></p>\n");
      out.write("      <button type=\"submit\" class=\"w3-button w3-green w3-third\">Eliminar Pago</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  <div class=\"w3-container\" id=\"eliminarB\">\n");
      out.write("      <h5 class=\"w3-text-red\">Eliminar Bitacora(B)</h5>\n");
      out.write("    <form action=\"elimanarBitacora\" method=\"POST\">\n");
      out.write("      <p><input class=\"w3-input w3-border\" type=\"text\" name=\"usuario\" placeholder=\"Tarjeta a eliminar\" required=\"\"></p>\n");
      out.write("      <button type=\"submit\" class=\"w3-button w3-green w3-third\">Eliminar Bitacora</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  <hr>\n");
      out.write("  \n");
      out.write("    <div class=\"w3-container\" id=\"editarUsuario\">\n");
      out.write("      <h5 class=\"w3-text-green\">EditarUsuario</h5>\n");
      out.write("      <form action=\"editarUsuario\" method=\"POST\">\n");
      out.write("        <p><input class=\"w3-input w3-border\" type=\"text\" name=\"usuario\" placeholder=\"Nombre de Usuario \" required=\"\"></p>\n");
      out.write("        <p><input class=\"w3-input w3-border\" type=\"text\" name=\"nuevo\" placeholder=\"Nuevo Nombre\" required=\"\"></p>\n");
      out.write("        <button type=\"submit\" class=\"w3-button w3-green w3-third\">Modificar Nombre</button>\n");
      out.write("      </form>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-container\" id=\"editarAVL\">\n");
      out.write("      <h5 class=\"w3-text-green\">Editar Pago(AVL)</h5>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-container\" id=\"editarB\">\n");
      out.write("      <h5 class=\"w3-text-green\">Editar Bitacora(B)</h5>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  \n");
      out.write("  <!-- Contact -->\n");
      out.write("\n");
      out.write("  <footer class=\"w3-container w3-padding-16\" style=\"margin-top:32px\">USAC <a ></a></footer>\n");
      out.write("\n");
      out.write("<!-- End page content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Subscribe Modal -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Script to open and close sidebar when on tablets and phones\n");
      out.write("function w3_open() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("}\n");
      out.write(" \n");
      out.write("function w3_close() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Slideshow Apartment Images\n");
      out.write("var slideIndex = 1;\n");
      out.write("showDivs(slideIndex);\n");
      out.write("\n");
      out.write("function plusDivs(n) {\n");
      out.write("  showDivs(slideIndex += n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function currentDiv(n) {\n");
      out.write("  showDivs(slideIndex = n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showDivs(n) {\n");
      out.write("  var i;\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"demo\");\n");
      out.write("  if (n > x.length) {slideIndex = 1}\n");
      out.write("  if (n < 1) {slideIndex = x.length}\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("     x[i].style.display = \"none\";\n");
      out.write("  }\n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("     dots[i].className = dots[i].className.replace(\" w3-opacity-off\", \"\");\n");
      out.write("  }\n");
      out.write("  x[slideIndex-1].style.display = \"block\";\n");
      out.write("  dots[slideIndex-1].className += \" w3-opacity-off\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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
