package pl.altkom.WebAppGenericServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class WebAppGenericServlet extends GenericServlet{
   
   @Override
   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      String imie = req.getParameter("imie");
      String servletInfo = this.getServletInfo();
      String servletName = getServletName();
      res.setContentType("text/html");
      PrintWriter pwriter=res.getWriter();
      pwriter.print("<html>"
              + "<head>"
              + "<meta charset=\"UTF-8\">"
              + "</head>");
      pwriter.print("<body>");
      pwriter.print("<h2>Generic Servlet przykład</h2>");
      pwriter.print("<p>Witaj na stronie! " + imie + "</p>");
      pwriter.print("<hr>");

//      pwriter.print(this.getInitParameter("imie"));
//      pwriter.print("<hr>");
      pwriter.print("To jest info z this.getServletInfo(): " + servletInfo);
      pwriter.print("<hr>");
      pwriter.print("To jest name z this.getServletName(): " + servletName);
      pwriter.print("</body>");
      pwriter.print("</html>");
   }
   
}
