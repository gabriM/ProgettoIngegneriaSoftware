/**
 * Classe che definisce un <i>Campo</i>.
 *
 * Un campo possiede le seguenti caratterisitiche:
 * nome;
 * descrizione;
 * obbligatorietà del campo;
 *
 * @author Matteo Gusmini
 *
 * @version 3.0 1 Febbraio 2019
 *
 */
public class Campo {
	
	/*Attributi*/
	private String nome;
	private String descrizione;
	private Boolean obbligatorio;
	
	/*Costruttori*/
	/**
	 * Un campo e' costituito da nome, descrizione, obbligatorietà e valore riguardante una caratteristica di un evento:
	 *
	 * @param _nome nome del campo
	 * @param _descrizione descrizione del campo
	 * @param _obbligatorio obbligatorietà del campo
	 *
	 * @author Matteo Gusmini
	 */
	public Campo(String _nome, String _descrizione, Boolean _obbligatorio){
		nome=_nome;
		descrizione= _descrizione;
		obbligatorio = _obbligatorio;
	}

	/*Getters*/
	/**
	 * Ritorna il nome del Campo
	 * @return nome del campo
	 *
	 * @author Matteo Gusmini
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Ritorna la descrizione del Campo
	 * @return descrizione del campo
	 *
	 * @author Matteo Gusmini
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * Ritorna l'obbligatorietà del Campo
	 * @return se un campo è obbligatorio o meno
	 *
	 * @author Matteo Gusmini
	 */
	public Boolean getObbligatorio() {
		return obbligatorio;
	}
	/*Setters*/
	/**
	 * Metodo che imposta il nome del Campo.
	 *
	 * @param nome il nome del campo
	 *
	 * @author Matteo Gusmini
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo che imposta la descrizione del Campo.
	 *
	 * @param descrizione la descrizione del campo
	 *
	 * @author Matteo Gusmini
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * Metodo che imposta l'obbligatorietà di un Campo.
	 *
	 * @param obbligatorio l'obbligatorietà del campo
	 *
	 * @author Matteo Gusmini
	 */
	public void setObbligatorio(Boolean obbligatorio) {
		this.obbligatorio = obbligatorio;
	}

	/*Metodi*/
	/**
	 * Ritorna una stringa che descrive il campo
	 *
	 * @return info le informazioni relative ad un campo
	 *
	 * @author Matteo Gusmini
	 */
	public String visualizzaCampo(){
		String info= new String("Nome: "+ nome +"\n" +"Descrizione: " + descrizione+ "\n"+ "Obbligatoria: " + obbligatorio +"\n");
		return info;
	}
	


}
