public class SimulateurDriver {

    public static void main(String[] args) {
	// Initialisation: Ascenseur a 4 etages, dont le RDC
        // Cabine porte fermee, arretee a l'etage 1
        
        // Creation des boutons
        // Pour chaque bouton: creerBouton(int numBouton, int numEtage)
        ???.creerBouton(0,0);
        ???.creerBouton(1,1);
        ???.creerBouton(2,2);
        ???.creerBouton(3,3);
        // Creation de l'entrainement: creerEntrainement(int numEntrainement)
        ???.creerEntrainement(0);
        // Creation des portes
        // Pour chaque porte: creerPorte(int numPorte, int numEtage)
        ???.creerPorte(0,0);
        ???.creerPorte(1,1);
        ???.creerPorte(2,2);
        ???.creerPorte(3,3);
        ???.creerPorte(4,-1);
        // Creation des etages
        // Pour chaque etage: creerEtage(int numEtage, int numBouton, int numPorte)
        ???.creerEtage(0, 0, 0);
        ???.creerEtage(1, 1, 1);
        ???.creerEtage(2, 2, 2);
        ???.creerEtage(3, 3, 3);
        // Creation de la cabine: creerCabine(int numEntrainement, int numPorte, int numEtageCourant)
        ???.creerCabine(0, 4, 1);
        System.out.println("etat de la cabine: " + GestionCabine.getEtatCabine().toString());
        System.out.println("etage courant de la cabine: " + GestionCabine.getNumEtageCourant());
        System.out.println("");

        //Execution du scenario par simulation des drivers
        System.out.println("appel par le driver de la méthode notificationPression(3) ");
        ???.notificationPression(3);
        System.out.println("etat de la cabine: " + GestionCabine.getEtatCabine().toString());
        System.out.println("");

}
