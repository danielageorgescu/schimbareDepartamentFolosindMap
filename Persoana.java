package com.itfactory;

import java.util.Objects;
import java.util.StringJoiner;

public class Persoana {

    //id, nume
    private int ID;
    private String nume;
    private String prenume;

    public Persoana(int ID, String nume, String prenume){
        this.ID=ID;
        this.nume=nume;
        this.prenume=prenume;
    }

    public int getID() {
        return ID;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return getID() == persoana.getID() && getNume().equals(persoana.getNume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getNume());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Persoana.class.getSimpleName() + "[", "]")
                .add("ID=" + ID)
                .add("nume='" + nume + "'")
                .toString();
    }
}
