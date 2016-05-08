/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Date;

/**
 *
 * @author Marrko
 */
public class Worker extends Person {
  private Job job;
  private long salary;
  private int employmentYear;
  private Date dayEmployed;
  private int daysWorkingHere;
  
  public Worker() {}
  
  public Worker(Job j, long s, int e, Date d, int days) {
    this.job = j;
    this.salary = s;
    this.employmentYear = e;
    this.dayEmployed = d;
    this.daysWorkingHere = days;
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public long getSalary() {
    return salary;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }

  public int getEmploymentYear() {
    return employmentYear;
  }

  public void setEmploymentYear(int employmentYear) {
    this.employmentYear = employmentYear;
  }

  public Date getDayEmployed() {
    return dayEmployed;
  }

  public void setDayEmployed(Date dayEmployed) {
    this.dayEmployed = dayEmployed;
  }

  public int getDaysWorkingHere() {
    return daysWorkingHere;
  }

  public void setDaysWorkingHere(int daysWorkingHere) {
    this.daysWorkingHere = daysWorkingHere;
  }

  @Override
  public String toString() {
    return "Worker{" + "job=" + job + ", salary=" + salary + ", employmentYear=" + employmentYear + ", dayEmployed=" + dayEmployed + ", daysWorkingHere=" + daysWorkingHere + '}';
  }
  
  
}
