package sk.itsovy.sestak;

import java.util.Scanner;

public class projectRectangle {

    public void projectrectangle1() {
        Scanner fullProjectRectangle = new Scanner(System.in);
        System.out.println("Enter values of your obdlznik");
        int row = fullProjectRectangle.nextInt();
        int symbols = fullProjectRectangle.nextInt();

        for (int a = 1; a <= row; a++) {
            System.out.println();
            for (int j = 1; j <= symbols; j++) {
                System.out.print("@");
            }
        }

    }

    public void Months() {
        Scanner month = new Scanner(System.in);

        System.out.println("Enter value of your month");
        int m = month.nextInt();
        if (m == 1)
            System.out.println("January");
        else if (m == 2)
            System.out.println("February");
        else if (m == 3)
            System.out.println("March");
        else
            System.out.println("Error");
    }
    public void Months2(){
        Scanner months2 = new Scanner(System.in);
        System.out.println("Enter value of your month");
        int m = months2.nextInt();
        switch(m){
            case 1:
                System.out.println("January");break;
            case 2:
                System.out.println("February");break;
            case 3:
                System.out.println("March");break;
            case 4:
                System.out.println("April");break;
            case 5:
                System.out.println("May");break;
            case 6:
                System.out.println("June");break;
            case 7:
                System.out.println("July");break;
            case 8:
                System.out.println("August");break;
            case 9:
                System.out.println("September");break;
            case 10:
                System.out.println("October");break;
            case 11:
                System.out.println("Nobember");break;
            case 12:
                System.out.println("December");break;
            default:
                System.out.println("Error");
        }
        switch(m){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }
    }
    public void roots(){
        Scanner myObj = new Scanner(System.in);
        double D=0;
        double x=0;
        double x1=0;
        double x2=0;
        double a=0;
        double b=0;
        double c=0;
        System.out.println("Hello Im a program to solve quadratic equation");
        System.out.println("Enter a:");
        a = myObj.nextInt();
        System.out.println("Enter b:");
        b = myObj.nextInt();
        System.out.println("Enter c:");
        c = myObj.nextInt();

        if (a==0){
            System.out.println("\n" + "No It's a quadratic equation");
        }else{
            D= Math.pow(b,2)-4*a*c;
            System.out.println("D=" + D);
            if (D>0){
                x1=(((-b)+Math.sqrt(D))/2*a);
                x2=(((-b)-Math.sqrt(D))/2*a);
                System.out.println("Two solutions: x1=" + x1 + " x2=" + x2 );
            }
            if (D==0){
                x1=(-b)/(2*a);
                System.out.println("One solution: x=" + x );
            }
            if (D<0){
                System.out.println("No solution");
            }
        }
    }
}
