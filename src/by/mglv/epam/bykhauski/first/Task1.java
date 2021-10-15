package by.mglv.epam.bykhauski.first;

import java.util.Scanner;

//Линейный программы
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


    // #3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    //(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦
    public static void task3 (){
        System.out.println("Enter the parameters X and Y");
        System.out.println(" X= ");
        double x=enterVar();
        System.out.println(" Y= ");
        double y=enterVar();
        double rezult=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(x))*Math.tan(x*y);
        System.out.println("rezult is: " + rezult);
    }

    // 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа.
    public static void task4 (){
        System.out.println("Enter the number R by format nnn.ddd ");
        double r=enterVar();
        double rezult = (int)((r*1000)%1000)+(double)((int)r)/1000;
        System.out.println("rezult is: " + rezult);
    }

    // #5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    // данное значение длительности в часах, минутах и секундах в следующей форме:
    // ННч ММмин SSc.
    public static void task5 (){
        System.out.println("Enter the quantity of seconds: ");
        int t= (int)enterVar();
        System.out.println((int)(t/3600)+"ч "+(int)((t%3600)/60)+"мин " + t%3600%60+ "c");
    }

    // #6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    // принадлежит закрашенной области, и false — в противном случае:
    public static void task6 (){
        System.out.println("Enter coordinates X and Y of point: ");
        System.out.println(" X= ");
        int x= (int) enterVar();
        System.out.println(" Y= ");
        int y= (int) enterVar();
        if ((x<=2 && x>= -2 && y<=4 && y>=-3) || (x<=4 && x>= -4 && y<=0 && y>=-3 )) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // Ветвления

    // #1 Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //    он прямоугольным.

    public static void task7 (){
        System.out.println("Enter two angles of triangle: ");
        System.out.println(" 1:  ");
        int x1=0;
        boolean check=true;
        while (check) {
            x1 = (int)enterVar();
            if (x1 > 0) {
                check = false;
            } else {
                System.out.println("angle  must be > 0 , reenter please ");
            }
        }

        System.out.println(" 2:  ");
        int x2=0;
        check=true;
        while (check) {
            x2 = (int)enterVar();
            if (x2 > 0) {
                check = false;
            } else {
                System.out.println("angle  must be > 0 , reenter please ");
            }
        }

        if ((x1+x2)<180) {
            System.out.println("Triangle is exist ");
            if (x1==90 || x2==90 || (x1+x2)==90) {
                System.out.println("The triangle is rectangular");
            }
        } else {System.out.println("Triangle is not exist ");}
    }

    // #2 Найти max{min(a, b), min(c, d)}.
    //    он прямоугольным.
    public static void task8 (){
        System.out.println("Enter a,b,c,d for expressions: max{min(a, b), min(c, d)} ");
        System.out.println(" a= ");
        double a=enterVar();
        System.out.println(" b= ");
        double b=enterVar();
        System.out.println(" c= ");
        double c=enterVar();
        System.out.println(" d= ");
        double d=enterVar();

        //ver.1
        double min1=0;
        double min2=0;
        double rezultMax=0;
        if (a<b) {min1=a;} else {min1=b;}
        if (c<d) {min2=c;} else {min2=d;}
        rezultMax = min1<min2? min2:min1;
        System.out.println("vers.1 - rezult is: " + rezultMax);
        //ver.2
        System.out.println("vers.2 - rezult is: " + Math.max(Math.min(a,b),Math.min(c,d)));
    }


    // #3 Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    public static void task9 () {
        System.out.println("Enter А(х1,у1), В(х2,у2) и С(х3,у3) (points must be different): ");
        System.out.println(" x1= ");
        double x1 = enterVar();
        System.out.println(" y1= ");
        double y1 = enterVar();
        System.out.println(" x2= ");
        double x2 = enterVar();
        System.out.println(" у2= ");
        double y2 = enterVar();
        System.out.println(" x3= ");
        double x3 = enterVar();
        System.out.println(" у3= ");
        double y3 = enterVar();

        boolean chekPintsToDifferent = true;
        if ((x1 == x2 && y1 == y2) || (x2 == x3 && y2 == y3) || (x3 == x1 && y3 == y1)) {
            chekPintsToDifferent = false;
            System.out.println("Points must be different, because in other case it always located on 1 strait line ");
        }

        if (chekPintsToDifferent == true) {
            if ((x3 - x1) / (x2 - x1) - (y3 - y1) / (y2 - y1) == 0) {
                System.out.println("the points are located on 1 straight line");
            } else {
                System.out.println("the points are not located on 1 straight line");
            }


        }
    }

    // #4 Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие
    public static void task10 () {
        System.out.println("Enter dimensions of hole A , B : ");
        System.out.println(" A= ");
        double a = enterVar();
        System.out.println(" B= ");
        double b = enterVar();
        System.out.println("Enter dimensions of Brick x,y,z: ");
        System.out.println(" x= ");
        double x = enterVar();
        System.out.println(" у= ");
        double y = enterVar();
        System.out.println(" z= ");
        double z = enterVar();







    }



} // end class
