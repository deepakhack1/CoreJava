package src;

public class ToString {

    String name;
    int id;

    public ToString(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name + " "+id;
    }
    public static void main(String[] args) {
        ToString t1 = new ToString("Deepak",1);
        ToString t2 = new ToString("Surya",2);

        System.out.println(t1);
        System.out.println(t2);
    }


}
