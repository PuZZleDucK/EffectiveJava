// 

public class ToStringConsideredHelpfull{
  public static void main(String args[]) {
    System.out.println( new ToStringConsideredHelpfull() );
  }

  // advise users of your API wheather this format is 'set in stone' or 'just a guide'
  @Override public String toString() {
    return "ToStringConsideredHelpfull";
  }
}
