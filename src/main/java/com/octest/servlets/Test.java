package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.octest.beans.Auteur;


public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		
		String age = request.getParameter("age");
		request.setAttribute("age", age);
		
		String[] noms = {"Mathieu", "Roberto", "Francisco"};
		request.setAttribute("noms", noms);
		
		Auteur auteur = new Auteur();
		auteur.setPrenom("Hugo");
		auteur.setNom("MATTON");
		auteur.setActif(false);
		
		request.setAttribute("auteur", auteur);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
