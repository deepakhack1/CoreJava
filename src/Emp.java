package src;


public class Emp {

    int id;
    String name = "hello";
    static String cName = "TCS";

    Emp(){
        id = 1;
        name = name + " surya";

    }


    public static void main(String[] args) {
        Emp e1 = new Emp();
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(cName);
        System.out.println(e1);

        Emp e2 = e1; //copying an object to an object
        System.out.println(e2);
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(Emp.cName
        );


    }




}
