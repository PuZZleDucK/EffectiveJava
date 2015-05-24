// 

public class DubiousAccess{
  public static final int width = 300;
  public static final int height = 100; // Totally fine.
  public final int x, y; // Dubious, but ok.

  public DubiousAccess(int xIn, int yIn) {
    if(xIn < 0 || xIn > width) {
      throw new IllegalArgumentException("<<OOB>>");
    }
    if(yIn < 0 || yIn > height) {
      throw new IllegalArgumentException("<<OOB>>");
    }
    x = xIn;
    y = yIn;
  }

  public static void main(String args[]) {
    System.out.println("DubiousAccess");
  }
}
