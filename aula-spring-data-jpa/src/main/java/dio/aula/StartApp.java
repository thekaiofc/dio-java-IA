package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Kaio");
        user.setUsername("thekaiomvp");
        user.setPassword("dio123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
