package Circle;

public class ClientClass {
    public static void main (String[]args){
       Circle a = new Circle (5);
        System.out.println(a.getRadius());
        System.out.printf("%.2f%n", a.getArea());
        System.out.println(a.getNumberOfObject());
        // SET A NEW RADIUS
        a.setRadius(20);
        System.out.println("***************************************");
        System.out.println(a.getRadius());
        System.out.printf("%.2f%n", a.getArea());
        System.out.println(a.getNumberOfObject());






    }
}
