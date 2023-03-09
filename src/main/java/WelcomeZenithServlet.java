import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeZenithServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome, Zenith! cohort</h1>");
//        or          PrintWriter out = response.getWriter().out.println("<h1>Welcome, Zenith!</h1>");
    }
}

//STring world = rewuwt.getParameter("hello");
// sysst.out.println(world);

// When a user goes to /add and passes a query string of ?num=1&num=5 it should reutrn the sum in an h1.
// create servlet