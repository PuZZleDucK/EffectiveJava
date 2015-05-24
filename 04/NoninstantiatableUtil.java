// 

public class NoninstantiatableUtil{
  private NoninstantiatableUtil() { // provide constructor so default constructor is not generated
    // throw assertion exception rather than trying to block inheritence
  }
}
