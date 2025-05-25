package am.picsartacademy.lesson3;

public class Lesson35 {
    public static void main(String[] args) {

        int a = 7;
        while (a < 5){
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(a);
        } while (a < 5) ;

        String[] weekDays = new String[7];
        weekDays[0] = "Sunday";
        weekDays[1] = "Monday";
        weekDays[2] = "Tuesday";
        weekDays[3] = "Wednesday";
        weekDays[4] = "Thursday";
        weekDays[5] = "Friday";
        weekDays[6] = "Saturday";

        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }

        for (int i = 0; i < weekDays.length; i++) {
            System.out.print(weekDays[i]);
            System.out.println(" is number " + (i + 1));

        }

        }

    }



