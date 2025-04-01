public class Casual extends Employee implements Sample {
        private int daysWorked;
        private double dayRate;
        
        public Casual() {
                super();
                System.out.println("Enter the number of days worked: ");
                daysWorked = input.nextInt();
                System.out.println("Enter the rate of pay per day: ");
                dayRate = input.nextDouble();
        }
        
        public void setGrossPay () {
                grossPay = daysWorked * dayRate;
        }
        
        @Override
        public void test() { }
        
        public static void main(String[] args) {
               Casual c1 = new Casual();
               c1.computeSalary();
        }
        
}
