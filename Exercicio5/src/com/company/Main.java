package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* Desenvolver um programa para exibição por console os n primeiros números naturais que
        têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo
        console.
                Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
        números naturais que tenham pelo menos 2 dígitos terminados em 3 no console. Neste
        caso, a saída será: 33, 133 , 233, 303, 313.
        Dependendo de como você decidir abordar a solução para este exercício, pode ser
        necessário usar recursos que ainda não estudamos. Faz parte do desafio encontrar
        soluções na Internet e utilizá-las. */

        Scanner sc = new Scanner(System.in);

        int n,m, d;

        System.out.print("Digite a quantidade de números: ");
        n = sc.nextInt();

        System.out.print("Digite a quantidade de Dígitos: ");
        m = sc.nextInt();

        System.out.print("Terminados em: ");
        d = sc.nextInt();

        if (n < 0) {
            System.out.println("O número digitado não permite repetições.");
        }
        else if (n == 1) {
            System.out.println(d);
        }

        int numeroD = d;
        int multiD = 10;
        for (int i = 2; i <= m; i++) {
            numeroD = (multiD * d) + numeroD;
            multiD *= 10;
        }

        int numeroValido = numeroD;
        List<String> lista = new ArrayList<>();
        while (lista.size() < n){
            String validoStr = String.valueOf(numeroValido);
            if (verificaSeContem(m, d, validoStr)) {
                lista.add(validoStr);
            }
            numeroValido++;
        }

        System.out.println("Números: ");
        for (String l : lista) {
            System.out.println(l);
        }

        sc.close();

    }

    private static boolean verificaSeContem(int repete, int digito, String numeroValido) {
        String digitoNumero = String.valueOf(digito);
        int indice = 0;
        int repeticoes = 0;
        while (indice >= 0) {
            indice = numeroValido.indexOf(numeroValido, indice);
            if (indice >= 0) {
                indice++;
                repeticoes++;
            }
            if(repeticoes==repete) return true;
        }
        return false;
    }
}
