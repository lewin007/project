public class Article {
    private int reference;
    private String designation;
    private double prixunitaire;
    private int quantitestock;

    public Article(int reference, String designation, double prixunitaire, int quantitestock) {
        this.reference = reference;
        this.designation = designation;
        this.prixunitaire = prixunitaire;
        this.quantitestock = quantitestock;
    }

    // Accesseurs pour les attributs de la classe Article
    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(double prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public int getQuantitestock() {
        return quantitestock;
    }

    public void setQuantitestock(int quantitestock) {
        this.quantitestock = quantitestock;
    }

    // Méthode pour afficher les informations de l'article
    public void Affiche() {
        System.out.println("Référence: " + reference);
        System.out.println("Désignation: " + designation);
        System.out.println("Prix unitaire: " + prixunitaire);
        System.out.println("Quantité en stock: " + quantitestock);
    }
}
