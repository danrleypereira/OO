
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oraculoServletController")
public class OraculoServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //pegar o parametro
        String tipoProduto = request.getParameter("produto");
        //chamar a regra de negocios
        Oraculo oraculo = new Oraculo();
        List<String> produtos = oraculo.melhoresProdutos(tipoProduto);
        request.setAttribute("produtos", produtos);
        //passar o controle pro view
        RequestDispatcher view = request.getRequestDispatcher("resposta.jsp");
        view.forward(request, response);
        
    }

}
