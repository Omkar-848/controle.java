package javacourse.Controlestatement;
//In Java, control statements are used to control the flow of execution based on certain conditions. 
//These statements allow you to execute different blocks of code depending on whether a specific condition is true or false. 
//There are several types of control statements in Java that deal with conditions:


public class if_condition {
    public static void main(String[] args) {

        // 1. If Statement
        int number = 10;
        if (number > 5) {
            System.out.println("The number is greater than 5.");
        }
        

        // 2. If-Else Statement
        number = 3;
        if (number > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is less than or equal to 5.");
        }
        

        // 3. If-Else If-Else Statement
        number = 7;
        if (number > 10) {
            System.out.println("The number is greater than 10.");
        } else if (number == 7) {
            System.out.println("The number is equal to 7.");
        } else {
            System.out.println("The number is less than 7.");
        }
        

        // 4. Switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        
        // 5. Ternary Operator
        number = 10;
        String result = (number > 5) ? "Greater than 5" : "Less than or equal to 5";
        System.out.println(result);
        

        // 6. While Loop
        int i = 0;
        while (i < 5) {
            System.out.println("i is " + i);
            i++;
        }

        
        // 7. Do-While Loop
        i = 0;
        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 5);
        

        // 8. For Loop
        for (i = 0; i < 5; i++) {
            System.out.println("i is " + i);
        }
    }
}

