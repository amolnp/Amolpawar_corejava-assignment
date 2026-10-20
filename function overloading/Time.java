class Time
{
    int hr;
    int min;
    int sec;


    // Add two Time objects
    Time add(Time t)
    {
        Time result = new Time();

        result.sec = this.sec + t.sec;
        result.min = this.min + t.min;
        result.hr = this.hr + t.hr;

        if (result.sec >= 60)
        {
            result.sec = result.sec - 60;
            result.min++;
        }

        if (result.min >= 60)
        {
            result.min = result.min - 60;
            result.hr++;
        }

        if (result.hr >= 24)
        {
            result.hr = result.hr - 24;
        }

        return result;
    }


    // Add hours
    Time add(int hours)
    {
        Time result = new Time();

        result.hr = this.hr + hours;
        result.min = this.min;
        result.sec = this.sec;

        result.hr = result.hr % 24;

        return result;
    }


    // Add minutes
    Time add(int minutes, boolean isMinute)
    {
        Time result = new Time();

        result.hr = this.hr;
        result.min = this.min + minutes;
        result.sec = this.sec;

        result.hr = result.hr + result.min / 60;
        result.min = result.min % 60;

        result.hr = result.hr % 24;

        return result;
    }


    // Add seconds
    Time add(int seconds, char isSecond)
    {
        Time result = new Time();

        result.hr = this.hr;
        result.min = this.min;
        result.sec = this.sec + seconds;

        result.min = result.min + result.sec / 60;
        result.sec = result.sec % 60;

        result.hr = result.hr + result.min / 60;
        result.min = result.min % 60;

        result.hr = result.hr % 24;

        return result;
    }


    void display()
    {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}


class TestTime
{
    public static void main(String[] args)
    {
        Time t1 = new Time();

        t1.hr = 10;
        t1.min = 45;
        t1.sec = 50;


        Time t2 = new Time();

        t2.hr = 5;
        t2.min = 30;
        t2.sec = 20;


        Time t3 = t1.add(t2);

        System.out.print("Time Addition: ");
        t3.display();


        Time t4 = t1.add(5);

        System.out.print("After Adding Hours: ");
        t4.display();


        Time t5 = t1.add(30, true);

        System.out.print("After Adding Minutes: ");
        t5.display();


        Time t6 = t1.add(40, 's');

        System.out.print("After Adding Seconds: ");
        t6.display();
    }
}