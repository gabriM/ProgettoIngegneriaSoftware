import MyLib.Utility;

public class Evento {
	
	//Attributi
	private Categoria categoria;
	private Boolean validit�= false;
	private String creatore;
	
	
	//Costruttori
	public Evento(Categoria _categoria, String _creatore){
		categoria= _categoria;
		creatore=_creatore;
	}
	
	
	
	//Metodi
	
	
	//Metodo che verifica che tutti i campi obbligatori abbiano inserito un valore
	public void isValido(){
		validit�=true;
		
		for (int i=0; i<categoria.getElencoCampi().size(); i++){
			if(categoria.getElencoCampi().get(i).getObbligatorio()&& !categoria.getElencoCampi().get(i).getValore().getInserito()){
				validit�=false;
			}
		}
		
	}
	
	
	// Metodo che permette di inserire i valori a campi dell'evento
	public void inserisciDettagliEvento()throws Exception{
		categoria.inserisciCampi();
	}



	
	// Getters and Setters generati automaticamente
	public Categoria getCategoria() {
		return categoria;
	}



	public Boolean getValidit�() {
		return validit�;
	}



	public String getCreatore() {
		return creatore;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	public void setValidit�(Boolean validit�) {
		this.validit� = validit�;
	}



	public void setCreatore(String creatore) {
		this.creatore = creatore;
	}
	
	
	
	

}
