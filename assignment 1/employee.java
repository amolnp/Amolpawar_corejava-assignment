class employee{
    int id;
    String name;
    int salary;

   void display() {
    
     System.out.println("Id: " + id);
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
    }
}

class Testemployee {
    
     public static void main(String [] args) 
{
      employee e = new employee();
 
     e.id = 18;
     e.name = "Amol";
     e.salary = 50000;
     
     e.display();
    }
}