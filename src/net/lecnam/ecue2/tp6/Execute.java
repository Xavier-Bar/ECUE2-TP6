package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();

        //exercice3();

        exercice4();

        //exercice5();

        //exercice6();

    }

    private static void exercice1(){
        Division division = new Division();
        division.division1(10, 0);

    }

    private static void exercice2(){
        Division division = new Division();
        division.division2(10, 0);
    }

    private static void exercice3(){
        Division division = new Division();
        try {
            double resultat = division.division3(10, 0);
            System.out.println("Résultat : " + resultat);
        } catch (IOException e) {
            System.out.println("Problème de division");
        }
    }

    private static void exercice4(){
        Etudiant etudiant = new Etudiant("123456789","toto","tati");
        Etudiant etudiant2 = new Etudiant("987654321","tata","tati");

        Etudiant[] etudiants = new Etudiant[2];
        etudiants[0] = etudiant;
        etudiants[1] = etudiant2;

        EtudiantService etudiantService = new EtudiantService();

        try {
            etudiantService.sauve(etudiants, "etudiants.csv");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
