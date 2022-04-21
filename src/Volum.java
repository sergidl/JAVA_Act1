public class Volum extends Obra{
	private short nro;


	public Volum(String referencia, String titol, String autor, int nrePags, int nro) {
		super(referencia, titol, autor, nrePags);
		this.setNro(nro);
	}
	


	public void setNro(int nro) {
		this.nro = (short)nro;
	}
	public int getNro() {
		return nro;
	}
	

	@Override
	public String visualtizar() {
		System.out.println("Referencia: " + this.getReferencia()+"\nTitol: " + this.getTitol()+"\nAutor: " +
		this.getAutor()+"\nNúmero de pàgines: " + this.getNrePags()+"\nNúmero de volum: " + this.getNro());
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
