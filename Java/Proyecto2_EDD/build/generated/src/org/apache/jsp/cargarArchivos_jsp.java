package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cargarArchivos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<center><h2 class=\"w3-text-green\">MENU</h2></center>\n");
      out.write("  <div class=\"w3-bar-block\">\n");
      out.write("      <a href=\"inicio.jsp\" onclose=\"\" class=\"w3-bar-item w3-button w3-padding-16\"><i class=\"fa fa-arrow-circle-left\"></i> Regresar a Inicio</a>\n");
      out.write("      <hr>\n");
      out.write("      <h3 style=\"color: #2D3B55; text-align: center\">");

                        if(null!= request.getAttribute("informaMessage"))
                        {
                            out.print(request.getAttribute("informaMessage"));
                        }
                        
      out.write("</h3>                \n");
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
      out.write("    <hr>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"w3-container\">\n");
      out.write("      \n");
      out.write("      <center><h3 class=\"w3-text-green\">Modulo de Administrar Archivos</h3></center>\n");
      out.write("      <form action=\"cargaXMLUsuarios\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th align=\"center\">  </th>\n");
      out.write("                    <p><i class=\"fa fa-fw fa-upload\"></i><i class=\"fa fa-fw fa-user-circle-o\"></i> Usuarios</p>\n");
      out.write("                    <input style=\"color: black\" type=\"file\" name=\"file\" class=\"btn btn-default\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th align=\"center\">  </th>\n");
      out.write("                    <input style=\"color: black\" type=\"submit\" value=\"Cargar Usuarios\" class=\"btn btn-default\">\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("      <hr>\n");
      out.write("      \n");
      out.write("            <form action=\"cargaXMLHabitaciones\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th align=\"center\">  </th>\n");
      out.write("                    <p><i class=\"fa fa-fw fa-upload\"></i><i class=\"fa fa-fw fa-building\"></i> Habitaciones</p>\n");
      out.write("                    <input style=\"color: black\" type=\"file\" name=\"file\" class=\"btn btn-default\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th align=\"center\">  </th>\n");
      out.write("                    <input style=\"color: black\" type=\"submit\" value=\"Cargar Habitaciones\" class=\"btn btn-default\">\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("      <hr>\n");
      out.write("      \n");
      out.write("            <form action=\"cargaXMLReservaciones\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th align=\"center\">  </th>\n");
      out.write("                    <p><i class=\"fa fa-fw fa-upload\"></i><i class=\"fa fa-fw fa-check-circle-o\"></i> Reservaciones</p>\n");
      out.write("                    <input style=\"color: black\" type=\"file\" name=\"file\" class=\"btn btn-default\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th align=\"center\">  </th>\n");
      out.write("                    <input style=\"color: black\" type=\"submit\" value=\"Cargar Reservaciones\" class=\"btn btn-default\">\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("  <div class=\"w3-container\" id=\"agregar\">\n");
      out.write("    <hr>\n");
      out.write("    <center><h2 class=\"w3-text-green\">Registrar Habitacion</h2></center>\n");
      out.write("    <form action=\"cargarHabitacion\" method=\"POST\">\n");
      out.write("      <p><input class=\"w3-input w3-border\" type=\"text\" name=\"nivel\" placeholder=\"Nivel de la Habitacion\" required=\"\"></p>\n");
      out.write("      <p><input class=\"w3-input w3-border\" type=\"text\" name=\"numero\" placeholder=\"Numero de Habitacion\" required=\"\"></p>\n");
      out.write("      <button type=\"submit\" class=\"w3-button w3-green w3-third\">Registrar Habitacion</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("  <footer class=\"w3-container w3-padding-16\" style=\"margin-top:32px\">USAC <a ></a></footer>\n");
      out.write("\n");
      out.write("<!-- End page content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
