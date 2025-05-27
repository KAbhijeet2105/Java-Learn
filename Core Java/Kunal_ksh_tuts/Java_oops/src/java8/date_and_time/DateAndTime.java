package java8.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {



    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();

        System.out.println(dt);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDate = ldt.format(ft);

        System.out.println(formatedDate);


    }


}
