package sharaeva.bot;

import java.time.LocalDate;
import java.util.Scanner;

public class SimpleBot {
    private String name;
    private LocalDate birthDate;

    public SimpleBot(String name){
        this.name = name;
        this.birthDate = LocalDate.now();
    }

    public void introduce(){
        System.out.println("Hello! My name is " + this.name + ".");
        System.out.println("I was created in " + this.birthDate.getYear() + ".");
    }

    public void askName(){
        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("What a great name you have, " + userName + "!");
    }

    public void guessAge(){
        System.out.println("Let me guess your age.\n" +
                "Say me remainders of dividing your age by 3, 5 and 7.");

        Scanner scanner = new Scanner(System.in);

        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();

        int age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    public void countToNumber(){
        System.out.println("Now I will prove to you that I can count to any number you want.");
        Scanner scanner = new Scanner(System.in);

        int lastNumber = scanner.nextInt();

        for (int i = 0; i <= lastNumber; ++i){
            System.out.println(i + "!");
        }
    }

    public void test(){
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");

        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();

        while (result != 2){
            System.out.println("Please, try again.");
            result = scanner.nextInt();
        }
    }

    public void end(){
        System.out.println("Congratulations, have a nice day!");
    }

    public static void main(String[] args) {
        SimpleBot bot = new SimpleBot("Ivan");
        bot.introduce();
        bot.askName();
        bot.guessAge();
        bot.countToNumber();
        bot.test();
        bot.end();
    }
}
