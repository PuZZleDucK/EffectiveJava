// 

package test;
//import test.Bprivate;

public class Apublic{
  private String myValue = "Origional";

  public static Apublic getA() {
    return new Apublic();
  }

  public static Bprivate getAB() {
    return Bprivate.getB();
  }

}
