import java.util.Scanner;

public class Coursework {
        protected static String unitName;
        protected int score;
        protected static Scanner input = new Scanner(System.in);
        
        public Coursework() {
                System.out.println("Enter the Unit Name: ");
                unitName = input.nextLine();
                System.out.println("Enter the marks scored in " + unitName + ": ");
                score = input.nextInt();
                input.nextLine();
        }
        
        public double rawScores(int ...catMarks) {
                int sum = 0;
                double average = 0;
                for(int x: catMarks) {
                        sum += x;
                }
                average = (double) sum / catMarks.length;
                return average;
        }
        
        public void attendees() {
                int totalStudents;
                System.out.println("Enter the number of students enrolled for " +  unitName + " : ");
                totalStudents = input.nextInt();
                input.nextLine();
                
                String[] students = new String[totalStudents];
                for (int i = 0; i < students.length; i++) {
                        System.out.println("Enter the name of the student " + (i + 1) + " : ");
                        students[i] = input.nextLine();
                }
        }
        
}
