// 

public class StaticFactoryMethods{

  private StaticFactoryMethods() { System.out.print("<con>"); } // Stop direct construction... or does it.
  public static StaticFactoryMethods SfmFactory() {
    System.out.print("<stat>");
    StaticFactoryMethods sfm = new StaticFactoryMethods();
    sfm.number = 8;
    return sfm;
  }
  public static StaticFactoryMethods NumberedSfm(int num) {
    System.out.print("<"+num+">");
    StaticFactoryMethods sfm = new StaticFactoryMethods();
    sfm.number = num;
    return sfm;
  }

  private static StaticFactoryMethods singleton = NumberedSfm(1);
  private static StaticFactoryMethods getSingleton() {
    System.out.print("<.>");
    return singleton;
  }

  public static void main(String args[]) {
    StaticFactoryMethods constructed = new StaticFactoryMethods();
    System.out.println("Hi SFM: "+constructed.whoami());
    System.out.println("Hi SfmFactory: "+StaticFactoryMethods.SfmFactory().whoami());
    System.out.println("Hi NumberedSfm: "+StaticFactoryMethods.NumberedSfm(9).whoami());
    System.out.println("Hi SingletonSfm: "+StaticFactoryMethods.getSingleton().whoami());
    System.out.println("Hi SingletonSfm: "+StaticFactoryMethods.getSingleton().whoami());
//    HiddenClass hidden = new HiddenClass();
//    HiddenClass hidden = HiddenClass.getHidden();
  }

  private int number = 7;
  private String whoami() {
    return "Don't tell I'm #"+number;
  }



  private class HiddenClass {
//    public static HiddenClass getHidden() {
//      return new HiddenClass();
//    }
    public HiddenClass() {
    }
  }

}//class
