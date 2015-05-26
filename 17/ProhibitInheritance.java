// 

public final class ProhibitInheritance {
  public static void main(String args[]) {
    System.out.println("Just Prohibit Inheritance OnceAFA");
  }

  private class DocumentForInheritance {
    private int state = 0;
    public DocumentForInheritance(int startState) {
      state = startState;
//      evolveState();// no no no, must not invoke public/package methods.
    }

  /** Resets the state of the new widget. 
   *  This implementation calls the evolveState method after setting the state.
   */
    public void resetState() {
      state = 0;
      evolveState();
    }

    public void evolveState() {
      if (state % 2 == 0) { state++; } else { state += 3; }
    }

  }

}//class


// Design for inheritance
//   - Document all self-use in methods that may be overridden.
//   - Document all overridable method triggers.
//   - This implementation ...
//   - You can 'only' test inherritability by subclassing
//       - Ususally 3 is enough subclasses.
//   - Constructors mus not use overridable methods




