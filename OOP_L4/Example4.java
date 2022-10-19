class Example4 {

  String languages;

  // constructor accepting single value
  Example4(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Example4 obj1 = new Example4("Java");
    Example4 obj2 = new Example4("Python");
    Example4 obj3 = new Example4("C");
  }
}