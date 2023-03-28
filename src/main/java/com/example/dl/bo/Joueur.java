package com.example.dl.bo;
public class Joueur
{
    private String nom;

    private String prenom;

    private String login;

    private String motpasse;

    private double score;

    private double bestScore;

    private int nbredelance;

    //constructeur sans parametre
    public Joueur()
    {

    }
    //constructeur avec parametre
    public Joueur(String nom, String prenom, String login, String motpasse, double score, double bestScore,int nbredelance)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.motpasse = motpasse;
        this.score = score;
        this.bestScore = bestScore;
        this.nbredelance = nbredelance;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", login='" + login + '\'' +
                ", motpasse='" + motpasse + '\'' +
                ", score=" + score +
                ", bestScore=" + bestScore +
                ", nbredelance=" + nbredelance +
                '}';
    }

    public int getNbredelance() {
        return nbredelance;
    }

    public void setNbredelance(int nbredelance) {
        this.nbredelance = nbredelance;
    }

    public double getBestScore() {
        return bestScore;
    }

    public void setBestScore(double bestScore) {
        this.bestScore = bestScore;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMotpasse() {
        return motpasse;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Joueur(String nom, String prenom, String login, String motpasse, double score, double bestScore)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.motpasse =motpasse;
        this.score = score;
        this.bestScore = bestScore;
    }

    public void incrementenbredelance()
    {
        this.nbredelance++;
    }
}
