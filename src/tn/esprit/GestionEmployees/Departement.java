package tn.esprit.GestionEmployees;
import java.util.*;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDep;
    private int nbrEmp;

    public Departement() {
    }
    public Departement(int id, String nomDep, int nbrEmp) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbrEmp = nbrEmp;
    }

    public int getId() {
        return id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getNbrEmp() {
        return nbrEmp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return id == that.id && Objects.equals(nomDep, that.nomDep);
    }
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nbrEmp=" + nbrEmp +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + id;
        result = result * 31 + nomDep.hashCode();
        return result;
    }

    @Override
    public int compareTo(Departement o) {
        return id - o.getId();
    }
}
