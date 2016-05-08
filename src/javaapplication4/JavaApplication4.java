/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Marrko
 */
public class JavaApplication4 {
  
  JavaApplication4 four = new JavaApplication4();
 
  
  public JavaApplication4() {
    
  }
  
  public void Foo(List list) {
    
  }
  
  public void add(int ... a) {
    
  }
  
  
  

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String a = "Happy Days";
    
    List<? extends Number> arrayInstance2;
    arrayInstance2 = new Vector<>();
    
    for (Number o : arrayInstance2) {
      if (o instanceof Integer) {
        Integer i = (Integer) o;
        System.out.println(i.toString());
      }
    }
    
    List<String> foo = new ArrayList<>();
    foo.add("a");
    foo.add("a");
    foo.add("a");
    foo.add("4");
    foo.add("b");
    foo.add("c");
    foo.add("d");
    foo.add("e");
    foo.add("f");
    foo.add("g");
    foo.add("354sdfga");
    foo.add("adfghdfgh");
    foo.add("azxcv");
    foo.add("a34adf");
    foo.add("gga");
    foo.add("ag");
    foo.add("wa");
    foo.add("aw");
    foo.add("an");
    foo.add("na");
    foo.add("am");
    foo.add("ma");
    foo.add("ab");
    foo.add("ca");
    foo.add("a8");
    foo.add("6a");
    foo.add("a6");
    foo.add("fa");
    foo.add("af");
    foo.add("ca");
    foo.add("ac");
    foo.add("ca");
    foo.add("ad");
    foo.add("da");
    foo.add("ac");
    foo.add("ap");
    
//    for (String a2 : foo) {
//      System.out.println(a2);
//    }
    
    foo.forEach(System.out::println);
    System.out.println("---------------------------");
    
    Collections.sort(foo);
    
//    foo.sort(new Comparator);
//    
//    
//    for (int i = 0; i < foo.size(); i++) {
//      String dd = foo.get(i);
//      String bb = foo.get(i + 1);
//    }
    
    
    
    foo.forEach(System.out::println);
    
//    switch(a) {
//      case "Foo":
//        break;
//    }
   
//    File f = new File("");
//    try {
//      f.wait(2000);
//      boolean b = f.createNewFile();
//      
//    } catch(Exception ie) {
//      
//    } finally {
//
//    }
    
    
    
    
//    Iterator<Object> it = arrayInstance2.iterator();
//    
//    while(it.hasNext()) {
//      Object o = it.next();
//      System.out.println(o.toString());
//    }
    
    List arrayInstance = new ArrayList();
    arrayInstance.add(new Integer(2));
    arrayInstance.add("Foobar");
    arrayInstance.add(new Object());
    
    
    
    
    
    
    
    
    
    //NewEnum foo2 = NewEnum(5);
    
    
//    NewEnum foo = NewEnum.GREEN;
//    if (foo == NewEnum.RED) {
//      System.out.println(foo.color);
//      System.out.println("Light is now RED!!");
//    }
  }
  
  public void doSomething(String a) {
    
  }
  
}
