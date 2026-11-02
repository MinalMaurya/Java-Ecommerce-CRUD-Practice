package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product_pojo;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String i = req.getParameter("insert");
		String u = req.getParameter("update");
		String d = req.getParameter("delete");
		String s = req.getParameter("show");

		String flag = i+u+d+s;
		
	if (flag.equals("insertnullnullnull")) {
		Product_pojo pojo = new Product_pojo();
		pojo.setPname(req.getParameter("pname"));
		pojo.setPprice(Integer.parseInt(req.getParameter("pprice")));
		pojo.addProduct(pojo);
	} else if(flag.equals("nullupdatenullnull")) {
		Product_pojo pojo =new Product_pojo();
		pojo.setPname(req.getParameter("pname"));
		pojo.setPprice(Integer.parseInt(req.getParameter("pprice")));
		pojo.updateProduct(pojo);
	}else if(flag.equals("nullnulldeletenull")) {
		Product_pojo pojo =new Product_pojo();
		pojo.setPname(req.getParameter("pname"));
		pojo.deleteProduct(pojo);
	}else{
		//show
	}
		
		
	}

}
