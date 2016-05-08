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
public enum NewEnum {
  GREEN(1), RED(2), YELLOW(3);
  int color;
  
  NewEnum(int amount) {
    this.color = amount;
  }
  
  public int getColor() {
    return this.color;
  }
}
