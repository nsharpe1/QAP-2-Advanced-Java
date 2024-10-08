public class Money {
    private long dollars;
    private long cents;

    public Money(double amount)
    {
        this.dollars = (long)amount;
        this.cents = Math.round(((amount - this.dollars) * 100));
    }
    public Money(Money otherObject)
    {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }
    public Money add(Money otherAmount)
    {
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + totalCents/100;
        totalCents %= 100;
        return new Money(totalDollars + totalCents/100);  
    }
    public Money subtract(Money otherObject)
    {
        double totalCents = this.cents + this.dollars * 100 - (otherObject.cents + otherObject.dollars * 100);
        double totalDollars = totalCents/100;
        totalCents %= 100;
        if(totalCents <0){
            totalDollars--;
            totalCents+=100;
        }
        return new Money(totalDollars + totalCents/100.0);
    }
    public int compareTo(Money otherObject)
    {
        if(this.dollars == otherObject.dollars && this.cents == otherObject.cents){
            System.out.println("The two are equal");
            return 3;
        }
        if(this.dollars != otherObject.dollars && this.cents != otherObject.cents){
            System.out.println("The two values are not equal");
            return 2;
        }
        if(this.dollars > otherObject.dollars && this.cents > otherObject.cents){
            System.out.println("Currrent object is greater!");
            return 0;
        }
        if(this.dollars <= otherObject.dollars && this.cents <= otherObject.cents){
            return 1;
        }
        return 0;
    }
    public boolean equals(Money otherObject)
    {
        if(this.dollars == otherObject.dollars && this.cents == otherObject.cents){
            System.out.println("The two are equal");
            return true;
        }
        return false;
    }
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
