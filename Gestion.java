import java.util.Scanner;

public class Gestion{

    // Functionnalities
    /*
    1- ajouterProduit() ==> Jean Urbain
    2- receptionnerProduit(int pQuantite) ==> Marie-Princesse 
    3- vendreProduit(int pQuantite) ==> Gloria
    4- afficherStock() ==> Fovi Alphonse
    5- afficherRuptureStock() ==> René KingBrain
    6- Gestion de la méthode main. ==> Me ( c'est doyi )
    */

static void vendreProduit(String pNomProduit, int pQuantite) {
    if (pQuantite <= 0) {
        System.out.println("Quantité de vente invalide.");
        return;
    }

    for (int i = 0; i < nbProduits; i++) {
        if (stock[i].nomProduit.equalsIgnoreCase(pNomProduit)) {
            int pquantiteStock = stock[i].quantite;

            if (pquantiteStock >= pQuantite) {
                stock[i].quantite -= pQuantite; 
                System.out.println("Vente réussie. Quantité restante : " + stock[i].quantite);
            } else {
                System.out.println("Stock insuffisant pour la vente.");
            }
            return;
        }
    }
    System.out.println("Produit non trouvé.");
}



    public class TeamGestion{
        // Attributs
        private String nomProduit="";
        private int quantite=0;
        private double prix=0;

        // Constructeur d'initialisation
        public TeamGestion(String pNomProduit,int pPrix){
            nomProduit = pNomProduit;
            prix = pPrix;
        }

    }

    //Affichage des produits en rupture de stock
    public void afficherRuptureStock(){
        System.out.println("Les produits suivants sont en rupture de stock");
        int seuil = 10;
        for (int i = 0; i < produits.size(); i++) {
            if(produits.quantite < seuil){
                System.out.println(produits(i).nomProduit +" : Quantité restante : "+produits.quantite);
            }
        }

    }

    public static void main(String[] args) {
        
    }
}