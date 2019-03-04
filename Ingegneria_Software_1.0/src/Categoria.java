import java.util.ArrayList;

import java.util.ArrayList;

/**
 * Classe che definisce una <i>Categoria</i>.
 *
 * Una categoria contiene i dati riguardanti un determinato evento:
 * nome;
 * descrizione;
 * titolo;
 * numero partecipanti;
 * data termine iscrizione;
 * luogo;
 * ora;
 * durata;
 * quota individuale di partecipazione;
 * compreso nella quota;
 * data finale;
 * ora finale;
 * note;
 *
 *
 * @author Gabriele Manenti
 *
 * @version 3.0 1 Febbraio 2019
 *
 */
public class Categoria {
	
	/*Costanti*/
	private String nome;
	private String descrizione;
	private Campo titolo=new Campo("Titolo","Consiste in un nome di fantasia attribuito all�evento",false);
	private Campo nPartecipanti=new Campo("Numero di partecipanti"," Stabilisce il numero di persone da coinvolgere nell�evento",true);
	private Campo termineIscrizione=new Campo("Termine ultimo iscrizione","Indica l'ultimo giorno utile per iscriversi all�evento",true);
	private Campo luogo=new Campo("Luogo","Indica l'indirizzo in cui si svolger� l�evento oppure il punto di ritrovo",true);
	private Campo ora=new Campo("Ora","Indica l'ora in cui i partecipanti dovranno recarisi nel luogo prestabilito",true);
	private Campo durata=new Campo("Durata","Indica la durata in termini di numero(approssimativo)di ore e minuti, per gli eventi che si esauriscono in un sol giorno, o in termini di numero esatto di giorni, per gli eventi che occupano pi� giorni consecutivi",false);
	private Campo quotaIndividuale=new Campo("Quota individuale"," indica la spesa (o una stima della stessa) che ogni partecipante all�iniziativa dovr� sostenere (si noti che la spesa pu� anche essere nulla)",true);
	private Campo compresoQuota=new Campo("Compreso nella quota"," indica tutte le voci di spesa comprese nell�ammontare indicato nella �Quota individuale�",false);
	private Campo dataFine=new Campo("Data conclusiva"," Indica la data di fine dell�evento",false);
	private Campo oraFine=new Campo("Ora conclusiva"," Indica l'ora di fine dell�evento",false);
	private Campo note=new Campo("Note"," Contiene informazioni aggiuntive circa l'evento",false);

	/*Costruttori*/
	/**
	 * Una categoria e' costituita da nome, descrizione, titolo, numero partecipanti, data termine iscrizione,
	 * luogo, ora, durata, quota individuale di partecipazione, compreso nella quota, data finale, ora finale,
	 * note.
	 *
	 * @param _nome nome della categoria
	 * @param _descrizione descrizione della categoria
	 *
	 * @author Gabriele Manenti
	 */
	public Categoria(String _nome, String _descrizione){
		nome=_nome;
		descrizione= _descrizione;
	}

	/*Getters*/
	/**
	 * Ritorna il nome della Categoria
	 * @return nome della categoria
	 *
	 * @author Gabriele Manenti
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Ritorna la descrizione della Categoria
	 * @return descrizione del campo
	 *
	 * @author Gabriele Manenti
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * Ritorna il titolo dell'evento
	 * @return titolo dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getTitolo() {
		return titolo;
	}
	/**
	 * Ritorna il numero dei partecipanti
	 * @return numero dei partecipanti
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getnPartecipanti() {
		return nPartecipanti;
	}
	/**
	 * Ritorna la data di termine iscrizione
	 * @return la data di termine iscrizione
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getTermineIscrizione() {
		return termineIscrizione;
	}
	/**
	 * Ritorna il luogo dell'evento
	 * @return luogo dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getLuogo() {
		return luogo;
	}
	/**
	 * Ritorna l'ora dell'evento
	 * @return ora dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getOra() {
		return ora;
	}
	/**
	 * Ritorna la durata dell'evento
	 * @return durata dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getDurata() {
		return durata;
	}
	/**
	 * Ritorna la quota individuale di partecipazione
	 * @return quota individuale
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getQuotaIndividuale() {
		return quotaIndividuale;
	}
	/**
	 * Ritorna ciò che è compreso nella quota individuale
	 * @return compreso nella quota individuale
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getCompresoQuota() {
		return compresoQuota;
	}
	/**
	 * Ritorna la data di fine dell'evento
	 * @return data finale evento
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getDataFine() {
		return dataFine;
	}
	/**
	 * Ritorna l'ora di fine dell'evento
	 * @return ora finale evento
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getOraFine() {
		return oraFine;
	}
	/**
	 * Ritorna le note dell'evento
	 * @return note aggiuntive circa l'evento
	 *
	 * @author Gabriele Manenti
	 */
	public Campo getNote() {
		return note;
	}

