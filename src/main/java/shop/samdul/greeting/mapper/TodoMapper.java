package shop.samdul.greeting.mapper;
import java.util.List;
import shop.samdul.greeting.entity.TodoEntity;
import java.util.List;

public interface TodoMapper {
    List<TodoEntity> findAll();
    
}
