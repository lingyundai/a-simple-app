package com.asimpleapp.asimpleapp.mapper;

import com.asimpleapp.asimpleapp.dto.TodoDto;
import com.asimpleapp.asimpleapp.entity.Todo;

public class TodoMapper {
    public static TodoDto mapToTodoDto(Todo todo) {
        return new TodoDto(
            todo.getId(),
                todo.isCompleted(),
                todo.getDescription()
        );
    }

    public static Todo mapToTodo(TodoDto todoDto) {
        return new Todo(
                todoDto.getId(),
                todoDto.isCompleted(),
                todoDto.getDescription()
        );
    }
}
