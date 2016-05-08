/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Marrko
 */
public class Person {
  
  private String firstName;
  private String lastName;
  private int age;
  private long height;
  private long weight;
  private Sex sex;
  
  public Person() {}
  public Person(String fN, String lN, int a, long h, long w, Sex s) {
    this.firstName = fN;
    this.lastName = lN;
    this.age = a;
    this.height = h;
    this.weight = w;
    this.sex = s;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public long getHeight() {
    return height;
  }

  public void setHeight(long height) {
    this.height = height;
  }

  public long getWeight() {
    return weight;
  }

  public void setWeight(long weight) {
    this.weight = weight;
  }

  public Sex getSex() {
    return sex;
  }

  public void setSex(Sex sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", height=" + height + ", weight=" + weight + ", sex=" + sex + '}';
  }
  
  
  
  
}
