import java.util.ArrayList;
import java.util.Scanner;
public class Gestion {

    // Functionnalities
    /*
    1- ajouterProduit() ==> Jean Urbain
    2- receptionnerProduit(int pQuantite) ==> Marie-Princesse 
    3- vendreProduit(int pQuantite) ==> Gloria
    4- afficherStock() ==> Fovi Alphonse
    5- afficherRuptureStock() ==> René KingBrain
    6- Gestion de la méthode main. ==> Me ( c'est doyi ,courage )
    */


    static class TeamGestion {
        // Attributs
        private String nomProduit = "";
        private int quantite = 0;
        private double prix = 0;
        
        // Constructeur d'initialisation
        public TeamGestion(String pNomProduit, int pPrix) {
            nomProduit = pNomProduit;
            prix = pPrix;
        }

        public void vendreProduit(String pNomProduit, int pQuantite) {
            if (pQuantite <= 0) {
                System.out.println("Quantité de vente invalide.");
                return;
            }
            if (this.quantite >= pQuantite) {
                this.quantite = this.quantite - pQuantite;
                System.out.println("Vente réussie. Quantité restante : " + quantite);
            } else {
                System.out.println("Stock insuffisant pour la vente.");
            }
            return;

        }

        //afficherstock()
       public String afficherStock(){
            return "[nom = "+nomProduit+ "| prix = "+prix+ "| quantité=" +quantite+"]";

        }
        
        public void receptionnerProduit( int pQuantite) {
            this.quantite = this.quantite + pQuantite;
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
        // variables
        ArrayList <TeamGestion> produits = new ArrayList<TeamGestion>();
        Scanner input = new Scanner(System.in);
        int choix,quantite,index;
        String nom = new String();
        double prix;


        do {
            System.out.println("===___MENU PRINCIPALE___===");
            System.out.println("Choix 1: Ajouter un produit");
            System.out.println("Choix 2: Réceptionner un produit");
            System.out.println("Choix 3: Vendre un produit");
            System.out.println("Choix 4: Afficher le stock de produits");
            System.out.println("Choix 5: Afficher les produits  en rupture de stock");
            System.out.println("Choix 0: Quitter");

            choix = input.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("===__MENU AJOUT PRODUIT__===");
                    System.out.println("Veuillez entrer le nom du produit à ajouter");
                    input.nextLine();
                    nom = input.next();
                    System.out.println("Veuillez entrer le nom du produit à ajouter");
                    quantite = input.nextInt();
                    produits.add(new TeamGestion(nom, quantite));
                    break;
                
                case 2:
                    System.out.println("===__MENU RÉCEPTION PRODUIT__===");
                    System.out.println("Voici la liste des produits dispo");
                    for(int i=0;i<produits.size();i++){
                        System.out.println("produit " + (i+1) + " : " + produits.get(i).afficherStock());
                    }
                    System.out.println("Veuillez dans la liste choisir l'index du produit à réceptionner ( 1 pour produit 1)");
                    index = input.nextInt();
                    System.out.println("vous avez choisi le produit " + produits.get(index).nomProduit);
                    System.out.println("veuillez entrer la quantité à ajouter ");
                    quantite = input.nextInt();
                    produits.get(index).receptionnerProduit();

                    break;
            
                default:
                    System.out.println("Le choix fait est incorrect. veuillez recommencer");
                    break;
            }

        } while (choix!=0);
        

        
    }
}
