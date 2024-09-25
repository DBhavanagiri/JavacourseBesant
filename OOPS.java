class Pen{
    String color;
    String type; 

    public void write(){
        System.err.println("writing something");
    }

    public void printColor(){
        System.err.println(this.color);
    }
}

class Student{
    String name;
    int age;


    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student (String name, int age){
        this.name = name;
        this.age = age;
    } 
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("anam", 24);
    

        s1.printInfo();
    }
    
}
