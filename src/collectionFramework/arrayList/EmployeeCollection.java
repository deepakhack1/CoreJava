package src.collectionFramework.arrayList;


import java.util.ArrayList;

class Employee{

    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
public class EmployeeCollection {

    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();

        Employee e1 = new Employee(1,"Deepak");
        Employee e2 = new Employee(2,"Surya");
        arrayList.add(e1);
        arrayList.add(e2);

        System.out.println(arrayList);

    }

}
