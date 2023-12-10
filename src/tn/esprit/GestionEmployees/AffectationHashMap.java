package tn.esprit.GestionEmployees;
import java.util.*;

public class AffectationHashMap {
    private Map<Employes, Departement> affectation=new HashMap<>();

    public AffectationHashMap() {
    }

    public AffectationHashMap(Map<Employes, Departement> affectation) {
        this.affectation = affectation;
    }
    public Map<Employes, Departement> getAffectation() {
        return affectation;
    }
    public void setAffectation(Map<Employes, Departement> affectation) {
        this.affectation = affectation;
    }
    public void ajouterEmployeDepartement(Employes e, Departement d){
        e.setNomDepartement(d.getNomDep());
        affectation.put(e, d);
    }
    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employes, Departement> entry : affectation.entrySet()){
            System.out.println(entry.getKey().getNom() + ", " + entry.getKey().getPrenom() + ": Department: " + entry.getValue().getNomDep());
        }
    }

    public void supprimerEmploye(Employes e) {
        if (affectation.containsKey(e))
            affectation.remove(e);
        else
            System.out.println("l'employe n'existe pas.");
    }

    public void supprimerEmployeEtDepartement(Employes e, Departement d){
        if(affectation.containsKey(e) && affectation.containsValue(d))
            affectation.remove(e, d);
        else
            System.out.println("Employee or Departement n'existe pas.");
    }

    public void afficherEmployes(){
        Set<Employes> employees = affectation.keySet();
        Iterator<Employes> iterator = employees.iterator();
        System.out.println("Employees IDs:");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getId());
        }
    }

    public void afficherDepartments(){
        Collection<Departement> departments = affectation.values();
        System.out.println("Departments: ");
        for(Departement d : departments){
            System.out.println(d.getId() + ", " + d.getNomDep());
        }
    }

    public boolean rechercherEmploye(Employes e){
        return affectation.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return affectation.containsValue(d);
    }

    TreeMap<Employes, Departement> trierMap(){
        Comparator<Employes> Compartor = new Comparator<Employes>() {
            @Override
            public int compare(Employes o1, Employes o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeMap<Employes, Departement> newDetails = new TreeMap<>(Compartor);
        newDetails.putAll(affectation);
        return newDetails;
    }
}

