/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Marrko
 */
public class Test2 {

  public static void main(String[] args) {
    PersonGenerator pg = new PersonGenerator(50);
    List<Person> pp = pg.returnGeneratedList();
    
    

  }

}

