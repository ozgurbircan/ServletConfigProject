package servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LENOVO on 14.03.2017.
 */
public class SevletConfigEx extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter printWriter=resp.getWriter();
        ServletConfig servletConfig=getServletConfig();

        String name=servletConfig.getInitParameter("name");
        String surname=servletConfig.getInitParameter("surname");
        String age=servletConfig.getInitParameter("age");
        String servletName=servletConfig.getServletName();
        String nullvalue=servletConfig.getInitParameter("nullvalue");//böyle parametremiz yok

        printWriter.print("<html><body>");
        printWriter.print("name "+name+"<br>");
        printWriter.print("surname "+surname+"<br>");
        printWriter.print("age "+age+"<br>");
        printWriter.print("servletName "+servletName+"<br>");
        printWriter.print("Null "+nullvalue);//böyle parametremiz olmadığı zaman null olarak geri dönecektir.
        printWriter.print("</body></html>");



    }
}
