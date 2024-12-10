package DAO;

import java.util.List;
import Model.Employee.Poste;
import Model.Employee.Role;
import Model.Employee;

public interface EmployeeDAOI {
	
Employee findByEmail(int employeId);
List<Employee> findAll();
void add(Employee E);
void update(Employee E,int id);
void delete(int E);
List<Role>findAllRoles();
List<Poste>findAllPostes();


}