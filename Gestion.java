public class Gestion{

    // Functionnalities
    /*
    1- ajouterProduit() ==> Jean Urbain
    2- receptionnerProduit(int pQuantite) ==> Marie-Princesse 
    3- vendreProduit(int pQuantite) ==> Gloria
    4- afficherStock() ==> Fovi Alphonse
    5- afficherRuptureStock() ==> René KingBrain
    6- Gestion de la méthode main. ==> Me ( c'est doyi ,courage )
    */


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
    public static void receptionnerProduit( int pQuantite) {
        this.quantite = this.quantite + pQuantite;

        
    }
}