package controller;



import Model.Employee.Poste;
import Model.Employee.Role;

import Model.EmployeeModel;
import View.EmployeeView;

public class EmployeeController {
private EmployeeModel model;
private EmployeeView view;

public EmployeeController(EmployeeModel model,EmployeeView view) {
	this.model=model;
	this.view=view;
	this.view.ajouterButton.addActionListener(e->addEmploye());
}
private void addEmploye() {
	String nom=view.getNom();
	String prenom=view.getPrenom();
	String email=view.getEmail();
	String telephone=view.getTelephone();
	double salaire =view.getSalaire();
	Poste poste=view.getPoste();
	Role role=view.getRole();
	
	try {
		salaire=view.getSalaire();
	}catch(NumberFormatException e) {
		System.out.println("salaire Invalide !!!!!");
	}
	
	boolean addEmploye=model.addEmploye(nom, prenom, email, telephone,salaire, role, poste);
	if(addEmploye) System.out.println("Employe ajoute avec Succes");
	else System.out.println("Echec d'ajout d'employe !!!!!");
}

}