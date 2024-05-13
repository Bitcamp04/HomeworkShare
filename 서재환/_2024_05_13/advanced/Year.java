package homework._2024_05_13.advanced;


import lombok.Getter;

@Getter
public enum Year {
    one(31,31),
    two(28,29),
    three(31,31),
    four(30,30),
    five(31,31),
    six(30,30),
    seven(31,31),
    eight(31,31),
    nine(30,30),
    ten(31,31),
    eleven(30,30),
    twelve(31,31);

    private int days;
    private int daysPlus;

    private Year(int days, int daysPlus) {
        this.days = days;
        this.daysPlus = daysPlus;
    }

    public static void sumDays(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(Year.one.getDaysPlus()+
                    Year.two.getDaysPlus()+Year.three.getDaysPlus()+Year.four.getDaysPlus()+Year.five.getDaysPlus());
        }
        else {
            System.out.println(Year.one.getDays()+Year.two.getDays()+Year.three.getDays()+Year.four.getDays()+Year.five.getDays());
        }
    }
}
