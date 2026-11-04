package net.lecnam.ecue2.tp6;

public class Etudiants {
    String ine;
    String nom;
    String prenom;

    public Etudiants(String ine, String nom, String prenom) {
        this.ine = ine;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "\"" + this.ine + "\",\"" + this.nom + "\",\"" + this.prenom + "\"\n";
    }
}
