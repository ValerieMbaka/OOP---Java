public class MyDemo implements Sample {
        @Override
        public void test() {
                System.out.println("Learning at " + NAME);
        }
        
        public static void main(String[] args) {
                MyDemo demo = new MyDemo();
                demo.test();
        }
}
