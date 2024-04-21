public class Test extends Bonus {
    private String name;
    private int bonus;
    public Test(String name) {
        this.name = name;
        this.bonus = 300;
    }
    @Override public String getName() {
        return name;
    }

    @Override public int getBonus() {
        if (getBonusEligibility()){
            return bonus;
        } else {
            return 0;
        }
    }
    @Override public boolean getBonusEligibility(){ return true; }
}
