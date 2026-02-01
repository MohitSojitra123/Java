// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be 
// taken from user). 

import java.util.Scanner;

public class Program_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-12): ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minute = sc.nextInt();

        // Validate input
        if (hour < 0 || hour > 12 || minute < 0 || minute > 59) {
            System.out.println("Invalid input!");
            return;
        }

        // Calculate angles
        double hourAngle = (hour % 12) * 30 + (minute * 0.5);
        double minuteAngle = minute * 6;

        // Find absolute difference
        double angle = Math.abs(hourAngle - minuteAngle);

        // Get smaller angle
        angle = Math.min(angle, 360 - angle);

        System.out.println("Angle between hour and minute hand = " + angle + " degrees");

        sc.close();
    }
}
