package Task2;

public class Circle extends Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void sqr() {
        area= (float) (Math.PI*r*r);
        System.out.println(area);
    }
}
