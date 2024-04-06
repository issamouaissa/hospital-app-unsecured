package ma.enset.patientmvc;

import ma.enset.patientmvc.entities.Patient;
import ma.enset.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatientMvcApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"Issam",new Date(),false,112));
            patientRepository.save(
                    new Patient(null,"Soufiane",new Date(),true,345));
            patientRepository.save(
                    new Patient(null,"Mehdi",new Date(),true,120));
            patientRepository.save(
                    new Patient(null,"Ahmed",new Date(),false,164));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }

}
