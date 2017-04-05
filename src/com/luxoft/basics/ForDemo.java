package com.luxoft.basics;

public class ForDemo
{

    public static void main(String[] args)
    {
        System.out.println("Max + 1: " + (Integer.MAX_VALUE + 1));
        int a = 10;
        int b = 20;
    }
    public static int sum(int a, int b)
    {
        System.out.println("int sum");
        return a + b;
    }
    public static long sum(long a, long b)
    {
        System.out.println("long sum");
        return a + b;
    }

}
