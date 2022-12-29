package Service;

import java.util.List;

import Model.Todo;

public interface TodoService {
	List<Todo> getTodos();
	Todo getTodoById(Long id);
	Todo insert(Todo todo);
	void updateTodo(Long id,Todo todo);
	void deleteTodo(Long todoId);
}
