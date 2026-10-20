class salesManager {
       int id;
       String name;
       int salary;
       int incentive;
       int target;

     void display() {
       System.out.println("Id: " + id);
       System.out.println("Name: " + name);
       System.out.println("Salary: " + salary);
       System.out.println("Incentive: " + incentive);
       System.out.println("Target: " + target);
     }
}
class TestsalesManager { 
       public static void main(String [] args) {

       salesManager s = new salesManager();

       s.id = 14;
       s.name = "Amit";
       s.salary = 60000;
       s.incentive = 10000;
       s.target = 100;

     s.display();
     }
}
      