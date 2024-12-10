package TP;

import java.util.ArrayList;
import java.util.Calendar;

public class Demo {
	

	public static void main(String[] args) {
		Secretaire secretaire=new Secretaire("mina", 2013,"maarifa",2000);
		System.out.println(secretaire);
		
		ArrayList<Estien> estiens= new ArrayList<Estien>();

		
		int nombreEtudiant = 0;
		int totalAnnee = 0;
		double moyenneAnnee = 0;
		
		estiens.add(new ERegulier("khaoula" , 2023, "GI", 16.56));
		estiens.add(new ETransfere("zineb" , 2019, "TM",16.56, "maarifa"));
		estiens.add(new Enseignant("wafaa" , 2024, "ORACLE", 41000,"BIGDATA"));
		estiens.add(new Secretaire("mina", 2013,"maarifa",2000));
		
		for (Estien estien : estiens) {
			totalAnnee += Calendar.getInstance().get(Calendar.YEAR) - estien.getAnnee(); 
			if(estien instanceof Etudiant) nombreEtudiant++;
		}
		
		moyenneAnnee = (double)totalAnnee/(double)estiens.size(); 
		
		System.out.println("Parmis les " + estiens.size() + " Estien, "  + nombreEtudiant + " sont des étudiants");
		System.out.println("Ils sont a L'Est depuis en moyen " + moyenneAnnee + " ans");
		System.out.println("Liste des estiens");
		
		for (Estien estien : estiens) {
			System.out.println(estien);
		}

	}

}
