package CoreJava.src;

public class Sum {

    int id;
    String name ;

    //Default constructor
    Sum(){

        System.out.println("core java");

    }


    //paramterized constructor
    public Sum(int id,String name){

        this.id = id;
        this.name = name;
    }




     void sum(int arr[]){

        int cal = 0;

        for(int i=0;i< arr.length;i++){
            cal = cal+arr[i];
        }

         System.out.println(cal + " id -"+id+" name -"+name);

    }

    public static void main(String[] args) {

         //sum1 is an instance or object of a class Sum
        // new is always used to create an object
        //sum1 is stored in heap

        Sum sum3 = new Sum(); //Default constructor



        Sum sum1 = new Sum(1,"Surya");  // calls parameterized const

        Sum sum2 = new Sum(2,"Deepak");

        int arr[] = {1,2,3,4,5};

        sum1.sum(arr);

        sum2.sum(arr);


    }


}
