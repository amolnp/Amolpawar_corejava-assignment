class placedStudent{
      int frn;
      String studentName;
      int distanceCovered;
      String companyName;
      String designation;

      void display()
      {
         System.out.println("FRN: " + frn);
         System.out.println("StudentName : " + studentName);
         System.out.println("DistanceCovered: " + distanceCovered);
         System.out.println("CompanyName: " + companyName);
         System.out.println("Designation: " + designation);
       }
}

class TestPlacedStudent
{
     public static void main(String [] args){
         
         placedStudent p = new placedStudent();
           
        p.frn = 100;
        p.studentName = "Amol";
        p.distanceCovered = 10;
        p.companyName = "Google";
        p.designation = "javaDeveloper";
       
       p.display();
    }
}

      