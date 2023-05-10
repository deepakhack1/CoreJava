package src.collectionFramework.hashMap;


import java.util.HashMap;

class Emp {

    int id;

    String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;


        if (obj == null || obj.getClass() != this.getClass())
            return false;

        // type casting of the argument.
        Emp emp = (Emp) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (emp.id == this.id);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashMap2 {


    public static void main(String[] args) {

        Emp emp1 = new Emp(1, "Deepak");
        Emp emp2 = new Emp(2, "Deepak");

        HashMap<Emp, String> hashMap = new HashMap<>();

        hashMap.put(emp1, "SE");
        hashMap.put(emp2, "SSE");

        System.out.println(hashMap);


    }

}
