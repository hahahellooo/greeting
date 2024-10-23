package shop.samdul.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.samdul.greeting.mapper.TodoMapper;
import shop.samdul.greeting.entity.TodoEntity;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoMapper todoMapper; // 데이터베이스와 상호작용하여 데이터를 조회하거나 수정
    public List<TodoEntity> getTodos() {
        System.out.println("[service] fineAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]:"+todos.size());
        return todos;
    }
    public TodoEntity findById(int id) {
        System.out.println("Fetching TodoEntity with id: " + id);
        TodoEntity todo = todoMapper.findById(id);
        return todo;
      }
    }

