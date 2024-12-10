package connixion;

public class verification {{
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver"); // Force le chargement du driver
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}

}}
