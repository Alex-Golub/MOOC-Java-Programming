
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        return this.euros * 100 + this.cents < compared.euros * 100 + compared.cents;
    }

    public Money minus(Money decreaser) {
        int newEuro = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newEuro--;
            newCents = 100 - Math.abs(newCents);
        }
        
        if (newEuro < 0) {
            newCents = 0;
            newEuro = 0;
        }
        
        // 10.10 - 3.30
        // 10 - 3 = 7
        // 10 - 30 = -20
        // 6.80

        return new Money(newEuro, newCents);

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
