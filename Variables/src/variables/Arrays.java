package variables;

import java.util.Scanner;

public class Arrays {

    public Arrays() {
    }




    public void valueCounter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the arrays size");
        int size = sc.nextInt();
        int[] arrays = new int[size];
        int contPositive = 0;
        int contNegative = 0;
        int contZeros = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value of the number" + (i + 1) + ":");
            int number = sc.nextInt();
            arrays[i] = number;
        }
        sc.close();

        for (int i = 0; i < size; i++) {
            if (arrays[i] == 0) {
                contZeros++;

            } else if (arrays[i] > 0) {
                contPositive++;
            } else if (arrays[i] < 0) {
                contNegative++;

            }
        }

        System.out.println("Hay " + contZeros + " zeros, " + contPositive + " positivos, " + contNegative + " negativos");
    }

    public void stringToArray(String word) {
        String[] stringArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            stringArray[i] = String.valueOf(word.charAt(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + stringArray[i] + "]");

        }

    }
}
