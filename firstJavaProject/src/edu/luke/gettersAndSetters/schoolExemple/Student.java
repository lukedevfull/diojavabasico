package edu.luke.gettersAndSetters.schoolExemple;

public class Student {
  private String name;
  private int age;
  private String course;

  public String getName(){
    return name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int newAge){
    this.age = newAge;
  }

  public String getCourse(){
    return course;
  }

  public void setCourse(String newCourse){
    this.course = newCourse;
  }

  public void sayHello(){
    System.out.println("Hello, my name is " + name + " and I am " + age + " years old, I am studying " + course);
  }

  public void study(){
    System.out.println("I am studying " + course);
  }
  
  
  
}
