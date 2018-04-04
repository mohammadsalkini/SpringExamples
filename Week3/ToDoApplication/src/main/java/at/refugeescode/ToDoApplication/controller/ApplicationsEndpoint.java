package at.refugeescode.ToDoApplication.controller;

import at.refugeescode.ToDoApplication.model.ToDo;
import at.refugeescode.ToDoApplication.repository.ToDoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("todos")
public class ApplicationsEndpoint {

    private ToDoRepository toDoRepository;

    public ApplicationsEndpoint(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @GetMapping
    List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    @PostMapping
    void SetToDo(@RequestBody ToDo toDo){
        toDoRepository.save(toDo);
    }

    @GetMapping("/{id}")
    ToDo findOneById(@PathVariable String id) {
        return toDoRepository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}/done")
    ToDo TaskIsDone(@PathVariable String id) {
        Optional<ToDo> byId = toDoRepository.findById(id);
        if (byId.isPresent()) {
            byId.get().setDone(true);
            toDoRepository.save(byId.get());

        }
        return toDoRepository.findById(id).get();
    }
}
