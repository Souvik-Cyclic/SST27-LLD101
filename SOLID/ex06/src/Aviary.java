// class Aviary {public 
//     void release(Bird b){ b.fly(); System.out.println("Released"); }
// }

public class Aviary {
    public void release(Flyable f) {
        f.fly();
        System.out.println("Released");
    }
}
