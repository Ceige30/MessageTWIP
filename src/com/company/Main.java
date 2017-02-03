package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        MessageList msgLog = new MessageList();
        boolean looper1 = true;
        boolean looper2 = true;
        boolean breaker = false;
        String msg = "";
        String sender = "";
        String checker;

        while (looper1) {
            while (looper2) {
                System.out.println("Insert message. Type \"exit\" to stop the program..");
                msg = sc.nextLine();
                if (msg.equals("exit")) {
                    looper2 = false;
                    breaker = true;
                    looper1 = false;
                }else if (msg.length() == 0)
                    System.out.println("There is no message find one");
                else
                    looper2 = false;
            }
            looper2 = true;
            if (!breaker) {
                while (looper2) {
                    System.out.println("Please insert your name");
                    sender = sc.nextLine();
                    if (sender.length() == 0)
                        System.out.println("No name found");
                    else
                        looper2 = false;
                }
                looper2 = true;
                Message newMsg = new Message (sender, msg);

                msgLog.fxingMsg(newMsg);
                msgLog.retrieveLog();

                while (looper2) {
                    System.out.println("Would you like to send a message?");
                    System.out.println("Yes or No");
                    checker = sc.nextLine().toLowerCase();
                    if (checker.equals("yes")) {
                        looper2 = false;
                    } else if (checker.equals("no")) {
                        looper1 = false; looper2 = false;
                    } else
                        System.out.println("Invalid input");
                }
                looper2 = true;
                System.out.println("");
            }
        }
    }
}