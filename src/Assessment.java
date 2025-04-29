public class Assessment extends Coursework{
        private int yearOfStudy;
        
        public Assessment() {
                super();
                System.out.println("Enter the Year of Study: ");
                yearOfStudy = input.nextInt();
                input.nextLine();
        }
        
        public static void main(String[] args) {
                Assessment assessment1 = new Assessment();
                assessment1.attendees();
                
                Coursework coursework1 = new Coursework();
                coursework1.attendees();
        }
}
