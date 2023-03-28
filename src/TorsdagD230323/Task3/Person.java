package TorsdagD230323.Task3;

//helst ikke lave person objekter, lav istedet student og teacher
public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    //husk at override dette
    public boolean addCourse(String course){
        return true;
    }
    */

    public abstract boolean addCourse(String course);
}
