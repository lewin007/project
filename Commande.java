import java.util.Date;

public class Commande {
    private int numcomm;
    private Date datecomm;
    private Client client;

    public Commande(int numcomm, Date datecomm, Client client) {
        this.numcomm = numcomm;
        this.datecomm = datecomm;
        this.client = client;
    }

    // Accesseurs pour les attributs de la classe Commande
    public int getNumcomm() {
        return numcomm;
    }

    public void setNumcomm(int numcomm) {
        this.numcomm = numcomm;
    }

    public Date getDatecomm() {
        return datecomm;
    }

    public void setDatecomm(Date datecomm) {
        this.datecomm = datecomm;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
