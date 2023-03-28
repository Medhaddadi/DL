package com.example.dl.web;

import com.example.dl.bo.Joueur;
import com.example.dl.bo.Message;
import com.example.dl.bo.etatjeu;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SeConnecter", value = "/SeConnecter")
public class SeConnecter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String loginPge = "/WEB-INF/LoginForm.jsp";
        getServletContext().getRequestDispatcher(loginPge).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String login = request.getParameter("login");
        String motpasse = request.getParameter("motpasse");

        List<Message> messages = new ArrayList<Message>();

        gestiondonnées context = (gestiondonnées) getServletContext().getAttribute("gameData");

        // On recherche l'utilisateur par login
        Joueur j1 = context.getUserByLogin(login.trim());
        // Si un utilisateur existe avec le login donnée on passe alors à vérifier lemot de passe
        if (j1 != null)
        {
            if (j1.getMotpasse()!= null && j1.getMotpasse().equals(motpasse)) {

                // objet etatgame stocke l'etat du jeu
                etatjeu etatgame = new etatjeu(j1);
                //on stocke l'objet etatgame dans la session
                request.getSession().setAttribute("etatgame",etatgame);
                // On stocke l'utilisateur authentifié dans la session
                request.getSession().setAttribute("joueur",j1);

                // afficher la page home
                getServletContext().getRequestDispatcher("Home.jsp").forward(request, response);
                return;
            }
            else
            {

                messages.add(new Message("Login ou mot de passe incorrect", Message.WARN));
                request.setAttribute("messages", messages);
                getServletContext().getRequestDispatcher("loginForm.jsp").forward(request, response);
                return;
            }

        }

    }
}
