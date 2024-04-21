import java.time.LocalDate;

public class Goal {
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
    public int getBonus() {
        return bonus;
    }
    public String getName() {
        return name;
    }
}
