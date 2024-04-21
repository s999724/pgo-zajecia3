public class Technology extends Bonus{
    private String name;
    private int bonus;
    public Technology(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }
    @Override public String getName(){
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
