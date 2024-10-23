package shop.samdul.greeting.entity;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Entity
@Table(name = "todo_jpa")
@Setter
@Getter
@ToString
public class TodoJpaEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(nullable = false)
   private String subject;
   @Column(nullable = false)
   private String body;
   private Boolean completed;
}
