package shape;

public class Graph {
    public static void main(String[] args) {
       Rectangle r = new Rectangle(3,4,10,30);
       System.out.println(r);
       System.out.printf("넓이: %10.2f, 둘레: %10.2f \n",r.getArea(),r.getCircum());

        Triangle t = new Triangle(3,4,10,30);
        System.out.println(t);
        System.out.printf("넓이: %10.2f, 둘레: %10.2f \n",t.getArea(),t.getCircum());

        Circle c = new Circle(3,4,6);
        System.out.println(c);
        System.out.printf("넓이: %10.2f, 둘레: %10.2f \n",c.getArea(),c.getCircum());
    }
}
