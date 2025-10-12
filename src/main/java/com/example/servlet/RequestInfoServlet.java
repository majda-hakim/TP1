package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class RequestInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Exercice 3 : Informations de la requête</h2><hr>");

        // --- Infos sur la requête ---
        out.println("<h3>Request info:</h3>");
        out.println("requestURL: " + request.getRequestURL() + "<br>");
        out.println("requestURI: " + request.getRequestURI() + "<br>");
        out.println("contextPath: " + request.getContextPath() + "<br>");
        out.println("servletPath: " + request.getServletPath() + "<br>");
        out.println("queryString: " + request.getQueryString() + "<br>");
        out.println("getParameter text1: " + request.getParameter("text1") + "<br>");
        out.println("getParameter text2: " + request.getParameter("text2") + "<br>");

        // --- Infos sur le serveur ---
        out.println("<hr><h3>Server info:</h3>");
        out.println("serverName: " + request.getServerName() + "<br>");
        out.println("serverPort: " + request.getServerPort() + "<br>");

        // --- Infos sur le client ---
        out.println("<hr><h3>Client info:</h3>");
        out.println("remoteAddr: " + request.getRemoteAddr() + "<br>");
        out.println("remoteHost: " + request.getRemoteHost() + "<br>");
        out.println("remotePort: " + request.getRemotePort() + "<br>");
        out.println("remoteUser: " + request.getRemoteUser() + "<br>");

        // --- Headers (entêtes HTTP) ---
        out.println("<hr><h3>Headers:</h3>");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("<b>" + headerName + ":</b> " + headerValue + "<br>");
        }

        // --- Servlet Context info ---
        out.println("<hr><h3>Servlet Context info:</h3>");
        out.println("realPath: " + getServletContext().getRealPath("/") + "<br>");

        out.println("</body></html>");
    }
}
