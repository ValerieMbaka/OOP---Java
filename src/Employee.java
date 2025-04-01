import java.util.Scanner;

public abstract class Employee {
        protected String name;
        protected String gender;
        protected double grossPay = 0;
        protected double tax;
        protected double netPay;
        protected Scanner input = new Scanner(System.in);
        
        public Employee() {
                System.out.println("Enter the name of the employee: ");
                name = input.nextLine();
                System.out.println("Enter the gender of the employee: ");
                gender = input.nextLine();
        }
        
        public void setName() {
                System.out.println("Employee's name is " + name + " Enter the new name of the employee: ");
                name = input.nextLine();
        }
        
        public void setGender() {
                System.out.println("Employee's gender is " + name + "Enter the new gender of the employee: ");
                gender = input.nextLine();
        }
        
        public abstract void setGrossPay();
        
        public void computeSalary() {
                setGrossPay();
                tax = 0.25 * grossPay;
                netPay = grossPay - tax;
                System.out.println("Gross Pay = " + grossPay);
                System.out.println("Tax = " + tax);
                System.out.println("Net Pay = " + netPay);
        }
        
}
