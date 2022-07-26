package io.github.huypva.initializationblock;

public class InitializationBlockExample {

  static {
    System.out.println("Static initialization block 1");
  }

  {
    System.out.println("Initialization block 1");
  }

  {
    System.out.println("Initialization block 2");
  }

  public InitializationBlockExample() {
    System.out.println("Constructor 1");
  }

  public static void main(String[] args) {
    new InitializationBlockExample();
  }
}
