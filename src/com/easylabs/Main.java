package com.easylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum;
        Scanner in = new Scanner(System.in);
        System.out.println();
        sum = in.nextDouble();
        if (sum >= 500 & sum <= 1000) {
            System.out.println("Вам предоставляется скидка 3 процента ,сумма покупки " + sum * 0.97);
        } else if (sum >= 1000) {
            System.out.println("Вам предоставляется скидка 5 процентов ,сумма покупки " + sum * 0.95);
        } else if (sum < 0) {
            System.out.println(" Сумма покупки не может быть отрицательной ");
        } else if (sum >= 0 & sum < 500) {
            System.out.println("На покупки суммой меньше 500 ,скидка не предоставляется ");

        }


    }


}

