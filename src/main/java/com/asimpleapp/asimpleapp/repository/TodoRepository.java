package com.asimpleapp.asimpleapp.repository;

import com.asimpleapp.asimpleapp.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
