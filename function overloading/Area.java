class Shape
{
    double area;
}

class Triangle
{
    double base;
    double height;
}

class Rectangle
{
    double length;
    double breadth;
}

class Circle
{
    double radius;
}

class AreaCalculator
{
    double calculateArea(Triangle t)
    {
        return 0.5 * t.base * t.height;
    }

    double calculateArea(Rectangle r)
    {
        return r.length * r.breadth;
    }

    double calculateArea(Circle c)
    {
        return 3.14 * c.radius * c.radius;
    }
}

class TestArea
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle();
        t.base = 10;
        t.height = 5;

        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 6;

        Circle c = new Circle();
        c.radius = 7;

        AreaCalculator a = new AreaCalculator();

        System.out.println("Triangle Area = " + a.calculateArea(t));
        System.out.println("Rectangle Area = " + a.calculateArea(r));
        System.out.println("Circle Area = " + a.calculateArea(c));
    }
}