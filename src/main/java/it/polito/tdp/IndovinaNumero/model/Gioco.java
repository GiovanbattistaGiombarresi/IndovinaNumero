package it.polito.tdp.IndovinaNumero.model;
public class Gioco{
	
	public enum StatoGioco{
		Vinto,
		Perso,
		TroppoAlto,
		TroppoBasso
	}
	private int TMax;
	private int NMax;
	private int NTentativiFatti;
	private int numeroSegreto;
	/**
	 * @return the tMax
	 */
	public int getTMax() {
		return TMax;
	}
	/**
	 * @param tMax the tMax to set
	 */
	public void setTMax(int tMax) {
		TMax = tMax;
	}
	/**
	 * @return the nMax
	 */
	public int getNMax() {
		return NMax;
	}
	/**
	 * @param nMax the nMax to set
	 */
	public void setNMax(int nMax) {
		NMax = nMax;
	}
	/**
	 * @return the nTentativiFatti
	 */
	public int getNTentativiFatti() {
		return NTentativiFatti;
	}
	/**
	 * @param nTentativiFatti the nTentativiFatti to set
	 */
	public void setNTentativiFatti(int nTentativiFatti) {
		NTentativiFatti = nTentativiFatti;
	}
	/**
	 * @return the numeroSegreto
	 */
	public int getNumeroSegreto() {
		return numeroSegreto;
	}
	/**
	 * @param numeroSegreto the numeroSegreto to set
	 */
	public void setNumeroSegreto(int numeroSegreto) {
		this.numeroSegreto = numeroSegreto;
	}
	
	
	public void IniziaGioco(){
		this.NTentativiFatti = 0;
    	this.numeroSegreto = (int)(Math.random()*this.NMax) + 1;
    /*	try {
    		this.TMax = Integer.parseInt(this.txtTMax.getText());
    	}catch(NumberFormatException e) {
    		this.txtCom.setText("TMax deve eseere un numero!");
    	}
    	
    	try {
    		this.NMax = Integer.parseInt(this.txtNMax.getText());
    	}catch(NumberFormatException e) {
    		this.txtCom.setText("NMax deve eseere un numero!");
    	}*/

	}
	
	
	/**
	 * @return 0 se vinco, 1 se perdo, 2 se numero è alto, 3 se è troppo basso
	 * 
	 * */
	
	public StatoGioco tentativo (int tentativo) {
		this.NTentativiFatti++;
		
	 	//giocare
    	if (tentativo == this.numeroSegreto) {
    		return StatoGioco.Vinto;
    	}
    	
    	if (this.NTentativiFatti == this.TMax) {
    		return StatoGioco.Perso;
    	}
    	
    	if(tentativo>this.numeroSegreto) {
    		return StatoGioco.TroppoAlto;
    	}else  {
    		return StatoGioco.TroppoBasso;
    	}
		
	}
}