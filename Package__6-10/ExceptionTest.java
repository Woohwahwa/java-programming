// checked Exception 처리

import java.io.*;

public class ExceptionTest {
  public static void main(String[] args) {
    DataInputStream dis = new DataInputStream(System.in);

    try {
      int i = dis.readInt();
    } catch (Exception e) {
      System.out.println(e.toString());
      System.out.println(e.printStackTrace());
    }
  }
}