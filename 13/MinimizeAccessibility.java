// 

public class MinimizeAccessibility{
  public static final Thing FINAL_THING = new MinimizeAccessibility().new Thing(4);
  public static final Thing[] MUTABLE_VALUES = {FINAL_THING, new MinimizeAccessibility().new Thing(5)};

  public static void main(String args[]) {
    System.out.println("Minimize Accessibility");
    System.out.println("Final Array: "+MUTABLE_VALUES[0]+MUTABLE_VALUES[1]);
    MUTABLE_VALUES[1].i = -1;
    System.out.println("Final Array: "+MUTABLE_VALUES[0]+MUTABLE_VALUES[1]);
  }

  private class Thing {
    public int i;
    public Thing(int x) { i = x; }
//    public static Thing makeThing(int x) { return new Thing(x); }
    @Override public String toString() { return "{"+i+"}"; }
  }


}
