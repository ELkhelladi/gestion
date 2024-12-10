package tp2;

public class demoEtudiant {

    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("khaoula", "el khelladi", 12345);
        Etudiant e2 = new Etudiant("luc", "Maro", 12345);
        Etudiant e3 = new Etudiant("wijadn", "el barchaoui", 67890);
        System.out.println(e1.equals(e2)); 
        System.out.println(e1.equals(e3)); 
    }
}
