package tp2;

public class Etudiant {
private String nom;
private String prenom;
private int numEtudiant;
public String getNom() {
	return nom;
}
public String getPrenom() {
	return prenom;
}
public int getNumEtudiant() {
	return numEtudiant;
} 
  public Etudiant () {
	  this.nom=null;
	  this.prenom=null;
	  this.numEtudiant=0;
  }
  public Etudiant(String n,String pr,int num) {
	  nom=n;
	  prenom=pr;
	  numEtudiant=num;
  }
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      Etudiant other = (Etudiant) o;
      return numEtudiant == other.numEtudiant;
  }
}
