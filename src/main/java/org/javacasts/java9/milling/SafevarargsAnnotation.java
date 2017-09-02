package org.javacasts.java9.milling;

import java.util.ArrayList;
import java.util.List;

public class SafevarargsAnnotation {
  private int getLen(List<String>... list) {
    List<String>[] l = list;
    return l.length;
  }

  public static void main(String[] args) {
    SafevarargsAnnotation x = new SafevarargsAnnotation();
    List<String> l = new ArrayList<>();
    int len = x.getLen(l); // Use Quick Assist of SafeVarargs here<br>
    System.out.println("Length:" + len);
  }
}
