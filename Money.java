public class Money {
    private long dollars;
    private long cents;

    public Money(double amount)
    {
        this.dollars = dollars;
        this.cents = cents;
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
        long totalCents = this.cents - otherObject.cents;
        long totalDollars = this.dollars - otherObject.dollars - totalCents/100;
        totalCents %= 100;
        return new Money(totalCents - totalDollars/100);
    }
    public int compareTo(Money otherObject)
    {
        if(this.dollars == otherObject.dollars && this.cents == otherObject.cents){
            System.out.println("The two are equal");
            return 1;
        }
        if(this.dollars != otherObject.dollars && this.cents != otherObject.cents){
            System.out.println("The two values are not equal");
            return 1;
        }
        if(this.dollars > otherObject.dollars && this.cents > otherObject.cents){
            System.out.println("Currrent object is greater!");
            return 1;
        }
        if(this.dollars < otherObject.dollars && this.cents < otherObject.cents){
            System.out.println("Current object is lesser!");
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
        return "Money [dollars=" + dollars + ", cents=" + cents + "]";
    }
    
}
