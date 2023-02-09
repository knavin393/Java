public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        D1L1();
        D2L2();
        D2L3();
        D3L1();
        D3L2();
        D3L3();
        D3L4();
        D3L5();
    }
    private static void D1L1(){
        day1assignment Day1assignment=new day1assignment();
        Day1assignment.lesson1();
    }
    private static void D2L2(){
        Day2Assignment day2assignment=new Day2Assignment();
        day2assignment.lesson2();
    }
    private static void D2L3(){
        Day2RegexExample day2RegexExample =new Day2RegexExample();
        day2RegexExample.pattern();
    }
    public static void D3L1() {
        Day3Assignment student = new Day3Assignment();
        student.setName("John Doe");
        student.setAge(20);
        student.setRollNumber(101);
        
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
    
    // Inheritance
    public static void D3L2() {
        Animal dog = new Dog();
        dog.makeSound();
    }

    // Abstraction
    public static void D3L3() {
        final int radius = 80;
        final int length = 80;
        final int breadth = 80;

        Rectangle rectangle = new Rectangle(length,breadth);
        rectangle.calculateArea();

        Circle circle = new Circle(radius);
        circle.calculateArea();
    }
    
    // Implementations
    public static void D3L4() {
        Drawable rectangle = new DrawRectangle();
        Drawable circle = new DrawCircle();
        rectangle.draw();
        circle.draw();
    }

    // Abstraction with an Implementations
    final static int radius = 80;
    final static int length = 80;
    final static int breadth = 80;

    public static void D3L5() {
        Drawable rectangle = new DrawRectangleImpl(length, breadth);
        Drawable circle = new DrawCircleImpl(radius);
        rectangle.draw();
        circle.draw();
    }

}


