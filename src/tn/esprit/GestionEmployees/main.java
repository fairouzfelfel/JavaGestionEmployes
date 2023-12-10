package tn.esprit.GestionEmployees;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class main  {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        //Prosit9//
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


        //Prosit10//
        DepartementHashSet dep = new DepartementHashSet();
        Departement dep1 = new Departement(1, "Informatique", 50);
        Departement dep2 = new Departement(2, "Educatif", 30);
        Departement dep3 = new Departement(3, "Vente en ligne", 40);

        dep.ajouterDepartement(dep1);
        dep.ajouterDepartement(dep2);
        dep.ajouterDepartement(dep3);

        // Affichage des départements
        System.out.println("Liste des départements :");
        dep.displayDepartement();

        // Recherche d'un département par nom
        String recherche = "Informatique";
        if (dep.rechercherDepartement(recherche)) {
            System.out.println("Le département '" + recherche + "' a été trouvé.");
        } else {
            System.out.println("Le département '" + recherche + "' n'a pas été trouvé.");
        }

        // Suppression d'un département
        dep.supprimerDepartement(dep2);

        // Affichage des départements après suppression
        System.out.println("Liste des départements après suppression :");
        dep.displayDepartement();
        // Tri des départements par ID et affichage
        System.out.println("Liste des départements triés par ID :");
        System.out.println(dep.trierDepartementById());
        //Prosit11//
        AffectationHashMap AHM = new AffectationHashMap();
        Employes e1 = new Employes(1, "Jdidi", "Donia", "Informatique", 3);
        Employes e2 = new Employes(2, "Faiza", "Malek", "Mathematiques", 2);
        Employes e3 = new Employes(3, "Felfel", "Fairouz", "Informatique", 2);
        Departement d1 = new Departement(1, "J21", 10);
        Departement d2 = new Departement(2, "J41", 10);

        AHM.ajouterEmployeDepartement(emp1, dep1);
        AHM.ajouterEmployeDepartement(emp2, dep2);
        AHM.ajouterEmployeDepartement(emp1, dep2);
        AHM.afficherEmployesEtDepartements();
        AHM.supprimerEmploye(emp2);
        AHM.afficherEmployes();
        AHM.afficherDepartments();
        System.out.println(AHM.rechercherEmploye(emp2));
        System.out.println(AHM.rechercherDepartement(dep1));
        System.out.println(AHM.trierMap());
        AHM.supprimerEmployeEtDepartement(emp1, dep2);
        AHM.afficherEmployesEtDepartements();

//Prosit12//
        List<Etudiant> etudiants = new ArrayList<>();
        StudentManagement students = new StudentManagement();
        Etudiant etudiants1 = new Etudiant(1, "Dali", 22);
        Etudiant etudiants2 = new Etudiant(2, "Ahmed", 21);

        Consumer<Etudiant> con = etudiant -> System.out.println(etudiant.toString());
        Predicate<Etudiant> pre = etudiant -> etudiant.getNom().startsWith("E"); //Checks etudiants that starts with letter "H"
        Function<Etudiant, String> fun = Etudiant::getNom;
        Supplier<Etudiant> sup = Etudiant::new;
        Comparator<Etudiant> comp = Comparator.comparingInt(Etudiant::getId);
        students.addEtudiant(etudiants, e2);
        students.addEtudiant(etudiants, e1);

        students.displayStudents(etudiants, con);
        students.displayStudentsByFilter(etudiants, pre, con);
        System.out.println(students.returnStudentsNames(etudiants, fun));
        Etudiant e = students.createStudent(sup);
        System.out.println(e);
        etudiants = students.sortStudentsById(etudiants, comp);
        System.out.println(etudiants);
        Stream<Etudiant> etudiantStream = students.convertToStream(etudiants);
        etudiantStream.forEach(System.out::println);
        System.out.println("PROJET TERMINE");
    }}