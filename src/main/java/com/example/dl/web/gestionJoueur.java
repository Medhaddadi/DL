package com.example.dl.web;

import com.example.dl.bo.Joueur;
import com.example.dl.bo.Message;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "gestionJoueur", value = "/gestionJoueur")
public class gestionJoueur extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String crrerutilisateur = "formulaireInscription.jsp";
        ServletContext context = getServletContext();
        if (request.getParameter("creer") != null)
        {
            context.getRequestDispatcher(crrerutilisateur).forward(request, response);
            return;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ServletContext context = getServletContext();

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String login = request.getParameter("login");
        String motpasse = request.getParameter("motpasse");

        Joueur j1 = new Joueur(nom, prenom, login, motpasse, 0, 0);

        gestiondonnées gameContext = (gestiondonnées) getServletContext().getAttribute("gameData");

        List<Message> messages = new ArrayList<Message>();
        if (gameContext.getUserByLogin(login) != null)
        {
            messages.add(new Message("Login existe déjà", Message.WARN));
            request.setAttribute("messages", messages);
            context.getRequestDispatcher("error.jsp").forward(request, response);
            return;

        }

        // On ajoute l'utilisateur
        gameContext.insertUser(j1);

        // On redirige vers la page login avec un message de succès
        messages.add(new Message("Utilisateur correctement ajouté", Message.INFO));
        request.setAttribute("messages", messages);

        // On redirige vers la vue
        context.getRequestDispatcher("loginForm.jsp").forward(request, response);

    }

}

