package com.company;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        BubbleSort x = new BubbleSort();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the items");
        String item = scan.next();
        System.out.println("Please enter the price");
        int price = scan.nextInt();

        System.out.println("Please enter the items");
        String item1 = scan.next();
        System.out.println("Please enter the price");
        int price1 = scan.nextInt();

        System.out.println("Please enter the items");
        String item2 = scan.next();
        System.out.println("Please enter the price");
        int price2 = scan.nextInt();

        System.out.println("Please enter the items");
        String item3 = scan.next();
        System.out.println("Please enter the price");
        int price3 = scan.nextInt();

        System.out.println("Please enter the items");
        String item4 = scan.next();
        System.out.println("Please enter the price");
        int price4 = scan.nextInt();


        String[] combined = {price + " " + item, price1 + " " + item1, price2 + " " + item2, price3 + " " + item3, price4 + " " + item4};

        //int prices[] = {price, price1, price2, price3, price4};
        //String items[] = {item, item1, item2, item3, item4};


        x.bubbleSort(combined);
        x.printCheapest(combined);
        x.printMostExpensive(combined);
    }
}





