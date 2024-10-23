package shop.samdul.greeting.mapper;
import java.util.List;
import shop.samdul.greeting.entity.TodoEntity;


public interface TodoMapper {
    List<TodoEntity> findAll();



    TodoEntity findById(int id);
}
    
// 이 인터페이스는 MyBatis와 같은 프레임워크가 이 인터페이스를 구현할 수 있도록 사용되며, 
// 실제 SQL 쿼리는 MyBatis 설정이나 XML 파일을 통해 정의됩니다.