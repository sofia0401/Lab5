package Task2;

public class Rectangle extends Shape {
    int a,b;

    public Rectangle(int a,int b) {
        this.a=a;
        this.b=b;
    }

    @Override
    public void sqr() {
        area=a*b;
        System.out.println(area);
    }
}
