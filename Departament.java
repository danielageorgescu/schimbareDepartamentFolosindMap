package com.itfactory;

import java.util.Objects;
import java.util.StringJoiner;

public class Departament {
private String numeDepartament;

    public Departament(String numeDepartament){
        this.numeDepartament= numeDepartament;
    }

    public String getNumeDepartament() {
        return numeDepartament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departament)) return false;
        Departament that = (Departament) o;
        return Objects.equals(getNumeDepartament(), that.getNumeDepartament());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeDepartament());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Departament.class.getSimpleName() + "[", "]")
                .add("numeDepartament='" + numeDepartament + "'")
                .toString();
    }
}
