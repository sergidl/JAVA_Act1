public class Revista extends Fitxa{
	private short any, nro;

	public Revista(String referencia, String titol, int any, int nro) {
		super(referencia, titol);
		this.setAny(any);
		this.setNro(nro);
	}

	public void setAny(int any) {
		this.any = (short)any;
	}
	public int getAny() {
		return any;
	}

	public void setNro(int nro) {
		this.nro = (short)nro;
	}
	public int getNro() {
		return nro;
	}

	@Override
	public String visualtizar() {
		return "Referencia: " + this.getReferencia()+"\nTitol: " + this.getTitol()+"\nAny: " +
		this.getAny()+"\nNúmero de volum: " + this.getNro();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
