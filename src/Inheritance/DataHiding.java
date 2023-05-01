package src.Inheritance;

class Base{

   private int x = 50;
    private int y= 70;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Child extends Base{

    //int x=50;
//    int x = 20;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    int z = 90;

//    void show(){
//        System.out.println(x);
//
//    }
}

public class DataHiding {

    public static void main(String[] args) {

       Base b = new Child();
        final Child b1 = (Child) b;
    }
}
