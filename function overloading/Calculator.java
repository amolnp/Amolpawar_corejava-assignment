class Calculator{
       int add(int a, int b){
           return a+b;
       }

       double add(double a, double b){
           return a+b;
       }

       double add(int a, double b){
           return a+b;
       }

       double add(double a, int b){
           return a+b;
       }

       int sub(int a, int b){
           return a-b;
        }

        double sub(double a, double b){
           return a-b;
        }

        double sub(int a, double b){
           return a-b;
        }

        double sub(double a, int b){
           return a-b;
        }
  
        int mul(int a, int b){
            return a*b;
         }

         double mul(double a, double b){
            return a*b;
         }

         double mul(int a, double b){
            return a*b;
         }

         double mul(double a, int b){
            return a*b;
         }

         int div(int a, int b){
             return a/b;
         }

         
         double div(double a, double b){
             return a/b;
         }

         
         double div(int a, double b){
             return a/b;
         }

         
         double div(double a, int b){
             return a/b;
         }
}
    class TestCalculator {
    public static void main(String [] args){

        Calculator c = new Calculator();
        
        System.out.println("Addition:");
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.2,20.5));
        System.out.println(c.add(10,20.3));
        System.out.println(c.add(10.5,20));

        System.out.println("\nSubstraction:");
        System.out.println(c.sub(10,20));
        System.out.println(c.sub(10.4,20.6));
        System.out.println(c.sub(10,20.2));
        System.out.println(c.sub(10.8,20));

        System.out.println("\nMultiply:");
        System.out.println(c.mul(10,20));
        System.out.println(c.mul(10.4,20.6));
        System.out.println(c.mul(10,20.5));
        System.out.println(c.mul(10.3,20));

        System.out.println("\nDivision:");
        System.out.println(c.div(10,20));
        System.out.println(c.div(10.4,20.6));
        System.out.println(c.div(10,20.5));
        System.out.println(c.div(10.3,20));
     }
}

