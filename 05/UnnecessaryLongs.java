// 
import java.time.*;

public class UnnecessaryLongs{
  public static void main(String args[]) {
    System.out.println("Hi UnnecessaryLongs");
    LocalDateTime start = LocalDateTime.now();
    Long boxSum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      boxSum += i;
    }
    System.out.println("Sum: "+boxSum);

    System.out.println("Bye UnnecessaryLongs");
    LocalDateTime mid = LocalDateTime.now();
    long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
    }
    System.out.println("Sum: "+sum);
    LocalDateTime end = LocalDateTime.now();
    System.out.println("Long: "+(Duration.between(start, mid).getSeconds() ));
    System.out.println("long: "+(Duration.between (mid, end).getSeconds() ));

  }
}
