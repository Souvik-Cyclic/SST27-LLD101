
public class Demo05 {
    // static int areaAfterResize(Rectangle r){
    //     r.setWidth(5); r.setHeight(4); return r.area();
    // }
    public static void main(String[] args) {
        // System.out.println(areaAfterResize(new Rectangle())); // 20
        // System.out.println(areaAfterResize(new Square()));    // 16 (!) violates expectation

        Shape rectangle = new Rectangle(5, 4);
        System.out.println(rectangle.area());

        Shape square = new Square(4);
        System.out.println(square.area());
    }
}
