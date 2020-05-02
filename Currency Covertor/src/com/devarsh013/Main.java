package com.devarsh013;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        while (true)
        {
            double amount=0;
            System.out.println("Enter Amount");
             amount=scanner.nextDouble();


        printFromChoice();
        int choice1=scanner.nextInt();
        printIntoChoice();
        int choice2=scanner.nextInt();


        switch (choice1) {
            case 1: {

                switch (choice2) {
                    case 1:
                        System.out.println("Same type of currency");
                        System.out.println("Amount is:" + amount);

                        break;
                    case 2:

                        amount *= 75.48;
                        System.out.println("Amount is:" + amount);

                        break;
                    case 3:

                        amount *= 0.92;
                        System.out.println("Amount is:" + amount);
                        break;


                }
                break;
            }
            case 2: {
                switch (choice2) {
                    case 1:

                        amount /= 75.48;
                        System.out.println("Amount is:" + amount);


                        break;
                    case 2:

                        System.out.println("Same type of currency");
                        System.out.println("Amount is:" + amount);


                        break;
                    case 3:

                        amount /= 81.95;
                        System.out.println("Amount is:" + amount);
                        break;


                }
                break;
            }
            case 3: {
                switch (choice2) {
                    case 1:

                        amount /= 0.92;
                        System.out.println("Amount is:" + amount);
                        break;
                    case 2:

                        amount *= 81.92;
                        System.out.println("Amount is:" + amount);

                        break;
                    case 3:

                        System.out.println("Same type of currency");
                        System.out.println("Amount is:" + amount);
                        break;


                }
                break;
            }
            case 4:
                break;


        }

        }



	// write your code here
    }

    public  static  void printFromChoice()
    {
        System.out.println("Convert Your money From:\n");

        System.out.println("1.Convert Your money from USD");
        System.out.println("2.Convert Your money from INR");
        System.out.println("3.Convert Your money from EURO");



        System.out.println("Enter Choice:");

    }
    public  static  void    printIntoChoice()
    {
        System.out.println("Convert Your money into ");

        System.out.println("1.Convert Your money into USD");
        System.out.println("2.Convert Your money into INR");
        System.out.println("3.Convert Your money into EURO");

        System.out.println("Enter Choice:");

    }
}
