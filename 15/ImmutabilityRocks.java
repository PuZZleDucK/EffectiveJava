// ImmutabilityRocks

//final probably not needed due to factory
public final class ImmutabilityRocks{
  private static final int staticValue = 5;
  private final int value; //scala style :p
  private int readCount; //limit reads with mutability, do not expose.
  private static ImmutabilityRocks zero = makeImmutabilityRock(0);

  private ImmutabilityRocks(int inVal) {
    if(!(this instanceof ImmutabilityRocks)) {
      //throw error if not ImmutabilityRocks
    }
    value = inVal;
    readCount = 2; //do not expose mutable component
  }

  public static final ImmutabilityRocks makeImmutabilityRock(int inVal) {
    if(inVal == 0) { //cached frequent values
      return zero;
    }
    return new ImmutabilityRocks(inVal);
  }

  public int getValue() {
    if (readCount > 0) {
      readCount -= 1;
      return value;
    }
    return 0;
  }

// Don't do this
//  public void setValue(int newValue) {
//    value = newValue;
//  }

  public static void main(String args[]) {
    System.out.println("Immutability Rocks");
  }
}
