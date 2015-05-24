

public class Singleton {
  private transient int number = 0; // transient required to preserve 'singleness' during (de)serialize operations
  private static int count = 0;

  public static void main(String[] args) {
    System.out.println("Singleton Pattern");
    System.out.println("S: ");
  }//main

  public static final Singleton instance = new Singleton();
  private Singleton() {
    count += 1; //thow exception if ever not 0
    this.number = count;
  }//construct

  public Singleton getSingleton() {
    return instance;
  }

  private Object readResolve() { // preserve singleton even when serializing
    return instance; // return the singleton only
  }

}//class
