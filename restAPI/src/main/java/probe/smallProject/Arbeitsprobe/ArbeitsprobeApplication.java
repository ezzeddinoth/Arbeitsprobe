package probe.smallProject.Arbeitsprobe;





import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan({"probe.smallProject"})
@EntityScan("probe.smallProject.Model")


@EnableJpaRepositories("probe.smallProject.repository")
@SpringBootApplication()
public class ArbeitsprobeApplication {

  public static void main(String[] args) {
    SpringApplication.run(ArbeitsprobeApplication.class, args);
  }
}
