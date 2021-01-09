package com.company;

class BubbleSort {

    void bubbleSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
    }


    void printMostExpensive(String[] array) {
        System.out.println("The most expensive item, with a price of is: " + array[array.length - 1]);
    }

    void printCheapest(String[] array) {
        System.out.println("The cheapest item, with a price of is: " + array[0]);
    }
}
