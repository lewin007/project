public abstract class Personne {
    protected int ident;
    protected String nomsocial;
    protected String adresse;

    public Personne(int ident, String nomsocial, String adresse) {
        this.ident = ident;
        this.nomsocial = nomsocial;
        this.adresse = adresse;
    }

    // Accesseurs pour les attributs
    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getNomsocial() {
        return nomsocial;
    }

    public void setNomsocial(String nomsocial) {
        this.nomsocial = nomsocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode pour afficher les informations de la personne
    public abstract void Affiche();
}
