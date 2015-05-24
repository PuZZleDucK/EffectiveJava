// Question: Is pre-calculating an immutable hash value like this ok???

public class ImmutableStrictHash{
  private final int hashCode;
  private final int x,y;
  
  public ImmutableStrictHash(int xIn, int yIn) {
    x = xIn;
    y = yIn;
    hashCode = ((13 + (x))*31) + (y);
  }

  @Override public int hashCode() {
    return hashCode;
  }

}
