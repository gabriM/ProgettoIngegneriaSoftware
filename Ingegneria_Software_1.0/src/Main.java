import java.util.ArrayList;

import MyLib.Menu;
import MyLib.Utility;

/**
 * Classe che definisce il Main del programma.
 *
 * @author Gabriele Manenti, Matteo Gusmini
 *
 * @version 3.0 1 Febbraio 2019
 *
 */
public class Main {
    /**
     * Metodo Main del programma
     *
     */
	public static void main(String[] args) {

        /*Costanti*/
		final String MSGBENVENUTO="Benvenuto nella social di gestione eventi";
		final String NOMEMENU="GESTIONE Eventi";
		final String[] OPZIONI={"Visualizza Categorie"};
		final String NOME="Nome categoria: ";
		final String DESCRIZIONE="Descrizione: ";
		final String SCELTACATEGORIA="Quale categoria vuoi vedere in dettaglio?";
			
		/*Messaggio di benvenuto*/
		System.out.println(MSGBENVENUTO);

        /*Creazione degli oggetti principali per l'esecuzione del programma*/
		ArrayList<Categoria> categorie=new ArrayList<>();
		Partita partita= new Partita();
		categorie.add(partita);

        /*Menu Scelta Opzioni*/
		Menu myMenu= new Menu(NOMEMENU,OPZIONI);
		int scelta;
		
		
		do{
			scelta=myMenu.scegli();
			switch(scelta)
			{
			case 0:
				break;
			
			case 1:
				/*Visualizza categorie*/
				
				for(int i=0; i<categorie.size();i++){
					System.out.println(i+1+")");
					System.out.println(NOME + categorie.get(i).getNome());
					System.out.println(DESCRIZIONE + categorie.get(i).getDescrizione()+"\n");
				}
				int numCat=Utility.leggiIntero(1, categorie.size()+1, SCELTACATEGORIA);
				categorie.get(numCat-1).visualizzaCampi();
				
				
				break;
			}
		}while(scelta!=0);
		
	}

}
