package com.company;


import java.util.Scanner;

public class Main {




        public static   void Task41()
        {
                System.out.println("::TASK41:: \n Дано натуральное число n. Вычислить у = 2 · 4 · 6 ... (2n).");
                Scanner sc = new Scanner(System.in);

                System.out.print("Введіть N >>");
                int n = sc.nextInt();
                int delta =2;
                int y=1;
                int delta2=0;

                for (;delta <= n; delta =delta+2, delta2 = delta2+2)
                {

                y=delta2*delta;

                        System.out.println("Delta2>>"+delta2);
                        System.out.println("Delta>>"+delta);
                        System.out.println("Y>>"+y);
                }

                System.out.println("Відповідь Y="+y);
        }

        public  static void   Task66()
        {
                System.out.println("::TASK66:: \n Составить программу для расчёта степени n вещественного числа а (n — натуральное число).");
                Scanner sc = new Scanner(System.in);



                System.out.print("Введіть A >");
                int a = sc.nextInt();
                System.out.print("Введіть N >");
                int n = sc.nextInt();

                System.out.println("a > "+ a);
                System.out.println("n > "+ n);
                System.out.println("Число A в степені N >> "+ Math.pow(a, n));
        }

        public static void  Task91()
        {
                System.out.println("::Task91:: \n Даны натуральное число n и вещественные числа а1, a2, …, аn. Определить среднее арифметическое этих чисел.");
                Scanner sc= new Scanner(System.in);
                System.out.println("Введіть N>>");
                double n = sc.nextInt();
                double delta=0;
                double a=0;
                double result;

        for (int i=0; i<=n;i++, delta++)
        {
                a += delta;

                System.out.println("Delata>>"+delta);
                System.out.println("A>>"+a);



        }
        result=a/n;
        System.out.println("Result>>"+result);

        }

        public  static void   Task116()
        {
                System.out.println("::TASK116:: \n Составить программу, которая печатает таблицу умножения и сложения натуральных чисел в десятичной системе счисления.");

                int j=1;
                int result;
                int limit=100;
                int stop=1;
                int num1;
                int num10;
                int num100;

                for (int i=0;i<=limit*stop;i++ )
                {
                        result = i * j;
                        System.out.println(i + " * " + j + " = " + result);

                        num100 = result/100;
                        num10 = (result % 100)/10;
                        num1 = result % 10;
                         System.out.println(result + " =  " +num100 + " (10^2) +  "+ num10 + " (10^1) +  " + num1 + " (10^0)");
                        if (i == 10)
                        {
                                i=0;
                                j++;
                        }
                        if (j==limit)
                        {
                        stop=0;

                        }
                        System.out.println("::TASK116:: \n Составить программу, которая печатает таблицу умножения и сложения натуральных чисел в десятичной системе счисления.");

                }
        }
        public static void  Task141()
        {
                System.out.println("::TASK141:: \n Индийский математик С. Рамануджан обратил внимание на то, что число 1729 можно представить в виде суммы кубов двух чисел двумя способами. Найдите эти числа.");

                int result;
                int stop=1;
                int num1=1;
                int num2=1;

                for (int i=1;stop >0; i++)
                {

                        int a = (int) ( Math.random() * 1729 );
                        System.out.println(a);
                        int b = (int) ( Math.random() * 1729 );
                        System.out.println(b);


                        num1 = a*a*a;
                        num2=b*b*b;

                result = num1 + num2;
                        if ( result ==1729)
                        {
                                        stop = 0;
                                        System.out.println("Число a >> " + a);
                                        System.out.println("число b >> " + b);
                                System.out.println("::TASK141:: \n Индийский математик С. Рамануджан обратил внимание на то, что число 1729 можно представить в виде суммы кубов двух чисел двумя способами. Найдите эти числа.");

                        }

                }
        }


                public  static void main(String[] args)
                {
                       Scanner sc = new Scanner(System.in);
                       System.out.print("Введіть номер задачі >>  ");
                        int x= sc.nextInt();

                        switch (x)
                        {
                                case (1):
                                {
                                        Task41();
                                }
                                break;

                                case (2):
                                {
                                        Task66();
                                }
                                break;

                                case (3):
                                {
                                        Task91();
                                }
                                break;

                                case (4):
                                {
                                        Task116();
                                }
                                break;

                                case (5):
                                {
                                        Task141();
                                }
                                break;

                        }

                }

        }

