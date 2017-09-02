package org.javacasts.java9.sets;

import java.util.Set;

import org.junit.Test;

public class SetTest {

  @Test
  public void testSetSimpleCreation() {
    Set<String> strKeySet = Set.of("key1", "key2", "key3");
    System.out.print(strKeySet);
  }
}
