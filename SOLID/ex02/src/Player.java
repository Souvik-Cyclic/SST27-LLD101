public class Player {
    // private Frame last;

    private Decoder decoder = new Decoder();
    private UI ui = new UI();
    private Cache cache = new Cache();

    public void play(byte[] fileBytes){
        // // decode
        // Frame f = new Frame(fileBytes); // pretend decoding
        // last = f;
        // // draw UI
        // System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        // // cache
        // System.out.println("Cached last frame? " + (last!=null));

        Frame f = decoder.decode(fileBytes);
        ui.draw(f);
        cache.storeLastFrame(f);
        System.out.println("Cached last frame? " + cache.hasLastFrame());
    }
}
