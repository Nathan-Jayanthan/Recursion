package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fact(5));



    }
    public static long fact(long n){
        if(n<=1){
            //base case
            return 1;

        }
        else{
            return n* fact(n-1);
        }

    }

}

