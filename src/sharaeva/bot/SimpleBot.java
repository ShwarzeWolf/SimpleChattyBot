package sharaeva.bot;

import java.time.LocalDate;

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

    public static void main(String[] args) {
        SimpleBot bot = new SimpleBot("Ivan");
        bot.introduce();
    }
}
