import java.util.Scanner;
import java.util.Vector;

public class Commerciale {
    private Vector<Article> articles;
    private Vector<Client> clients;
    private Vector<Commande> commandes;
    private Vector<Ligne> lignes;

    public Commerciale() {
        articles = new Vector<>();
        clients = new Vector<>();
        commandes = new Vector<>();
        lignes = new Vector<>();
    }

    public void AjouterArticle(Article a) {
        articles.add(a);
    }

    public void SupprimerArticle(Article a) {
        articles.remove(a);
    }

    public void AjouterClient(Client c) {
        clients.add(c);
    }

    public void SupprimerClient(Client c) {
        clients.remove(c);
    }

    public void PasserCommande(Commande c) {
        commandes.add(c);
    }

    public void AnnulerCommande(Commande c) {
        commandes.remove(c);
    }

    public void AjouterLigne(Ligne l) {
        lignes.add(l);
    }

    public void SupprimerLigne(Ligne l) {
        lignes.remove(l);
    }

    public void AfficherArticles() {
        System.out.println("--- Liste des Articles ---");
        for (Article a : articles) {
            a.Affiche();
        }
    }

    public void AfficherClients() {
        System.out.println("--- Liste des Clients ---");
        for (Client c : clients) {
            c.Affiche();
        }
    }

    public void AfficherCommandes() {
        System.out.println("--- Liste des Commandes ---");
        for (Commande c : commandes) {
            System.out.println("Numéro de commande : " + c.getNumcomm());
            System.out.println("Date de commande : " + c.getDatecomm());
            System.out.println("Client : " + c.getClient().getNomsocial());
            // Afficher d'autres détails de la commande si nécessaire
        }
    }

    public static void main(String[] args) {
        Commerciale commerce = new Commerciale();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Afficher la liste des articles");
            System.out.println("3. Ajouter un client");
            System.out.println("4. Afficher la liste des clients");
            System.out.println("5. Passer une commande");
            System.out.println("6. Afficher la liste des commandes");
            System.out.println("0. Quitter");

            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // Ajouter un article
                    System.out.print("Entrez la référence : ");
                    int ref = scanner.nextInt();
                    scanner.nextLine(); // Pour consommer la nouvelle ligne après le nextInt()

                    System.out.print("Entrez la désignation : ");
                    String des = scanner.nextLine();

                    System.out.print("Entrez le prix unitaire : ");
                    double prix = scanner.nextDouble();

                    System.out.print("Entrez la quantité en stock : ");
                    int quantite = scanner.nextInt();

                    Article nouvelArticle = new Article(ref, des, prix, quantite);
                    commerce.AjouterArticle(nouvelArticle);
                    System.out.println("Article ajouté avec succès !");
                    break;
                case 2:
                    commerce.AfficherArticles();
                    break;
                case 3:
                    // Ajouter un client
                    // Code similaire à l'ajout d'un article pour collecter les détails du client
                    break;
                case 4:
                    commerce.AfficherClients();
                    break;
                case 5:
                    // Passer une commande
                    // Code pour créer une commande avec un client et des articles
                    break;
                case 6:
                    commerce.AfficherCommandes();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }
}
