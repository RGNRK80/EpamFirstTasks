package by.mglv.epam.bykhauski.first;

import java.util.Scanner;

public class Task1 {

    // #1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
    public static void task1 () {
        Scanner scanner=new Scanner(System.in);
        double z=0;
        double a=0;
        double b=0;
        double c=0;
        System.out.println("Enter the parameters of function z = ( (a – 3 ) * b / 2) + c  ");
        System.out.println(" a= ");
        a=enterVar();
        System.out.println(" b= ");
        b=enterVar();
        System.out.println(" c= ");
        c=enterVar();
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

}
