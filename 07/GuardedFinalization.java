// 

public class GuardedFinalization{
  private String data = "DEFAULT";
  public GuardedFinalization () {
    System.out.println("Construct");
    data = "initalized";
    //create canary files
  }
  public void cleanup() {
    System.out.println("Clean");
    data = "deleted";
    //destroy canary file 1
  }
  public String toString() {
    return data;
  }

  public static void main(String args[]) {
    System.out.println("Guarded Finalization");
    GuardedFinalization gf = new GuardedFinalization();
    gf = null;
  }

  private final Object guardian = new Object() {
    @Override protected void finalize() throws Throwable {
      System.out.println("Guard Finalization");
      //destroy canary file 2
    }//finalizer
  };//guardian
}
