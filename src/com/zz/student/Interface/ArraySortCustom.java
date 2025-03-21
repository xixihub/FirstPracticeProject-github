package com.zz.student.Interface;

import lombok.Data;

import java.util.Comparator;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class ArraySortCustom {
    public static void arraySortCustom(int[] arr, Comparator c)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
    }
    public static void bookSort(Book[] arr, Comparator c)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    Book temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
   }
}
@Data
class Book{
    private double price;
    private  String name;
    public Book(double price, String name)
    {
        this.price = price;
        this.name = name;
    }
}