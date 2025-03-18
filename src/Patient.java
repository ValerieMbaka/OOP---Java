import java.util.Scanner;

public class Patient {
        private static String hospital;
        private static Scanner reader = new Scanner(System.in);
        private String name;
        private String gender;
        private short yob;
        
        public Patient() {
                System.out.println("Enter patient's name: ");
                name = reader.nextLine();
                System.out.println("Enter patient's gender: ");
                gender = reader.nextLine();
                System.out.println("Enter patient's year of birth: ");
                yob = reader.nextShort();
                System.out.println("Enter the name of the hospital: \n");
                hospital = reader.nextLine();
        }
        
        public void setHospital() {
                System.out.print("Enter new name of the hospital: ");
                hospital = reader.nextLine();
        }
        
        public void setName() {
                System.out.println("Patient's name is " + name + "\nEnter new name for " + name);
                name = reader.nextLine();
        }
        
        public String getName(){
                return name;
        }
        
        public void setGender() {
                System.out.println("Patient's gender is " + gender + "\nEnter new gender: ");
                gender = reader.nextLine();
        }
        
        public String getGender(){
                return gender;
        }
        
        public void setYob() {
                System.out.println("Patient's year of birth is " + name + "\nEnter new year of birth: ");
                yob = reader.nextShort();
        }
        
        public int getYob(){
                return yob;
        }
        
        public void viewDetails() {
                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Year of Birth: " + yob);
                System.out.println("Hospital: " + hospital);
        }
        
        public static void array1() {
                String[] names = {"John", "Jane", "Peter"};
                String[] places = new String[4];
                
                for (byte x = 0; x < places.length; x++) {
                        System.out.println("Enter place " + (x + 1) + " you wish to visit: ");
                        places[x] = reader.nextLine();
                }
                System.out.println("\nThese are our local tourists: ");
                
                for (String s : names) {
                        System.out.print(s + " , ");
                }
                System.out.println("\nThey have visited these places: ");
                
                for (String p : places) {
                        System.out.print(p + " , ");
                }
        }
        
        public static void main(String[] args) {
                
                Patient P1 = new Patient();
                
                P1.viewDetails();
                // P1.setName();
                // System.out.println("Name changed to " + P1.getName() +"\n");
                
                array1();
                
        }
        
}


