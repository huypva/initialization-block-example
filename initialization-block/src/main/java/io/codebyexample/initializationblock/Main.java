package io.codebyexample.initializationblock;

public class Main {

  static {
    System.out.println("Static initialization block 1");
  }

  {
    System.out.println("Initialization block 1");
  }

  {
    System.out.println("Initialization block 2");
  }

  public Main() {
    System.out.println("Contructor 1");
  }

  public static void main(String[] args) {
    Main main = new Main();
  }
}
