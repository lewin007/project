public class Ligne {
    private Commande commande;
    private Article article;
    private int quantitecomm;

    public Ligne(Commande commande, Article article, int quantitecomm) {
        this.commande = commande;
        this.article = article;
        this.quantitecomm = quantitecomm;
    }

    // Accesseurs pour les attributs de la classe Ligne
    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantitecomm() {
        return quantitecomm;
    }

    public void setQuantitecomm(int quantitecomm) {
        this.quantitecomm = quantitecomm;
    }
}
