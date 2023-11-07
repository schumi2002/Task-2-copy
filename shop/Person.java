package shop;

import java.time.LocalDate;
import java.util.Objects;


public interface personTemp {
    String getName();
    void setName(String name);
    LocalDate getDOB();
}
public class Person implements personTemp {
    private String Name;
    private LocalDate DOB;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Name, person.Name) && Objects.equals(DOB, person.DOB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, DOB);
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", DOB: " + DOB;
    }
}
