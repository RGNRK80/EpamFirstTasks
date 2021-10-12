package by.mglv.epam.bykhauski.first;

import java.util.Scanner;

public class Task1 {

    // #1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
    public static void task1 () {
        double z=0;
        System.out.println("Enter the parameters of function z = ( (a – 3 ) * b / 2) + c  ");
        System.out.println(" a= ");
        double a=enterVar();
        System.out.println(" b= ");
        double b=enterVar();
        System.out.println(" c= ");
        double c=enterVar();
        z = (a - 3)*b/2+c;
        System.out.println("z =" + z);


    }

    public static double enterVar(){
        double rezult=0;
        Scanner scanner=new Scanner(System.in);
        if (scanner.hasNextDouble()) {rezult=scanner.nextDouble();
        } else {
            System.out.println("wrong enter, try again:");
            enterVar();}
        return rezult;
    }

    // #2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    // (𝑏 + √(𝑏^2 + 4𝑎𝑐))/2a-𝑎^3𝑐 + 𝑏^(−2)
    public static void task2 (){
        System.out.println("Enter the parameters of function  (\uD835\uDC4F + √(\uD835\uDC4F^2 + 4\uD835\uDC4E\uD835\uDC50))/2a-\uD835\uDC4E^3\uD835\uDC50 + \uD835\uDC4F^(−2) ");

        System.out.println(" a= ");
        double a=0;
        boolean check=true;
        while (check) {
            a = enterVar();
            if (a != 0) {
                check = false;
            } else {
                System.out.println("a must be != 0 , reenter please ");
            }
        }

        System.out.println(" b= ");
        double b=enterVar();
        System.out.println(" c= ");
        double c=enterVar();
        double z1=b*b+4*a*c;
        if (z1<0 || a==0)  {
            System.out.println("b^2 + 4\uD835\uDC4E\uD835\uDC50 - Must be >=0");
        } else {
            double rezult=(b+Math.sqrt(z1))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
            System.out.println("rezult is: " + rezult);}

    }




}
