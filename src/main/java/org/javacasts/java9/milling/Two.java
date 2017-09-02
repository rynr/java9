package org.javacasts.java9.milling;

import java.io.Closeable;
import java.io.IOException;

/**
 * Effectively-final variables are allowed to be used as resources in the try-with-resources
 * statement. The code below has an error. Try removing the line <code>t1 = null; // Remove this code</code>.
 */
public class Two implements Closeable {
  @Override
  public void close() throws IOException {
    // nothing
  }

  public static class TryStmtTwo {

    public void foo() throws IOException {
      Two t1 = new Two();
      try (t1; final Two t2 = new Two()) {
        // Empty by design
      }
      t1 = null; // Remove this code
    }

    public static void main(String[] args) {
      System.out.println("Done");
    }
  }
}
