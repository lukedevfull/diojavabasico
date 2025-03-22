package edu.luke.gettersAndSetters.schoolExemple;

public class School {
    public static void main(String[] args) {
        Student studentTest = new Student();

        studentTest.setName("Luke");
        studentTest.setAge(20);
        studentTest.setCourse("Java");

        System.out.println("Testing the student class with " + studentTest.getName());

        studentTest.sayHello();
        studentTest.study();

        Student studentTest2 = new Student();

        studentTest2.setName("John");
        studentTest2.setAge(21);
        studentTest2.setCourse("Python");

        System.out.println("Testing the student class with " + studentTest2.getName());

        studentTest2.sayHello();
        studentTest2.study();

        Student studentTest3 = new Student();

        studentTest3.setName("Jane");
        studentTest3.setAge(22);
        studentTest3.setCourse("C++");

        System.out.println("Testing the student class with " + studentTest3.getName());

        studentTest3.sayHello();
        studentTest3.study();
        
    }
}
