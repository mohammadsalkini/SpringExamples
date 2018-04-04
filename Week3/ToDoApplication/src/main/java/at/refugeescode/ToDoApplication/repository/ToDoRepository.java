package at.refugeescode.ToDoApplication.repository;

import at.refugeescode.ToDoApplication.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

}
