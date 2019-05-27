package com.sebastien.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sebastien.entity.Book;

@WebServlet("/accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Accueil() {
		super();

	}


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Hello world");

		String pseudoEnvois = request.getParameter("pseudo");
		request.setAttribute("pseudoTransmis", pseudoEnvois);

		String name = request.getParameter("name");
		String msg ="message de la servlet auteur: " + name + " " + pseudoEnvois;



		request.setAttribute("messageTransmis", msg);
		request.setAttribute("name", name);

		Book book = new Book("alphonse ", "deux truc", "c'est l'histoire d'un mec...");
		Book book2 = new Book("Raymond ", "comment tout peter en deux minutes", "et boum la maison");

		List<Book> bookList = new ArrayList<>();
		bookList.add(book);
		bookList.add(book2);

		request.setAttribute("bookList", bookList);


		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);

	}

}
