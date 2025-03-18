import java.util.Scanner;

public class Operator {
        
        private static Scanner input = new Scanner(System.in);
        
        public static void myArray() {
                String[] names = new String[3];
                short[] marks = {55, 42, 81, 32, 67};
                
                System.out.println("Student names");
                for (byte x = 0; x < names.length; x++) {
                        System.out.println("Enter name of student " + (x + 1) + " :");
                        names[x] = input.nextLine();
                }
                
                System.out.println("Student marks are as below: ");
                for (short s:marks) {
                        System.out.print(s + ", ");
                }
                System.out.println();
        }
        
        public static void sum(int ...numbers) {
                long total = 0;
                for (int x:numbers) {
                        total += x;
                }
                System.out.println("The sum of all the numbers is " + total);
        }
        
        public static void main(String[] args) {
                
                // Triangle t = new Triangle();
                // Rectangle r = new Rectangle((short) 8, (short) 5);
                
                // r.getArea();
                // t.getArea();
                // r.setDimensions();
                // t.setDimensions();
                
                // System.out.println("Rectangle Length is: " + r.getLength());
                
                // myArray();
                
                sum(5, 3);
                sum(8, 1, 4, 6, 7);
                sum(20, 22, 71, 41, 32, 57);
        }
}
