package tn.esprit.GestionEmployees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employes> {
    List<Employes> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employes employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String Nom) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNom().equals(Nom))
                return true;
        }
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employes e) {
        return employes.contains(e);
    }
    @Override
    public void supprimerEmploye(Employes employe) {
            employes.remove(employe);
        }
    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }

    @Override
    public void trierEmployeParId() {
            Collections.sort(employes);
        }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
