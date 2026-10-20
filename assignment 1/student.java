class Student{
       int frn;
       String studentName;
       double distanceConverted;
}
class Test{
      public static void main(String []args){

      Student s1 = new Student();
      
      s1.frn = 100;
      s1.studentName= "Amol";
      s1.distanceConverted = 30.5;
     System.out.println(s1.frn);
     System.out.println(s1.studentName);
     System.out.println(s1.distanceConverted);
   }  
}