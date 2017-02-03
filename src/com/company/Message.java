package com.company;

/**
 * Created by cm921 on 1/30/17.
 */
import java.util.*;
import java.text.*;

public class Message {
    public String send;
    public String message;
    public String timestamp;
    public String date;

    public Message (String sndr, String msg) {
        timestamp = returnTime();
        date = returnDate();
        send = sndr;
        message = msg;
    }
    public String returnTime() {
        DateFormat timeQ = new SimpleDateFormat ("hh:mm:ss a");
        Date time = new Date ();
        return timeQ.format(time.getTime());
    }
    public String returnDate() {
        DateFormat dateQ = new SimpleDateFormat ("MM/dd/yy");
        Date date = new Date();
        return dateQ.format(date.getTime());
    }
}