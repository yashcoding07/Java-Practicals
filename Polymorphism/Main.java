class Main{
    public static void main(String[] args){
        Shape s1 = new Circle(12.0);
        s1.area();
        Shape s2 = new Rectangle(4.0, 2.0);
        s2.area();
    }
}

class Shape{
    protected double area;

    void area(){
        System.out.println("Area is not defined.");
    }
}

class Circle extends Shape{
    protected double radius;
    protected final double Pie = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    void area(){
        double area = Pie * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

class Rectangle extends Shape{
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area(){
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}