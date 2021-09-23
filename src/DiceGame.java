public class DiceGame {
    private Die d1, d2;
    private int fv1, fv2;

    public DiceGame(){
        d1 = new Die(20);
        d2 = new Die(20);
    }

    public boolean play(){
        d1.roll();
        fv1 = d1.getFaceValue();

        d2.roll();
        fv2 = d2.getFaceValue();

        return fv1 == fv2;
    }



}
