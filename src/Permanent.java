public class Permanent extends Employee{
        private double basicPay;
        private double allowances;
        
        public Permanent() {
                super();
                System.out.println("Enter the basic pay of the employee: ");
                basicPay = input.nextDouble();
                System.out.println("Enter the allowances of the employee: ");
                allowances = input.nextDouble();
        }
        
        public void setGrossPay() {
                grossPay =   basicPay + allowances;
        }
        
        public static void main(String[] args) {
                Permanent p1 = new Permanent();
                p1.computeSalary();
        }
        
}
