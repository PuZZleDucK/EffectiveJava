

public class Builder {
    private int width, height, length, age, scale, x, y, z, transparency, priority = -1;
    public static void main(String[] args) {
	System.out.println("Builder Pattern");
        Builder co = new ComplexBuilder().makeWidth(88).build();
        System.out.println("B: "+co);
    }//main

    public String toString() {
	return "("+width+","+height+","+length+")";
    }

    public static class ComplexBuilder{
        private int width, height, length, age, scale, x, y, z, transparency, priority = -1;
	public ComplexBuilder() {
	}
        public Builder build() {
            Builder builder = new Builder();
            builder.width = this.width;
	    return builder;
        }
        public ComplexBuilder makeWidth(int iWidth) {
	    this.width = iWidth;
	    return this;
	}
    }//complex
}//class
