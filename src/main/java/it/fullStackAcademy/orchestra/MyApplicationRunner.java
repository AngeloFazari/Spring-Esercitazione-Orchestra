package it.fullStackAcademy.orchestra;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

	@Component
	public class MyApplicationRunner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {

			System.out.println("Sono nel Runner");

		}

	}
