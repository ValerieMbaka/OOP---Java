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
                
                System.out.println("Student marks before sorting are as below: ");
                for (short s:marks) {
                        System.out.print(s + ", ");
                }
                System.out.println();
                
                sortArray(marks);
                System.out.println("Student marks after sorting in descending order are as below: ");
                for (short mark : marks) {
                        System.out.print(mark + ", ");
                }
        }
        
        public static void sortArray(short[] marks) {
                int length = marks.length;
                short temp;
                boolean swapped;
                
                for (int i = 0; i < length - 1; i++) {
                        swapped = false;
                        
                        for (int j = 0; j < length - i - 1; j++) {
                                if (marks[j] < marks[j + 1]) { // Swap if next element is larger
                                        temp = marks[j];
                                        marks[j] = marks[j + 1];
                                        marks[j + 1] = temp;
                                        swapped = true;
                                }
                        }
                }
               
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
                
                myArray();
                
                // sum(5, 3);
                // sum(8, 1, 4, 6, 7);
                // sum(20, 22, 71, 41, 32, 57);
        }
}
