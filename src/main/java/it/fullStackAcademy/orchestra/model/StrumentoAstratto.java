package it.fullStackAcademy.orchestra.model;

public abstract class StrumentoAstratto implements StrumentoMusicale {
	private String nomeStrumento;
	
	protected StrumentoAstratto(String nomeStrumento) {
		this.nomeStrumento = nomeStrumento;
	}

	@Override
	public void suonaStrumento() {
		System.out.println("Suonando: " + nomeStrumento);
	}

}
