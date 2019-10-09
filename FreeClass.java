package sk.itsovy.sestak;

import javax.swing.*;
import java.util.Scanner;

public class FreeClass {
    public void sayHello() {
        System.out.println("Hi");
    }

    public void sayNHello(int n) {
        int i = 1;
        while (i < n) {
            System.out.print("Hi ");
            i++;
        }
    }

    public int getEven(int number) {
        if (number % 2 == 0)
            return number;
        else
            return number = number + 1;
        //number + 1; number++; number += 1;
    }
    public void setOfTask (){
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the A: ");
        a = in.nextInt();
        System.out.println("Enter the B: ");
        b = in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }

}

