package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Model.Employee.Role;

import Model.Employee;
import Model.Employee.Poste;

/*public class EmployeImpl implements EmployeI{
private Connection conn;

public EmployeImpl() {
	this.conn=connexion.getConnexion();
}
@Override
public void add(Employe E){
	String Query="INSERT INTO Employee(nom,prenom,email,telephone,salaire,role,poste) VALUES(?,?,?,?,?,?,?)";
	try(PreparedStatement stmt = connexion.getConnexion().prepareStatement(Query)){
		stmt.setString(1,E.getNom());
		stmt.setString(2,E.getPrenom());
		stmt.setString(3,E.getEmail());
		stmt.setString(4,E.getTelephone());
		stmt.setDouble(5,E.getSalaire());
		stmt.setString(6, E.getRole().name());
		stmt.setString(7,E.getPoste().name());
		stmt.executeUpdate();
	}catch(SQLException e){
		System.out.println("erreure de stmt");
		//e.printStackTrace();

	}
	
	
}*/
public class EmployeImpl implements EmployeeDAOI {
    private Connection conn;

    public EmployeImpl() {
        this.conn = DBConnection.getConnexion();
    }

    public void add(Employee E) {
        String Query = "INSERT INTO Employee(nom, prenom, email, telephone, salaire, role, poste) VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(Query)) { // Utilise la connexion déjà initialisée
            stmt.setString(1, E.getNom());
            stmt.setString(2, E.getPrenom());
            stmt.setString(3, E.getEmail());
            stmt.setString(4, E.getTelephone());
            stmt.setDouble(5, E.getSalaire());
            stmt.setString(6, E.getRole().name());
            stmt.setString(7, E.getPoste().name());
            stmt.executeUpdate();
            System.out.println("Employé ajouté avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de l'employé !");
            e.printStackTrace(); // Fournit plus de détails sur l'erreur
        }
    }
@Override
public Employee findByEmail(int employeId) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Employee> findAll() {
	// TODO Auto-generated method stub
	return null;
}
public void update(Employee E, int id) {
	// TODO Auto-generated method stub
	
}
public void delete(int E) {
	// TODO Auto-generated method stub
	
}
public List<Model.Employee.Role> findAllRoles() {
	// TODO Auto-generated method stub
	return null;
}
public List<Poste> findAllPostes() {
	// TODO Auto-generated method stub
	return null;
}

}