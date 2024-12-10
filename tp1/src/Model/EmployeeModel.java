package Model;

import DAO.EmployeeDAOimpl;
import Model.Employee;
import Model.Employee.Poste;
import Model.Employee.Role;

public class EmployeeModel<dao> {
    private EmployeeDAOimpl dao; // DAO pour interagir avec la base de données

    // Constructeur
    public EmployeeModel(EmployeeDAOImpl dao) {
        this.dao = dao;
    }

    // Logique métier
    public boolean addEmployee(String nom, String prenom, String email, String telephone, double salaire, Role role, Poste poste) {
        // Validation des données
        if (nom == null || nom.trim().isEmpty()) {
            System.out.println("Le nom est obligatoire !");
            return false;
        }

        if (prenom == null || prenom.trim().isEmpty()) {
            System.out.println("Le prénom est obligatoire !");
            return false;
        }

        if (salaire <= 0) {
            System.out.println("Le salaire doit être supérieur à 0 !");
            return false;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("L'email n'est pas valide !");
            return false;
        }

        // Création d'un nouvel employé
        Employee newEmployee = new Employee(0, nom, prenom, email, telephone, poste, role, salaire);

        // Ajout dans la base via DAO
        dao.addEmployee(newEmployee);
        return true;
    }
}
