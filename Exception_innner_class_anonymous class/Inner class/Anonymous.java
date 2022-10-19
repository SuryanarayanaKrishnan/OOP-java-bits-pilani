public class Anonymous
{
  int x = 6;
   
  public static void main(String[] args)
  {
    Anonymous an = new Anonymous();
    Length length = new Length()
    {
      public void getMessage(String str)
      {
        System.out.print(str + x);
      }
      public void getNumber(int i)
      {
        System.out.print("x" + i);
      }
    };
    length.getMessage("y");
  }
}

interface Length
{
  int x = 8;
   
  void getMessage(String message);
  void getNumber(int i);
}
