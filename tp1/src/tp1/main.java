package tp1;

import DAO.EmployeeDAOimpl;
import Model.EmployeeModel;
import View.EmployeeView;

public class main {
public static void main(String[]args) {
	EmployeeView view=new EmployeeView();
	EmployeeDAOimpl dao=new EmployeeDAOimpl(null);
	EmployeeModel model=new EmployeeModel(dao);
	
	view.setVisible(true);
}
}