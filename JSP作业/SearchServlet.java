import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取输入的内容
        String txt = request.getParameter("txt");
        // 获取选择的引擎
        String engine = request.getParameter("engine");

        if (txt == null) txt = "";

        // 根据选择跳转
        if ("baidu".equals(engine)) {
            response.sendRedirect("https://www.baidu.com/s?wd=" + txt);
        } else if ("bing".equals(engine)) {
            response.sendRedirect("https://www.bing.com/search?q=" + txt);
        } else if ("google".equals(engine)) {
            response.sendRedirect("https://www.google.com/search?q=" + txt);
        }
    }
}