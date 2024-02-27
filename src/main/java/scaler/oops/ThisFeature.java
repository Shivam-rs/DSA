package scaler.oops;

import java.util.Collections;

public class ThisFeature {
    public static void main(String[] args) {
        /*Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();

        String tempName = s1.name;
        s1.name = s2.name;
        s2.name = tempName;

        s1.display();*/

        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "B";

        swapIt(s1, s2);

        s1.display();



    }
    private static void swapIt(Student s11, Student s2) {
        Student temp = s11;
        s11 = s2;
        //s1.display();
        s2 = temp;
    }
    public static class Student {
        int age;
        String name;

        void display(){

            System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
        }

        void sayHello(String name){
            System.out.println(this.name + " says hello to " + name);
        }
    }
}


