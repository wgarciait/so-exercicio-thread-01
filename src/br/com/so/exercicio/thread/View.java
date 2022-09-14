package br.com.so.exercicio.thread;

import java.util.Random;

public class View {

    public static void main(String[] args) {

        int numVet[] = new int[1000];
        int numAleatorio[] = new int[100];

        for (int i = 1; i < 100; i++) {
            numAleatorio[i] = i;
        }

        Random random = new Random();
        for(int i = 0; i < 1000; i++) {
            numVet[i] = numAleatorio[random.nextInt(numAleatorio.length)];
            //System.out.println(numVet[i]);
        }

        ThreadVetor threadVetor = new ThreadVetor(1, numVet);
        threadVetor.run();

        ThreadVetor threadVetor2 = new ThreadVetor(2, numVet);
        threadVetor2.run();
    }

}
