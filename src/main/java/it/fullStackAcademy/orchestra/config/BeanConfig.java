package it.fullStackAcademy.orchestra.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.fullStackAcademy.orchestra.model.Chitarra;
import it.fullStackAcademy.orchestra.model.Sassofono;
import it.fullStackAcademy.orchestra.model.StrumentoMusicale;
import it.fullStackAcademy.orchestra.model.Tromba;
import it.fullStackAcademy.orchestra.model.Violino;

@Configuration
public class BeanConfig {
	
	@Bean
	public List<StrumentoMusicale> strumenti() {
		return new ArrayList<StrumentoMusicale>();

	}
	
	@Bean
	public StrumentoMusicale chitarra () {
		return new Chitarra("chitarra");
	}
	
	@Bean
	public StrumentoMusicale tromba () {
		return new Tromba("tromba");
	}
	
	@Bean
	public StrumentoMusicale violino () {
		return new Violino("violno");
	}
	
	@Bean
	public StrumentoMusicale sassofono () {
		return new Sassofono("sassofono");
	}
}
