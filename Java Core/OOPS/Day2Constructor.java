//Constructor:these are the function or method which are intialised at the starting
// of the class formation, And it provides the initial values to the varialbles of the classes
//it gets auto initialisedif its manually not executed. Its of three types on the basis of arguments,
//1.Default Constructor
//2.Parameteried Constructor
//3.Copy Constructor

//Also the constrcutor doesn't have any of the return type.
//this keyword is used to provide the specific value to the variable, upon whose place is replaced by the
//object name.(Socho samjh me aa jayega, basically this ki jagah obj ka naam ho jata hai, for accessing value   )

class Student{
    int roll;
    String name;
    float marks;
    Student() {
        this.roll = 32;
        this.name = "Chubbu";
        this.marks = 90.3f;
    }
    //Copy Constructor
    Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }
//Parameterised Constructor
    Student(int rollno,String naam, float number) {
        this.roll = rollno;
        this.name = naam;
        this.marks = number;
    }

}

public class Day2Constructor {
    public static void main(String[] args){
     Student obj2 = new Student();     //Default Constructor
        System.out.println(obj2.roll);
        System.out.println(obj2.name);
        System.out.println(obj2.marks);

        Student obj3 = new Student(obj2);   //Copy Constructor
        System.out.println(obj3.name);
        System.out.println(obj3.roll);
        System.out.println(obj3.marks);

        Student obj4 = new Student(21,"Pandey",32.4f); //Parameterised Constructor
        System.out.println(obj4.name);
        System.out.println(obj4.roll);
        System.out.println(obj4.marks);


    }
}
