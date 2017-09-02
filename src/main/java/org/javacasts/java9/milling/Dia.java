package org.javacasts.java9.milling;

/**
 * In the following code, there is a warning about Y being a raw type and need to be parameterized.
 * with Java 9 support, just add a diamond operator after Y.
 */
public class Dia {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    Y<?> y1 = new Y() {}; // Change this to new Y<>(){}
  }
}


class Y<T> {
}
