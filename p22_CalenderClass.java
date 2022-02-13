package com.example;

import java.util.Calendar;
import java.util.TimeZone;

public class p22_CalenderClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Calender type is : "+c.getCalendarType());
        System.out.println("Time zone is : "+c.getTimeZone());

        Calendar sc = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println("Time zone of sc calender is : "+sc.getTimeZone());
        System.out.println("Time zone of sc calender in simple term is : "+sc.getTimeZone().getID());
        System.out.println("Time now is : "+c.getTime());
        System.out.println("Hour of day now : "+c.get(Calendar.HOUR));
        System.out.println("Minute of hour now : "+c.get(Calendar.MINUTE));
        System.out.println("Second of current minute is : "+c.get(Calendar.SECOND));
        System.out.println("Todays Date is "+c.get(Calendar.DATE));
        System.out.println("Time in clock >> "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE));
        System.out.println("Precise Time in clock >> "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
