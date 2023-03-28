package com.example.dl.bo;


import java.util.ArrayList;
import java.util.List;

public class etatjeu
{
    private Joueur joueur;

    private boolean gameOver = false;

    private List<Message> messages = new ArrayList<Message>();
    //reinisialiser la partie du Game
    public void reinitialiser()
    {
        gameOver = false;
        messages = new ArrayList<Message>();
        joueur.setScore(0);
        joueur.setNbredelance(0);
    }

    @Override
    public String toString()
    {
        return "etatGame{" +
                "joueur=" + joueur +
                ", gameOver=" + gameOver +
                ", messages=" + messages +
                '}';
    }
    public void addMessage(Message ms) {
        messages.add(ms);
    }

    // constructeur ---->accorder cette partie du jeu à un joueur
    public etatjeu(Joueur joueur) {
        this.joueur=joueur;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}

