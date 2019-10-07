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
        public void rectangle2() {
            Scanner notFullRectangle = new Scanner(System.in);

            System.out.println("Enter values of your rectangle");
            String symbol2 = notFullRectangle.nextLine();
            int row = notFullRectangle.nextInt();
            int symbols = notFullRectangle.nextInt();

            for (int a = 1; a <= row; a++) {
                for (int j = 1; j <= symbols; j++) {
                    if (a == 1 || a == row || j == 1 || j == symbols)
                    System.out.print(symbol2);
                else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

