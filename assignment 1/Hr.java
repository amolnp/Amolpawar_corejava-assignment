class Hr {
    int id;
    String name;
    int salary;
    int commission;
   
    void display() {
    
    System.out.println("Id : " + id);
    System.out.println("Name : " + name);
    System.out.println("Salary : " + salary);
    System.out.println("Commission : " + commission);
   }
}
class TestHr { 

     public static void main(String [] args) {

     Hr H = new Hr();

     H.id = 18;
     H.name = "amol";
     H.salary = 45000;
     H.commission = 25;

     H.display();
   }
}




 
