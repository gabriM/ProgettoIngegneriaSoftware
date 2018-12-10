import java.util.ArrayList;

import fp.unibs.it.Brano;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyTime;

public class Categoria {
	private String nomeCategoria;
	private String descrizioneCategoria;
	
	//Attributi
	private ArrayLst<Campo> elencoCampi;
	private 
	
	
	//Costruttori
	public Categoria(String nomeCategoria, String descrizioneCategoria){
		this.nomeCategoria=nomeCategoria;
		this.descrizioneCategoria=descrizioneCategoria;
	}

	public Categoria(String nomeCategoria, String descrizioneCategoria, ArrayList<Campo> elencoCampi){
		this.nomeCategoria=nomeCategoria;
		this.descrizioneCategoria=descrizioneCategoria;
		this.elencoCampi = new ArrayList<Campo>();
		this.elencoCampi = elencoCampi;
	}
	
	//Metodi
	
	public void inserisciCampo(){
		nome = InputDati.leggiStringaNonVuota(MESS_NOME);
		cognome = InputDati.leggiStringaNonVuota(MESS_COGN);
		indirizzo = InputDati.leggiStringaNonVuota(MESS_INDIRIZZO);
		telefono = InputDati.leggiStringaNonVuota(MESS_TELEFONO);
		dataNascita = MyTime.creaData(InputDati.leggiStringaNonVuota(MESS_DNASC));
		luogoNascita = InputDati.leggiStringaNonVuota(MESS_LNASC);
		
		this.setNome(nome);
		this.setCognome(cognome);
		this.setIndirizzo(indirizzo);
		this.setTelefono(telefono);
		this.setDataNascita(dataNascita);
		this.setLuogoNascita(luogoNascita);
		
	}

}
