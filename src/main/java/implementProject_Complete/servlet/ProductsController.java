package implementProject_Complete.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import implementProject_Complete.domain.Product;
import implementProject_Complete.service.ProductService;
import implementProject_Complete.service.impl.ProductServiceImpl;

@WebServlet("/products")
public class ProductsController extends HttpServlet {
	private ProductService productService = ProductServiceImpl.getProductService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product> products = productService.readAll();
		String json = new Gson().toJson(products);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

}
