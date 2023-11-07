package shop;

import java.time.LocalDate;
import java.util.Objects;

public class LoyalCard {

    private String Name;
    private int points;
    private LocalDate expiration;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoyalCard loyalCard = (LoyalCard) o;
        return points == loyalCard.points && Objects.equals(Name, loyalCard.Name) && Objects.equals(expiration, loyalCard.expiration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, points, expiration);
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", Points: " + points + ", Expiration: " + expiration;
    }

    final int rewardsValue() {
        return points/100;
    }
}
