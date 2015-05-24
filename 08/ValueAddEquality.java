// 

public class ValueAddEquality{ //“Favor composition over inheritance"
  public static void main(String args[]) {
    System.out.println("Value Add Equality");
    BaseValues b = new ValueAddEquality().new BaseValues();
    ExtendValues x = new ValueAddEquality().new ExtendValues(7);
    EmbraceValues e = new ValueAddEquality().new EmbraceValues(7);
    System.out.println("Base: "+b);
    System.out.println("Bad way: "+x);
    System.out.println("Good way: "+e);
  }


  public class BaseValues {
    public int x, y;
    public BaseValues () {}
    public BaseValues (int val) {
      this.x = this.y = val;
    }
    public String toString() {return ("_"+x+"_"+y+"_");}
  }//class
  public class ExtendValues extends BaseValues {
    public int z;
    public ExtendValues(int val) {
      super(val);
      this.z = val;
    }
    public String toString() {return ("_"+x+"-"+y+"-"+z+"_");}
  }//class
  public class EmbraceValues {
    public BaseValues xy;
    public int z;
    public EmbraceValues(int val) {
      xy = new BaseValues(val);
      z = val;
    }
    public String toString() {return ("_"+xy.x+"~"+xy.y+"~"+z+"_");}
  }//class

}
