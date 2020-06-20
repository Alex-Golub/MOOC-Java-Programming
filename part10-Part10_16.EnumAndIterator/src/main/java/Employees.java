
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jun 20, 2020 5:32:59 PM
 */
public class Employees {

  private List<Person> employees;

  public Employees() {
    this.employees = new ArrayList<>();
  }

  public void add(Person personToAdd) {
    if (personToAdd != null) {
      this.employees.add(personToAdd);
    }
  }

  public void add(List<Person> peopleToAdd) {
    if (peopleToAdd != null && !peopleToAdd.isEmpty()) {
      this.employees.addAll(peopleToAdd);
    }
  }

  public void print() {
    ListIterator<Person> iterator = this.employees.listIterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void print(Education education) {
    ListIterator<Person> iterator = this.employees.listIterator();

    while (iterator.hasNext()) {
      Person p = iterator.next();
      if (p.getEducation().compareTo(education) == 0) {
        System.out.println(p);
      }
    }
  }

  public void fire(Education education) {
    ListIterator<Person> iterator = this.employees.listIterator();

    while (iterator.hasNext()) {
      Person p = iterator.next();
      if (p.getEducation().compareTo(education) == 0) {
        iterator.remove();
      }
    }
  }
}
