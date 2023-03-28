package com.example.dl.web;
import com.example.dl.bo.Joueur;

import java.util.List;

public interface  gestiondonnées
{
    //récuperer tous les joueurs
    public List<Joueur> getAllUsers();
    public void updateScore(Joueur joueur);
    //ajouter un joueur
    public void insertUser(Joueur joueur);
    //récuperer un joueur par son login
    public Joueur getUserByLogin(String login);
}
