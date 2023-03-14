package controllers;


import dao.DaoFactoryPractice;
import dao.Products;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Products productsDao = DaoFactoryPractice.getProductsDao();
        List<Product> products = productsDao.all();

        req.setAttribute("products", products);
        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        double  price = Double.parseDouble(req.getParameter("price"));
        Product product = new Product(name, price);

//        List<Product> products = Product.getProducts();
//        products.add(product);

        Products productsDao = DaoFactoryPractice.getProductsDao();
        productsDao.insert(product);
        List<Product> products = productsDao.all();

        req.setAttribute("products", products);
        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }
}
