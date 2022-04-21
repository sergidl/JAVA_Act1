abstract class Fitxa {
	private String referencia, titol;
	public abstract String visualtizar();
	public abstract String toString();

	public Fitxa(String referencia, String titol) {
		this.setReferencia(referencia);
		this.setTitol(titol);
	}
	
	public void setReferencia(String referencia){
		this.referencia=referencia;
	}
	public String getReferencia(){
		return referencia;
	}

	
	public void setTitol(String titol){
		this.titol=titol;
	}
	public String getTitol(){
		return titol;
	}



}