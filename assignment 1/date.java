class Date {

    int day;
    int month;
    int year;
    String dow;

    void setDay(int day) {
        this.day = day;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setDow(String dow) {
        this.dow = dow;
    }

    int getDay() {
        return day;
    }
}

class test1 {

    public static void main(String[] args) {

        Date d1; // reference
        d1 = new Date();

        d1.day = 30;
        d1.month = 9;
        d1.year = 2026;
        d1.dow = "wednesday";

        System.out.println("Day is: " + d1.day);
        System.out.println("Month is: " + d1.month);
        System.out.println("Year is: " + d1.year);
        System.out.println("Day of week is: " + d1.dow);
    }
}

class test2 {

    public static void main(String[] args) {

        Date d1; // reference
        d1 = new Date();

        d1.setDay(2);
        d1.setMonth(10);
        d1.setYear(2026);
        d1.setDow("thursday");

        Date d2; // reference
        d2 = new Date();

        d2.setDay(10);
        d2.setMonth(10);
        d2.setYear(2026);
        d2.setDow("friday");

        if (d1.getDay() > d2.getDay()) {
            System.out.println("D1 is greater!!!");
        } else {
            System.out.println("D2 is greater!!!");
        }
    }
}