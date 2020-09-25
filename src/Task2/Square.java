package Task2;

public class Square extends Shape {
    int a;

    public Square(int a) {
        this.a=a;
    }

    @Override
    public void sqr() {
       area= a*a;
        System.out.println(area);
    }


}
