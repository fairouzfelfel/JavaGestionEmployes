package tn.esprit.GestionEmployees;
import java.util.*;
public class DepartementsHashSet {
    public class DepartementHashSet implements IDepartement <Departement>  {
        private HashSet<Departement> departements=new HashSet<>();

        public DepartementHashSet() {
        }

        public DepartementHashSet(HashSet<Departement> departements) {
            this.departements = departements;
        }
        @Override
        public void ajouterDepartement(Departement departement) {
            departements.add(departement);

        }

        @Override
        public boolean rechercherDepartement(String nom) {
            for (Departement departement : departements) {
                if (departement.getNomDep().equals(nom)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean rechercherDepartement(Departement departement) {
            return departements.contains(departement);
        }

        @Override
        public void supprimerDepartement(Departement departement) {
            departements.remove(departement);
        }

        @Override
        public void displayDepartement() {
            System.out.println("Liste des départements :");
            for (Departement departement : departements) {
                System.out.println(departement.toString());
            }
        }

        @Override
        public TreeSet<Departement> trierDepartementById() {
            return new TreeSet<>(departements);
        }
    }
}
