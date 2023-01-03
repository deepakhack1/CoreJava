package src;
class Circle{

    int calc(int x){
        return x*x*x;
    }

}
class Square{
    Circle c;  //Aggregation or HAS-A relationship
    int x;
    Square(int x){
        this.x =x;
        c = new Circle();
    }

    void calc(){
        System.out.println(c.calc(x));
    }
}

public class AggregationEx {

    public static void main(String[] args) {
        Square s = new Square(3);
        s.calc();

    }

}
