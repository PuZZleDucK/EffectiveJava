// 

public class CompositionForComparisons {
  public static void main(String args[]) {
    System.out.println("CompositionForComparisons");
  }

  public class ParentClass implements Comparable<ParentClass>{
    private int x, y;
    public int compareTo(ParentClass p) {
      if (x < p.x)
        return -1;
      if (x > p.x)
        return 1;
      return 0;
    }
  }//parent

  public class DontDoThis extends ParentClass {
    private int z;
    @Override public int compareTo(ParentClass o) {
      return 0;
    }
  }

  public class DoThis implements Comparable<DoThis> {
    private ParentClass par;
    private int z;
    public int compareTo(DoThis d) {
      ParentClass p = d.par;
      if (par.x < p.x)
        return -1;
      if (par.x > p.x)
        return 1;
      return 0;
    }
  }

}
