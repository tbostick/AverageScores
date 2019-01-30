package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Find the average of 10 numbers");
        Scanner keyboard = new Scanner(System.in);

        int[] numbers = new int[10];

        double output;
        double aver = 0;

        for (int i = 0; i < 10; ++i) {
            numbers[i] = keyboard.nextInt();
            output = (numbers[0] + numbers[1] + numbers[2] + numbers[3]
                    + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8]
                    + numbers[9]);

            aver = (output / 10);



        }
        System.out.println("The result of averaging the ten numbers is :  ");
        System.out.println(aver);
    }
}