	/*Setters*/
	/**
	 * Metodo che imposta il nome della Categoria
	 * @param nome della categoria
	 *
	 * @author Gabriele Manenti
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo che imposta la descrizione della Categoria
	 * @param descrizione del campo
	 *
	 * @author Gabriele Manenti
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * Metodo che imposta il titolo dell'evento
	 * @param titolo dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setTitolo(Campo titolo) {
		this.titolo = titolo;
	}
	/**
	 * Metodo che imposta il numero di partecipanti
	 * @param nPartecipanti il numero di partecipanti
	 *
	 * @author Gabriele Manenti
	 */
	public void setnPartecipanti(Campo nPartecipanti) {
		this.nPartecipanti = nPartecipanti;
	}
	/**
	 * Metodo che imposta la data di termine iscrizione
	 * @param termineIscrizione  la data di termine iscrizione
	 *
	 * @author Gabriele Manenti
	 */
	public void setTermineIscrizione(Campo termineIscrizione) {
		this.termineIscrizione = termineIscrizione;
	}
	/**
	 * Metodo che imposta il luogo dell'evento
	 * @param luogo luogo dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setLuogo(Campo luogo) {
		this.luogo = luogo;
	}
	/**
	 * Metodo che imposta l'ora dell'evento
	 * @param ora l'ora dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setOra(Campo ora) {
		this.ora = ora;
	}
	/**
	 * Metodo che imposta la durata dell'evento
	 * @param durata la durata dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setDurata(Campo durata) {
		this.durata = durata;
	}
	/**
	 * Metodo che imposta la quota individuale
	 * @param quotaIndividuale la quota individuale di partecipazione per l'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setQuotaIndividuale(Campo quotaIndividuale) {
		this.quotaIndividuale = quotaIndividuale;
	}
	/**
	 * Metodo che imposta il compreso nella quota
	 * @param compresoQuota il compreso nella quota individuale
	 *
	 * @author Gabriele Manenti
	 */
	public void setCompresoQuota(Campo compresoQuota) {
		this.compresoQuota = compresoQuota;
	}
	/**
	 * Metodo che imposta la data di fine dell'evento
	 * @param dataFine la data di fine dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setDataFine(Campo dataFine) {
		this.dataFine = dataFine;
	}
	/**
	 * Metodo che imposta l'ora di fine dell'evento
	 * @param oraFine l'ora di fine dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setOraFine(Campo oraFine) {
		this.oraFine = oraFine;
	}
	/**
	 * Metodo che imposta le note dell'evento
	 * @param note le note dell'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void setNote(Campo note) {
		this.note = note;
	}

	/*Metodi*/
	/**
	 * Crea array con tutti i campi relativi all'evento
	 *
	 * @author Gabriele Manenti
	 */
	public void visualizzaCampi(){
		System.out.println(titolo.visualizzaCampo());
		System.out.println(nPartecipanti.visualizzaCampo());
		System.out.println(termineIscrizione.visualizzaCampo());
		System.out.println(luogo.visualizzaCampo());
		System.out.println(ora.visualizzaCampo());
		System.out.println(durata.visualizzaCampo());
		System.out.println(quotaIndividuale.visualizzaCampo());
		System.out.println(compresoQuota.visualizzaCampo());
		System.out.println(dataFine.visualizzaCampo());
		System.out.println(oraFine.visualizzaCampo());
		System.out.println(note.visualizzaCampo());
	}



}
