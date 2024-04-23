package sit.or3.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.or3.demo.entities.Todo;
import sit.or3.demo.repositories.TodoRepository;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/get-todo")
    public List<Todo> getAllTodo(){
        return todoRepository.findAll();
    }

}
