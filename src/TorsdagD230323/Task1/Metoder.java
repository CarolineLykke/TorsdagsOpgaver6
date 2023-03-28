package TorsdagD230323.Task1;

public class Metoder {

    public void methodA(String input) {
        System.out.println("a");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("v");
            System.out.println(methodC(input));

        }
    }

    public void methodB(String input) {
        if (input.equals("Start")){
        System.out.println("J");}
        else if (input.equals("Hello")){
            System.out.println("j");}
    }

    public String methodC(String input) {
        if (!input.equals("Hello, world")) {
            System.out.println("a");
        } else if (input.equals("Hello, world")) {
            System.out.println("o");
        }
        methodD(input.length());
        return "S";
    }

    public void methodD(int number) {
        if (number < 15){
        System.out.println("E");}
        else if (number == 12){
            System.out.println("v");
        }


        if (number > 5) {
            System.out.println("t");
        }
        System.out.println("r");
    }

    public void metodeA(String input){
        if(input.equals("Yes")){
            System.out.println("J");
            System.out.println("a");
        }
        else {
            System.out.println("o");
        }
    }
    public void metodeB(String input){
        if(input.equals("Good")){
            System.out.println("v");
            System.out.println("a");
        }
        else {
            System.out.println("v");
        }
    }
    public void metodeC(String input){
        if(input.equals("Job")){
            System.out.println("E");
            System.out.println("r");
        }
        else {
            System.out.println("t");
        }
    }
    public void metodeD(String input){
            System.out.println("S");
            System.out.println("j");

    }
}
