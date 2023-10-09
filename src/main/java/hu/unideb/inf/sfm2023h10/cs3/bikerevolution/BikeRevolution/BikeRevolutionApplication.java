package hu.unideb.inf.sfm2023h10.cs3.bikerevolution.BikeRevolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BikeRevolutionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BikeRevolutionApplication.class, args);
	}

	@Autowired
	PartsRepo partsRepo;
	@Override
	public void run(String... args) throws Exception{
		Parts h=new Parts();
		h.setBelso(26);
		h.setTorzsvendeg("Bela");

		partsRepo.save(h);
	}

}
