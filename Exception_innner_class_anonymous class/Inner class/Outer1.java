public class Outer1 {
 
    private int a = 2;
 
    Outer1(){
       a = 5;
    }
    class Nested {
        Nested() {
            System.out.print("-a"+a);
            a = 3;
        }
    }
    public static void main(String[] args) {
        Nested nested = new Outer1().new Nested();
    }
}