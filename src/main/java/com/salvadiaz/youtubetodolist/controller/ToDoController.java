package com.salvadiaz.youtubetodolist.controller;

import com.salvadiaz.youtubetodolist.model.ToDoItem;
import com.salvadiaz.youtubetodolist.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private ToDoRepo toDoRepo;

    @GetMapping
    public List<ToDoItem> findAll(){
        return toDoRepo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<ToDoItem> findById(@PathVariable Long id){
        return toDoRepo.findById(id);
    }

    @PostMapping
    public ToDoItem save(@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @PutMapping
    public ToDoItem update(@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        toDoRepo.deleteById(id);
    }
}
