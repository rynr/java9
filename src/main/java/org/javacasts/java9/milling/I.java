package org.javacasts.java9.milling;

/**
 * private interface methods are allowed. Change the <code>default</code> of worker to private
 */
public interface I {
  default void worker() {}

  default void foo() {
    worker();
  }

  default void bar() {
    worker();
  }
}
