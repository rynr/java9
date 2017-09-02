package org.javacasts.java9.system;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class ProcessHandleTest {

  @Test
  public void testProcessHandle() {
    ProcessHandle self = ProcessHandle.current();
    long pid = self.pid();
    ProcessHandle.Info procInfo = self.info();

    Optional<String[]> args = procInfo.arguments();
    Optional<String> cmd = procInfo.commandLine();
    Optional<Instant> startTime = procInfo.startInstant();
    Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

    System.out.println("This runs with pid " + pid + ".");
    System.out.println("Command: " + cmd.get() + "; Args: "
        + Arrays.stream(args.get()).collect(Collectors.joining(", ")));
    System.out
        .println("Start time is: " + startTime.get() + ", used " + cpuUsage.get() + " cpu so far");
  }

  @Test
  public void killChildren() {
    Stream<ProcessHandle> childProc = ProcessHandle.current().children();
    childProc.forEach(procHandle -> {
      procHandle.destroy();
    });
  }
}
