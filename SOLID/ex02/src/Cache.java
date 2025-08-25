public class Cache {
    private Frame lastFrame;
    
    void storeLastFrame(Frame f){
        this.lastFrame = f;
    }

    boolean hasLastFrame(){
        return lastFrame != null;
    }
}