import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            // 模拟数据，实际应该从数据库取
            request.setAttribute("username", username);
            request.setAttribute("email", "admin@qq.com");
            request.setAttribute("gender", "男");
            request.setAttribute("studentId", "2026001");
            request.setAttribute("birth", "2005-01-01");
            request.setAttribute("phone", "13800138000");

            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "用户名或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}