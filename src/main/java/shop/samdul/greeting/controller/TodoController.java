package shop.samdul.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.samdul.greeting.service.TodoService;
import shop.samdul.greeting.entity.TodoEntity;
import java.util.List;

@RestController //HTTP 요청 처리, json 형식 응답반환
public class TodoController{
    @Autowired //TodoService 인스턴스를 자동으로 주입
    TodoService todoService;

    @GetMapping("/list")
    public List<TodoEntity> list() { //TodoEntity 객체를 포함한 리스트, 클라이언트에게 json형식으로 반환
        System.out.println("[Controller]");
        List<TodoEntity> r = todoService.getTodos(); //모든할일항목 조회
        return r;
    }
   
    
    @GetMapping("/todos/{id}")
    public TodoEntity find(@PathVariable Integer id) { // url 경로의 id값을 메서드의 매개변수로 매핑
        TodoEntity r = todoService.findById(id);
        return r;
    }



}


