public class Client extends Personne {
    private double chiffreaffaire;

    public Client(int ident, String nomsocial, String adresse, double chiffreaffaire) {
        super(ident, nomsocial, adresse);
        this.chiffreaffaire = chiffreaffaire;
    }

    // Accesseurs pour chiffreaffaire
    public double getChiffreaffaire() {
        return chiffreaffaire;
    }

    public void setChiffreaffaire(double chiffreaffaire) {
        this.chiffreaffaire = chiffreaffaire;
    }

    // Redéfinition de la méthode Affiche pour inclure les informations du client
    @Override
    public void Affiche() {
        System.out.println("Identifiant: " + ident);
        System.out.println("Nom Social: " + nomsocial);
        System.out.println("Adresse: " + adresse);
        System.out.println("Chiffre d'affaires: " + chiffreaffaire);
    }
}
