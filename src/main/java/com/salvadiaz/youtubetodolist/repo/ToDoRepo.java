package com.salvadiaz.youtubetodolist.repo;

import com.salvadiaz.youtubetodolist.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<ToDoItem, Long> {

}
