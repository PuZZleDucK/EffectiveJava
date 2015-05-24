// 
package test;
import test.Apublic;

public class Bprivate extends Apublic{
  private String myValue = "Overwritten";
  private String myOtherValue = "Origional Other";

  public static Bprivate getB() {
    return new Bprivate();
  }

}
