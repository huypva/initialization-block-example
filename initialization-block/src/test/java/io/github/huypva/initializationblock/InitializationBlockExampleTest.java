package io.github.huypva.initializationblock;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class InitializationBlockExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void main() {
    System.setOut(new PrintStream(outputStreamCaptor));
    InitializationBlockExample.main(new String[]{});
    Assertions.assertEquals(
        "Static initialization block 1\n"
            + "Initialization block 1\n"
            + "Initialization block 2\n"
            + "Constructor 1",
        outputStreamCaptor.toString().trim());
  }
}