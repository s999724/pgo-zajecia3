import java.time.LocalDate;

public class Goal extends Bonus{
    private int year;
    private int month;
    private int day;
    private String name;
    private int bonus;

    public Goal(int year, int month, int day, String name, int bonus) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.bonus = bonus;
    }
    public LocalDate getDate(){
        return LocalDate.parse(year + "-" + month + "-" + day);
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
    //nie jest to opisane, czy inicjowane są klasy dla celów już osiągniętych, czy powinien być dla nich osobny marker, zakładam że zostały już osiągnięte
    //z wyłączeniem że wypłacone będą w miesiącu roku, w którym zostały osiągnięte
    @Override public boolean getBonusEligibility(){
        LocalDate checkDate = this.getDate();
        LocalDate todaysDate = LocalDate.now();
        return checkDate.getYear() == todaysDate.getYear() && checkDate.getMonth() == todaysDate.getMonth();
    }
}
