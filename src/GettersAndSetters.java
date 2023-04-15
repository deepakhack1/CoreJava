package src;


class Anything{

    private int sid;
    private String name;

    //access_modifiers(public/private/protected)  ClassName
    public Anything(){
        System.out.println("Constructor calling");
    }

    //access_modifiers(public/private/protected) returnType(void/int/string) methodName

    public int getSid(){
        return sid;
    }

    public void setSid(int value,String name){
        sid = value;
    }

    public void setSid(String name,int value){

    }
    public void setName(String value){
        name = value;
    }
    public String getName(){
        return name;
    }
}
public class GettersAndSetters {

    public static void main(String[] args) {

        Anything aksa = new Anything();  // call Anything class constructor



// This is for public variables

//        aksa.sid =  9;
//        aksa.name = "Deepak";
//
//        System.out.println(aksa.sid);
//        System.out.println(aksa.name);

        //aksa.setSid(9);

       int id =  aksa.getSid();

        System.out.println(id);

        aksa.setName("Ram");

        String name = aksa.getName();

        System.out.println(name);






    }


}
