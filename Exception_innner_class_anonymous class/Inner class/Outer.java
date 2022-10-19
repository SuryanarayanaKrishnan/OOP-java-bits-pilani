class Outer {
 
   private int x = 12;
 
   class Inner {
      int x = 4;
      public Inner() {
         this.x += 3;
      }
      private void methodA(int x){
         x = this.x;
         System.out.print("x" + x);
      }
   }
   public static void main(String[] args){
      Inner inner = new Outer().new Inner();
      inner.methodA(5);
   }
}
