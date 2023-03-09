import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// #4 and Bonus
//@WebServlet("/hello")
//public class HelloWorldServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String name = request.getParameter("name");
////        System.out.println(name);
//        if (name == null) {
//            response.getWriter().println("<h1>Hello, World!</h1>");
//
//        } else {
//            response.getWriter().println("<h1>Hello " + name + "</h1>");
//        }
//    }
//}


// Bonus #2
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    public static int count = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String reset = request.getParameter("reset");
        if (reset != null){
            count = 0;
        }
            response.getWriter().println(count);
            count++;



    }
}
