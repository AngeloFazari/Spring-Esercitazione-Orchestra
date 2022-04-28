package it.fullStackAcademy.orchestra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.fullStackAcademy.orchestra.service.OrchestraService;

	@Component
	public class MyApplicationRunner implements CommandLineRunner {
		
		@Autowired
		private ApplicationContext context;
		
		@Override
		public void run(String... args) throws Exception {

			OrchestraService orchestra = context.getBean(OrchestraService.class);
			orchestra.suonaOrchestra();

		}
		
	}

