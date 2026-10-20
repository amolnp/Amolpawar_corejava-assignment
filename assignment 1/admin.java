class admin {
      int id;
      String name;
      int salary;

     void display() {
      System.out.println("Id: " + id);
      System.out.println("Name: " + name);
      System.out.println("Salary: " + salary);
    }
}
class Testadmin {
      public static void main(String [] args) {
      
      admin a = new admin();

      a.id = 14;
      a.name = "Amol";
      a.salary = 40000;
   
      a.display();
    }
}
      

      