

public enum SingletonEnum {
  instance; // this and only this
  private int number = 0; // no seralization hacks
  private static int count = 0;
  private void inc() {
    count++;
  }
  public static void main(String[] args) {
    System.out.println("Singleton by Enumerating One");
    SingletonEnum s = instance;
    s.inc();
    System.out.println("S: "+s.count);
  }//main

}//class
