abstract class Obra extends Fitxa{
	private String autor;
	private short nrePags;

	public Obra(String referencia, String titol, String autor, int nrePags) {
		super(referencia, titol);
		this.setAutor(autor);
		this.setNrePags(nrePags);
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}

	public void setNrePags(int nrePags) {
		this.nrePags = (short)nrePags;
	}
	public short getNrePags() {
		return nrePags;
	}

}
