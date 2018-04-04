package at.refugeescode.ToDoApplication.initialise;

import at.refugeescode.ToDoApplication.model.ToDo;
import at.refugeescode.ToDoApplication.repository.ToDoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class ToDoInitialiser {

    @Bean
    ApplicationRunner applicationRunner(ToDoRepository toDoRepository) {
        return args -> {
            toDoRepository.deleteAll();
            List<ToDo> toDoTask = createToDoTask();
            toDoRepository.saveAll(toDoTask);
        };
    }

    private List<ToDo> createToDoTask() {
        return Stream.of(
                new ToDo("Pset1"),
                new ToDo("Pset2"),
                new ToDo("Pset3"),
                new ToDo("Pset4")
        ).collect(Collectors.toList());
    }
}
