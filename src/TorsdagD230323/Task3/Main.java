package TorsdagD230323.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("java 1,0");
        a1.add("sys");
        a1.add("python");
        Student s1 = new Student("Caro", a1);
        s1.addCourse("java 1,0");

        /*ArrayList<String> a2 = new ArrayList<>();
        a2.add("java 1,0");
        a2.add("sys");
        Student s2 = new Student("Caroline", a2);*/

        Teacher t1 = new Teacher("bo",a1);
        t1.addCourse("java 1,0");


    }
}
