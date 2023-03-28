package TorsdagD230323.Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> passedCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course) {
        for (String s : passedCourses) {
            if(s.equals(course)){
                return false;
            }
        }
        //evt skrive: if(passedCourses.contains(course)){return false;} også fjerne foreach loopet
        currentCourses.add(course);
        return true;
    }
}
