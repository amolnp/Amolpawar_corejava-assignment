class Student
{
    int rollNo;
    String name;
    double percentage;
}


class Employee
{
    int id;
    String name;
    double annualSalary;
}


class Bank
{
    void approveLoan(Student s)
    {
        if (s.percentage > 80)
        {
            System.out.println("Student Name: " + s.name);
            System.out.println("Loan Approved: Rs. 2,00,000");
        }
        else if (s.percentage >= 60)
        {
            System.out.println("Student Name: " + s.name);
            System.out.println("Loan Approved: Rs. 1,00,000");
        }
        else if (s.percentage >= 40)
        {
            System.out.println("Student Name: " + s.name);
            System.out.println("Loan Approved: Rs. 50,000");
        }
        else
        {
            System.out.println("Student Name: " + s.name);
            System.out.println("No Loan Approved");
        }
    }


    void approveLoan(Employee e)
    {
        System.out.println("Employee Name: " + e.name);

        if (e.annualSalary > 12)
        {
            System.out.println("Loan Approved: Rs. 7,00,000");
        }
        else if (e.annualSalary >= 10)
        {
            System.out.println("Loan Approved: Rs. 6,00,000");
        }
        else if (e.annualSalary >= 6)
        {
            System.out.println("Loan Approved: Rs. 5,00,000");
        }
        else if (e.annualSalary >= 4)
        {
            System.out.println("Loan Approved: Rs. 4,00,000");
        }
        else
        {
            System.out.println("No Loan Approved");
        }
    }
}


class TestLoan
{
    public static void main(String[] args)
    {
        Student s = new Student();

        s.rollNo = 101;
        s.name = "Amol";
        s.percentage = 85;

        Employee e = new Employee();

        e.id = 201;
        e.name = "Rahul";
        e.annualSalary = 8;

        Bank b = new Bank();

        b.approveLoan(s);

        System.out.println();

        b.approveLoan(e);
    }
}