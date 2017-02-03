package com.company;

/**
 * Created by cm921 on 1/30/17.
 */
import java.util.*;

public class MessageList {

    public ArrayList<Message> log = new ArrayList();

    public MessageList(){
        //Epic Code
        //And such and thangs
    }

    public void retrieveLog(){
        for (int i = 0; i < log.size(); i++) {
            System.out.print(log.get(i).send + " (" + log.get(i).date + ", " + log.get(i).timestamp + "): ");
            System.out.println(log.get(i).message);
        }
    }

    public void fxingMsg (Message msg){
        log.add(msg);
    }
}