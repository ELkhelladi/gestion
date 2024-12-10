package Model;

public class Employee {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private Poste poste;
    private Role role;
    private double salaire;

    // Constructeurs
    public Employee() {}

    public Employee(int id, String nom, String prenom, String email, String telephone, Poste poste, Role role, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.poste = poste;
        this.role = role;
        this.salaire = salaire;
    }

    // Getters et setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public Poste getPoste() { return poste; }
    public void setPoste(Poste poste) { this.poste = poste; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public double getSalaire() { return salaire; }
    public void setSalaire(double salaire) { this.salaire = salaire; }
    public enum Poste {
        DEVELOPPEUR,
        CHEF_DE_PROJET,
        ANALYSTE,
        TESTEUR,
        ADMINISTRATEUR;
    }public enum Role {
        ADMIN,
        MANAGER,
        EMPLOYE;
    }
}
