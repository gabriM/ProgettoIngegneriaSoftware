/**
 * La classe Partita estende la classe Categoria per poter creare oggetti Partita.
 *
 * In particolare definisce:
 *
 * genere, indica se i partecipanti sono maschi o femmine;
 * fasciaEta, indica l'età massima e minima per partecipare all'evento;
 *
 *
 * @author Matteo Gusmini
 *
 * @version 3.0 1 Febbraio 2019
 */
public class Partita extends Categoria {

	/*Attributi*/
	private Campo genere=new Campo("Genere","Indica se i partecipanti sono maschi o femmine",true);
	private Campo fasciaEta=new Campo("Fascia di et�","Indica l'et� massima e minima per partecipare all'evento",true);

	/**
	 * Costruttore di default.
	 * Una partita e' costituita da nome e descizione.
	 *
	 * @author Matteo Gusmini
	 */
	public Partita(){
		super("Partita di Calcio","Evento sportivo che prevede un match di 90 minuti");
	}

	/*Getters*/
	/**
	 * Ritorna il genere dei partecipanti dell'evento
	 * @return il genere dei partecipanti dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public Campo getGenere() {
		return genere;
	}
	/**
	 * Ritorna la fascia di età dei partecipanti
	 * @return la fascia di età dei partecipanti
	 *
	 * @author Matteo Gusmini
	 */
	public Campo getFasciaEta() {
		return fasciaEta;
	}

	/*Setters*/
	/**
	 * Permette di cambiare il genere dei partecipanti dell'evento
	 * @param genere il genere dei partecipanti dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public void setGenere(Campo genere) {
		this.genere = genere;
	}
	/**
	 * Permette di cambiare la fascia di età dei partecipanti
	 * @param fasciaEta la fascia di età dei partecipanti
	 *
	 * @author Matteo Gusmini
	 */
	public void setFasciaEta(Campo fasciaEta) {
		this.fasciaEta = fasciaEta;
	}
	/**
	 * Ritorna una stringa che descrive tutti i campi della categoria Partita
	 *
	 * @return tutti i campi della categoria partita
	 *
	 * @author Matteo Gusmini
	 */
	public void visualizzaCampi(){
		super.visualizzaCampi();
		System.out.println(genere.visualizzaCampo());
		System.out.println(fasciaEta.visualizzaCampo());
	}

	
	
	
}

