package TorsdagD230323.Task3;

import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses = new ArrayList<>();
    public Teacher(String name, ArrayList<String>canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        //man kunne også lave det med et foreach loop, som der er gjort i Student override
        if(canTeach.contains(course)){
        currentCourses.add(course);
        return true;}
        else{return false;}
    }

}
