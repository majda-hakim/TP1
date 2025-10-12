package com.example.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupération des valeurs depuis l'URL
        String nom = request.getParameter("nom");
        String age = request.getParameter("age");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        if (nom != null && age != null) {
            out.println("<h2>Je m'appelle " + nom + " et j'ai " + age + " ans.</h2>");
        } else {
            out.println("<p>Veuillez fournir un nom et un âge dans l'URL.</p>");
            out.println("<p>Exemple : ?nom=Majda&age=22</p>");
        }
        out.println("</body></html>");
    }
}
