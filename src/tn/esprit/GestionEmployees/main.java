package tn.esprit.GestionEmployees;

public class main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employes emp1 = new Employes(1, "Fairouz", "Felfel", "informatique", 3);
        Employes emp2 = new Employes(2, "Jihene", "Felfel", "Mathematique", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        System.out.println("Liste des employés :");
        societe.displayEmploye();
        String nomRecherche = "Mohamed";
        boolean NomTrouvé = societe.rechercherEmploye(nomRecherche);
        System.out.println("Employé avec le nom " + nomRecherche + " existe : " + NomTrouvé);
        societe.supprimerEmploye(emp1);
        System.out.println("Liste des employés après suppression :");
        societe.displayEmploye();
    }}