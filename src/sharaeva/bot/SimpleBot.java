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

    public static void main(String[] args) {
        SimpleBot bot = new SimpleBot("Ivan");
        bot.introduce();
        bot.askName();
        bot.guessAge();
    }
}
