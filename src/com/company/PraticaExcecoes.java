package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PraticaExcecoes extends RuntimeException {

    public static void Quociente() {
        int a = 0;
        int b = 300;

        try {
            int quociente = b / a;
        } catch (ArithmeticException ex) {
            System.out.println("Ocorreu um erro:" + ex.getMessage());
        } finally {
            System.out.println("Não pode ser dividido por zero");
        }
    }

    public static void dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode ser dividido por zero!");
        } else {
            double result = a / b;
            System.out.println(result);
        }
    }

    public static void exercicio2() {
        String mensagemFinal = "Esta é a última mensagem";
        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(mensagemFinal);
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException {

        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo especificado");
        }
    }

    public static void lerArquivo2(String nomeArquivo) throws IOException {
        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo especificado não foi encontrado");
        }
    }

    public static void maximo() {
        double a = 31;
        double b = 98;
        System.out.println("O maior numero: " + Math.max(a, b));
    }

    public static void minimo() {
        double a = 28;
        double b = 56;
        System.out.println("O menor numero: " + Math.min(a, b));
    }

    public static void potencia() {
        double a = 5;
        double b = 2;
        System.out.println("A potencia é de: " + Math.pow(a, b));
    }

    public static void cosseno() {
        int graus = 45;
        double cosseno = 0;

        cosseno = Math.cos(graus);

        System.out.println("O cosseno de " +graus+ " graus é " +cosseno);
    }

    public static void raiz() {
        double a = 25;
        System.out.println("A raiz quadrada de: "+ a + " é: "+ Math.sqrt(a));
    }

    public static void aleatorio() {
        double numeroAleatorio = Math.random() * 1000;
        System.out.printf("O numero é: " +"%.0f\n", numeroAleatorio);
    }
}










