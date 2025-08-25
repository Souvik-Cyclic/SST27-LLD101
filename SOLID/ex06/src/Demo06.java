public class Demo06 {
    public static void main(String[] args) {
        // new Aviary().release(new Bird());
        // new Aviary().release(new Penguin()); // runtime error

        Aviary aviary = new Aviary();
        aviary.release(new FlyingBird());

        Penguin penguin = new Penguin();
        penguin.swim();
    }
}
