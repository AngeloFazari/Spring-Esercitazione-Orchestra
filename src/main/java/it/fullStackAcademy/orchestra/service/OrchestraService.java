package it.fullStackAcademy.orchestra.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.fullStackAcademy.orchestra.model.Musicista;
import it.fullStackAcademy.orchestra.model.StrumentoMusicale;

@Component
public class OrchestraService {

	@Autowired
	private List<StrumentoMusicale> strumentiMusicali;

	@Autowired 
	private ApplicationContext context;
	
	public void suonaOrchestra() {
		List<Musicista> musicisti = new ArrayList<>();
		Musicista m ;
		for (StrumentoMusicale sm : strumentiMusicali) {
			m = context.getBean(Musicista.class);
			m.setStrumentoMusicale(sm);
			musicisti.add(m);
			
		}
			for(Musicista musicista : musicisti ) {
				musicista.suona();
				
				
			}
	}
}
