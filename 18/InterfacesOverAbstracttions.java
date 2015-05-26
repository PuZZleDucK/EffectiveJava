// 

public final class InterfacesOverAbstracttions {
  public static void main(String args[]) {
    System.out.println("InterfacesOverAbstracttions");
  }

  public interface NotAbstract {
    public Object self();
  }

  public interface HasConcept {
    public String getVibe();
  }

// Mixin
  public interface Art extends HasConcept, NotAbstract {
    void makeWhitnessThink();
  }

// Skeleton implementation. simulated multiple inheritence.
// Drop "abstract" to make a simple implementation.
  public abstract class AbstractArt implements Art {
    @Override public void makeWhitnessThink() { System.out.println("This is about "+getVibe()); }
    @Override public String getVibe() { return "Dynamic shapes"; }
    @Override public Object self() { return this; }
//    @Override public void newOverrideFail() {}
  }

}//class






