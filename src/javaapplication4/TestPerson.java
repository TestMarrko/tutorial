/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.*;

/**
 *
 * @author Marrko
 */
public class TestPerson {

  public static void main(String[] args) {
    PersonGenerator pg = new PersonGenerator(50);
    List<Person> pp = pg.returnGeneratedList();

    //Collections.sort(pp, new Comparing());
    Collections.sort(pp, (a, b) -> a.getAge() > b.getAge() ? -1 : (a.getAge() < b.getAge() ? 1 : 0));
    Collections.sort(pp, (a, b) -> a.getAge() + b.getAge());

    pp.forEach(System.out::println);

  }

}

class Comparing implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {
    if (o1.getAge() > o2.getAge()) {
      return 1;
    } else if (o1.getAge() < o2.getAge()) {
      return -1;
    }
    return 0;
  }
}
