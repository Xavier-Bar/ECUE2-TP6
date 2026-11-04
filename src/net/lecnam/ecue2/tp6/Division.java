package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {

    //La division3 est la plus cohérente, car on doit informer l'utilisateur que quelque chose se passe. Et le contrôler.

    public double division1(int a, int b){
        return a/b;
    }

    public double division2(int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return a;
        }
    }

    public double division3(int a, int b) throws IOException {
        try {
            return a/b;
        } catch (ArithmeticException e){
            throw new IOException("Erreur, division par zéro");
        }
    }
}
