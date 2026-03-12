
class Student1{
    int rollno;
    String name;
    float marks;
}

public class ClassesAndObjects{
    public static void main(String[] args){
        Student1 obj1 = new Student1();
      obj1.rollno = 21;
      obj1.name = "Shubham";
      obj1.marks = 40;

        System.out.println(obj1.rollno);
    }
}