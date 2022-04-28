package it.fullStackAcademy.orchestra.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Musicista {
	private StrumentoMusicale strumentoMusicale;

	public Musicista() {

	}

	public void suona() {
		strumentoMusicale.suonaStrumento();
	}

	public StrumentoMusicale getStrumentoMusicale() {
		return strumentoMusicale;
	}

	public void setStrumentoMusicale(StrumentoMusicale strumentoMusicale) {
		this.strumentoMusicale = strumentoMusicale;
	}
}
