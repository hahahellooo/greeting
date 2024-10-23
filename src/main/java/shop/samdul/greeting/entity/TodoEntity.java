
package shop.samdul.greeting.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter //getId(), getSubject()등 필드에 대한 메서드 자동생성
@Getter
@ToString
public class TodoEntity {
    private Integer id;
    private String subject;
    private String body;
    private Boolean completed;
}
