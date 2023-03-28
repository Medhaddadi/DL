package com.example.dl.web;

import com.example.dl.bo.Joueur;
import com.example.dl.bo.etatjeu;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletJeu", value = "/ServletJeu")
public class ServletJeu extends HttpServlet
{
    protected  void jouer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // On récupére la session de l'utilisateur en cours
        HttpSession session = request.getSession();

        // On récupére de la session, les informations du joueur en cours
        Joueur j = (Joueur) session.getAttribute("joueur");

        // Pour gérer les données de l'application dans le ServletContext
        gestiondonnées gameContext = (gestiondonnées) getServletContext().getAttribute("gameData");

        // Cette objet déjà inséré dans la session au moment de login
        etatjeu gameSate = (etatjeu) session.getAttribute("gameState");

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        jouer(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        jouer(request,response);
    }
}
