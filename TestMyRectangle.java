public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1,3);
        MyPoint bottomRight = new MyPoint(2,4);
        MyRectangle r1 = new MyRectangle(topLeft, bottomRight);

        System.out.println("Area = " + r1.Area());
        System.out.println("Perimeter = " + r1.getPerimeter());
        System.out.println(r1);
    }
}
