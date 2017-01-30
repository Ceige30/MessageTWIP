package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean looper = true;
        int phoneumber = 0;
        System.out.println("Hello user 3454");
        while(looper){
            System.out.println("Please input a ten digit phone number by which you would like to text");
            try{
                phoneumber= sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Invalid input");
                throw e;
            }
            System.out.println(phoneumber);

        }
    }
}
