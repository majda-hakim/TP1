package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserInfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer les valeurs envoyées depuis le formulaire
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        // Préparer la réponse HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Informations reçues :</h2>");
        out.println("<p><b>User Name :</b> " + username + "</p>");
        out.println("<p><b>Password :</b> " + password + "</p>");
        out.println("<p><b>First Name :</b> " + firstname + "</p>");
        out.println("<p><b>Last Name :</b> " + lastname + "</p>");
        out.println("<p><b>Gender :</b> " + gender + "</p>");
        out.println("<p><b>Address :</b> " + address + "</p>");
        out.println("</body></html>");
    }
}
