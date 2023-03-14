package controllers;

import dao.Ads;
import dao.DaoFactory;
import dao.ListAdsDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdServlet", value = "/ads")
public class AdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ListAdsDao listAdsDao = new ListAdsDao();

        Ads adsDao = DaoFactory.getAdsDao();
        request.setAttribute("ads", adsDao.all());
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
