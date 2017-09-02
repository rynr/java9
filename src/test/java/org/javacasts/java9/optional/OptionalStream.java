package org.javacasts.java9.optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class OptionalStream {

  @Test
  public void handleOptionalsStream() {
    Stream<Optional<? extends Object>> stream =
        Arrays.asList(Optional.of("Hello"), Optional.empty(), Optional.of("World")).stream();
    assertThat(
        stream.flatMap(Optional::stream).map(Object::toString).collect(Collectors.joining(" ")),
        is("Hello World"));
  }
}
