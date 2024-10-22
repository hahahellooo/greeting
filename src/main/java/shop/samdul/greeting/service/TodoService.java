package shop.samdul.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.samdul.greeting.mapper.TodoMapper;
import shop.samdul.greeting.entity.TodoEntity;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoMapper todoMapper;
    public List<TodoEntity> getTodos() {
        System.out.println("[service] fineAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]:"+todos.size());
        return todos;
    }
}
