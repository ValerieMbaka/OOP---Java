// Introduction to Java Programming and input using Scanner class and its methods
import java.util.Scanner;

public class Introduction {
        public static void main(String[] args) {
                System.out.println("Hello, World!");
                System.out.println("5 + 7");
                System.out.println(5 + 7);
                System.out.println("3 + 2 = " + (3 + 2));
                
                String name;
                short yob, currentYear;
                Scanner reader = new Scanner(System.in);
                System.out.print("Enter your name: ");
                name = reader.nextLine();
                System.out.print( name + " when were you born? ");
                yob = reader.nextShort();
                System.out.print("Enter Current Year: ");
                currentYear = reader.nextShort();
                System.out.println(name + " is " + (currentYear - yob) + " years old.");
        }
}