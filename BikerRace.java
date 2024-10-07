// package java_2024.lab_work;

import java.util.Scanner;

public class BikerRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] speeds = new double[5];
        double totalSpeed = 0;

        // Taking input speeds of five bikers
        System.out.println("Enter the speeds of 5 bikers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed of biker " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
            totalSpeed += speeds[i];
        }

        // Calculate the average speed
        double averageSpeed = totalSpeed / 5;

        // Display the average speed
        System.out.println("Average speed: " + averageSpeed);

        // Find and display the qualifying bikers
        System.out.println("Qualifying bikers' speeds:");
        boolean hasQualifiers = false;
        for (double speed : speeds) {
            if (speed > averageSpeed) {
                System.out.println(speed);
                hasQualifiers = true;
            }
        }

        // If no biker qualifies
        if (!hasQualifiers) {
            System.out.println("No biker qualifies the race.");
        }
        scanner.close();
    }
}
