
public class Gestion {

    // Functionnalities
    /*
     * 1- ajouterProduit() ==> Jean Urbain
     * 2- receptionnerProduit(int pQuantite) ==> Marie-Princesse
     * 3- vendreProduit(int pQuantite) ==> Gloria
     * 4- afficherStock() ==> Fovi Alphonse
     * 5- afficherRuptureStock() ==> René KingBrain
     * 6- Gestion de la méthode main. ==> Me ( c'est doyi )
     */

    public class TeamGestion {
        // Attributs
        private String nomProduit = "";
        private int quantite = 0;
        private double prix = 0;

        public void vendreProduit(String pNomProduit, int pQuantite) {
            if (pQuantite <= 0) {
                System.out.println("Quantité de vente invalide.");
                return;
            }
            if (this.quantite >= pQuantite) {
                this.quantite -= pQuantite;
                System.out.println("Vente réussie. Quantité restante : " + quantite);
            } else {
                System.out.println("Stock insuffisant pour la vente.");
            }
            return;

        }

        //afficherstock()

        int pStock = 0
        System.out.prinln("MENU D'AFFICHAGE DU STOCK ")
        if (pStock = O) {
            System.out.println("Aucune produit n'a été ajouté pour le moment")
        } else{
            for (pProduit p = pStock){
                System.out.println(p)
            }
        }

        // Constructeur d'initialisation
        public TeamGestion(String pNomProduit, int pPrix) {
            nomProduit = pNomProduit;
            prix = pPrix;
        }

         //Affichage des produits en rupture de stock
        public void afficherRuptureStock(){
            int seuil = 10;
            if(quantite < seuil){
                System.out.println(nomProduit);
            }
        }
    }


    public static void main(String[] args) {

    }
}
