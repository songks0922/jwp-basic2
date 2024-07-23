package next;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;  // javax.servlet에서 jakarta.servlet으로 변경
import jakarta.servlet.annotation.WebServlet;  // javax.servlet.annotation에서 jakarta.servlet.annotation으로 변경
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("Hello World!");
    }
}
