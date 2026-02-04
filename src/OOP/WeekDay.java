package OOP;

import java.util.Scanner;

public class WeekDay {

    private int num;   // encapsulation

    // constructor only initializes data
    public WeekDay(int num) {
        this.num = num;
    }

    // method contains business logic
    void printWeekDay() {
        switch (num) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println(
                        "You have entered an invalid weekday.\nPlease enter a value from 1 to 7."
                );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Hello User, nice to meet you!\nEnter weekday number (Sunday = 1):"
        );

        int num = sc.nextInt();

        WeekDay w1 = new WeekDay(num);
        w1.printWeekDay();   // explicit call

        sc.close();
    }
}
