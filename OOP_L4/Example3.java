class Company {
  String name;

  // public constructor
  public Company() {
    name = "Programiz";
  }
}

class Example3 {
  public static void main(String[] args) {

    // object is created in another class
    Company obj = new Company();
    System.out.println("Company name = " + obj.name);
  }
}