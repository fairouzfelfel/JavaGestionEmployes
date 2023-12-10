package tn.esprit.GestionEmployees;

public class Employes implements Comparable<Employes> {
    private int id;
    private String Nom;
    private String Prenom;
    private String NomDepartement;
    private int grade;

    public Employes() {
    }

    public Employes(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        Nom = nom;
        Prenom = prenom;
        NomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getNomDepartement() {
        return NomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        NomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass())
            return false;
        Employes e = (Employes) o;
        return this.getId() == e.getId()&& getNom().equals(e.getNom());
    }

    @Override
    public String toString() {
        return "Employe{ identifiant=" + id+ ", grade=" + grade + ", nom=" + Nom + ", prenom=" + Prenom + ", departement=" + NomDepartement + "}";
    }

    @Override
    public int compareTo(Employes o) {
        return this.id - o.id;
    }

}
