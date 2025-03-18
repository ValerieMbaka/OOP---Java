import java.util.Scanner;

public class Rectangle {
        
        protected short length;
        protected short width;
        protected double area;
        private static Scanner reader = new Scanner(System.in);
        
        public Rectangle() {
                System.out.println("Enter the length: ");
                length = reader.nextShort();
                System.out.println("Enter the width: ");
                width = reader.nextShort();
        }
        
        public Rectangle(short length, short width) {
                super();
                this.length = length;
                this.width = width;
        }
        
        public void setDimensions () {
                System.out.println("The current length is " + length + " Enter the new length: ");
                length = reader.nextShort();
                System.out.println("The current width is " + width + " Enter the new width: ");
                width = reader.nextShort();
        }
        
        public short getLength() {
                return length;
        }
        
        public short getWidth() {
                return width;
        }
        
        public void getArea() {
                area = length * width;
                System.out.println("The area is: " + area + " square units");
        }
        
}
