package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        GuessNumber();
    }

    public static void GuessNumber(){
        Scanner enteredUserNumber = new Scanner(System.in);


        Random rand = new Random();
        int n = rand.nextInt(10);
        int user;

        System.out.println("Компьютер загадал число от 0 до 9, угадайте это число с 3 попыток.");
        for (int i = 0; i < 3; i++){
            System.out.println("Попытка " + (i+1) + ": ");
            user = enteredUserNumber.nextInt();
            if (user < n) System.out.println("Число больше:");
            if (user > n) System.out.println("Число меньше:");
            if (user == n) {System.out.println("Поздравляю!!! Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                n = enteredUserNumber.nextInt();
                if (n == 1) GuessNumber();

                else {System.out.println("Спасибо за игру!");

                }
            }
        }
        System.out.println("Вы не угадали :(");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        user = enteredUserNumber.nextInt();
        if (user == 1) GuessNumber();

        else {System.out.println("Спасибо за игру!");

        }
    }
}
