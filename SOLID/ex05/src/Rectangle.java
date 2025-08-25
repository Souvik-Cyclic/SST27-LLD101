public class Rectangle implements Shape {
    protected int w,h;
    // public void setWidth(int w){ this.w = w; }
    // public void setHeight(int h){ this.h = h; }

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int area(){ return w*h; }
}
