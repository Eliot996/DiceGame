public class Die {
    private int faceValue;
    private int faceCount = 6;

    public Die(){
        this.roll();
    }
    public Die(int faceCount){
        if (faceCount <= 0) throw new IllegalArgumentException("faceCount must be more than 0");

        this.faceCount = faceCount;
        this.roll();
    }

    public void roll(){
        faceValue = (int) Math.ceil(Math.random()*faceCount);
    }

    public int getFaceValue() {
        return faceValue;
    }



}
