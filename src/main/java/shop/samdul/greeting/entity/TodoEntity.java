
package shop.samdul.greeting.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TodoEntity<completed> {
    private Integer id;
    private String subject;
    private String body;
    private Boolean completed;
}

