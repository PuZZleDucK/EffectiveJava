// 

public class ImmutableLazyHash{
  private volatile int hashCode;
  private int x,y;
  
  @Override public int hashCode() { //functional style with if as a value and no vars (and missing ;)
    if (hashCode == 0) { //no cached value
      return ((13 + (x))*31) + (y);
    } else {
      return hashCode;
    }
  }

}
