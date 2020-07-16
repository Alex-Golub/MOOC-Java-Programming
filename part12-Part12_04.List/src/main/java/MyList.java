
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jul 3, 2020 1:40:21 PM
 */
public class MyList<T> {

  private T[] list;
  private int firstFreeIndex; // actual no. of elements in the list

  public MyList() {
    this.list = (T[]) new Object[10];
  }

  public void add(T t) {
    if (this.firstFreeIndex == this.list.length) {
      resize();
    }

    this.list[this.firstFreeIndex] = t;
    this.firstFreeIndex++;
  }

  private void resize() {
    final int newSize = this.list.length + this.list.length / 2;
    final T[] biggerArray = (T[]) new Object[newSize];

    // Copy all elements from old array to new array 
    System.arraycopy(this.list, 0, biggerArray, 0, this.list.length);

    this.list = biggerArray;
  }

  public boolean contains(T t) {
    return this.indexOf(t) >= 0;
  }

  public void remove(T t) {
    int index = this.indexOf(t);
    if (index >= 0) {
      this.shiftLeft(index);
      this.firstFreeIndex--;
    }
  }

  private void shiftLeft(int fromIndex) {
    for (int i = fromIndex; i < this.firstFreeIndex; i++) {
      this.list[i] = this.list[i + 1];
    }
  }

  public int indexOf(T t) {
    for (int i = 0; i < this.firstFreeIndex; i++) {
      if (this.list[i].equals(t)) {
        return i;
      }
    }

    return -1;
  }

  public T get(int atIndex) {
    if (atIndex < 0 || atIndex >= this.firstFreeIndex) {
      throw new ArrayIndexOutOfBoundsException("Index " + atIndex + " outside of the range [0 - "
              + (this.firstFreeIndex - 1) + "]");
    }

    return this.list[atIndex];
  }
  
  public int size() {
    return this.firstFreeIndex;
  }

  @Override
  public String toString() {
    if (this.firstFreeIndex == 0) {
      return "[]";
    }

    StringBuilder sb = new StringBuilder();
    sb.append("[");

    for (int i = 0; i < this.firstFreeIndex - 1; i++) {
      sb.append(this.list[i] + ", ");
    }

    sb.append(this.list[this.firstFreeIndex - 1] + "]");

    return sb.toString();
  }

  // Testing
  public T[] getList() {
    return list;
  }

  public int getFirstFreeIndex() {
    return firstFreeIndex;
  }

}
