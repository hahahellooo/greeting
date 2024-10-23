package shop.samdul.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.mapper.TodoMapper;

import java.util.List;

@Service
public class TodoJpaService {
  private final TodoRepository todoRepository;

	@Autowired
  public TodoJpaService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;

  }

	public List<TodoEntity> getAllTodos() {
		return todoRepository.findAll();
	}

  public Optional<TodoEntity> getTodoById(Integer id) {
    return todoRepository.findById(id);
  }

  public TodoEntity createTodo(TodoEntity todoEntity) {
    return todoRepository.save(todoEntity);
  }

  public TodoEntity updateTodoById(Integer id, TodoEntity todoEntity) {
    Optional<TodoEntity> existingTodoOpt = todoRepository.findById(id);

    if (existingTodoOpt.isPresent()) {
      TodoEntity existingTodo = existingTodoOpt.get();
      existingTodo.setSubject(todoEntity.getSubject());
      existingTodo.setBody(todoEntity.getBody());
      existingTodo.setCompleted(todoEntity.getCompleted());
      return todoRepository.save(existingTodo);
    }
  }
}