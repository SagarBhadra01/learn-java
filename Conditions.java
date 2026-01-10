public class Conditions {
    public static void main(String[] args) {
        int number = 10;

        // If-Else Statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch Statement
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is " + dayName + ".");

        // Ternary Operator
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result + ".");

        // Nested If Statement
        int age = 25;   
        if (age >= 18) {
            if (age < 65) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior Citizen");
            }
        } else {
            System.out.println("Minor");
        }

    }
}
