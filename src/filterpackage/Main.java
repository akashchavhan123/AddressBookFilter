package filterpackage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList <Emp>employees = new ArrayList<Emp>();
        employees.add(new Emp("Akash","Chavhan",25));
        employees.add(new Emp("KL","Rahul",26));
        employees.add(new Emp("Virat","Kohli",27));
        employees.add(new Emp("Dk","Kartik",28));

        employees.stream().filter(i -> i.age >=26).forEach(i-> System.out.println(i.fName +" "+i.age));






//        Emp emp1 =new Emp("Akash","Chavhan",25);
//        Emp emp2 =new Emp("KL","Rahul",26);
//        Emp emp3 =new Emp("Virat","Kohli",27);
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add(emp1);
//        arrayList.add(emp2);
//        arrayList.add(emp3);
//        //arrayList.forEach(i-> System.out.println(i));

    }
}
