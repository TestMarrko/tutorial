/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Marrko
 */
public class PersonGenerator {
  
  final static List<String> firstNameList = new ArrayList<>();
  final static List<String>  lastNameList = new ArrayList<>();
  final static List<Integer>      ageList = new ArrayList<>();
  final static List<Double>       payList = new ArrayList<>();
  final static List<Long>      heightList = new ArrayList<>();
  final static List<Long>      weightList = new ArrayList<>();
  
  List<Person> personList    = new ArrayList<>();
  
  static {
    
    firstNameList.add("Matt");
    firstNameList.add("Mary");
    firstNameList.add("Sam");
    firstNameList.add("Jo");
    firstNameList.add("Bill");
    firstNameList.add("Mel");
    firstNameList.add("Erica");
    firstNameList.add("Sue");
    firstNameList.add("Tom");
    firstNameList.add("Jenny");
    
    lastNameList.add("Thompson");
    lastNameList.add("Smith");
    lastNameList.add("William");
    lastNameList.add("Obama");
    lastNameList.add("Jordan");
    lastNameList.add("Green");
    lastNameList.add("Hentry");
    lastNameList.add("Hunt");
    lastNameList.add("Perry");
    lastNameList.add("Brown");
    
    ageList.add(23);
    ageList.add(34);
    ageList.add(45);
    ageList.add(56);
    ageList.add(63);
    ageList.add(77);
    ageList.add(28);
    ageList.add(40);
    ageList.add(51);
    ageList.add(44);
    
    payList.add(39999D);
    payList.add(60000D);
    payList.add(120000D);
    payList.add(80000D);
    payList.add(24576D);
    payList.add(200000D);
    payList.add(75000D);
    payList.add(45000D);
    payList.add(112000.32D);
    payList.add(140000.50D);
    
    heightList.add(60L);
    heightList.add(72L);
    heightList.add(84L);
    heightList.add(65L);
    heightList.add(74L);
    heightList.add(70L);
    heightList.add(62L);
    heightList.add(79L);
    heightList.add(57L);
    heightList.add(68L);
    
    weightList.add(100L);
    weightList.add(200L);
    weightList.add(300L);
    weightList.add(150L);
    weightList.add(175L);
    weightList.add(225L);
    weightList.add(250L);
    weightList.add(275L);
    weightList.add(125L);
    weightList.add(258L);
    
  }
  
  public PersonGenerator() {
    this(20);
  }
  
  public PersonGenerator(int number) {
    if (number > 0) {
      Sex[] sex = Sex.values();
      int sexLength = sex.length;
      for (int i = 0; i < number; i++) {
        personList.add(new Person(firstNameList.get(new Random().nextInt(firstNameList.size())),
                                  lastNameList.get(new Random().nextInt(lastNameList.size())),
                                  ageList.get(new Random().nextInt(ageList.size())),
                                  heightList.get(new Random().nextInt(heightList.size())),
                                  weightList.get(new Random().nextInt(weightList.size())),
                                  sex[new Random().nextInt(sexLength)]));
      }
    }
  }
  
  public List<Person> returnGeneratedList() {
    return this.personList;
  }
  
}
