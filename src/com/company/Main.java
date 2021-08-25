package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("------------------------------");

        PraticaExcecoes.Quociente();

        System.out.println("------------------------------");

        PraticaExcecoes.exercicio2();

        System.out.println("----------------------------------");

        PraticaExcecoes.lerArquivo("Pratica 1");

        System.out.println("-------------------------------------");

        PraticaExcecoes.lerArquivo2("Pratica 2");

        System.out.println("-----------------------------------");

        PraticaExcecoes.minimo();
        PraticaExcecoes.maximo();
        PraticaExcecoes.potencia();
        PraticaExcecoes.cosseno();
        PraticaExcecoes.raiz();
        PraticaExcecoes.aleatorio();

        System.out.println("---------------------------------");

        PraticaExcecoes.dividir(300, 0);
    }
}

