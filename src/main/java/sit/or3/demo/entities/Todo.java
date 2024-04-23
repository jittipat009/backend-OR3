package sit.or3.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.catalina.User;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "todos_table")
public class Todo {

    @Id
    @Column(name="taskId")
    private Integer taskId;

    @Column(name="taskTitle",nullable = false)
    private String title;

    @Column(name = "taskDescription")
    private String description;

    @Column(name = "taskAssignees")
    private String assignees;

    @Column(name = "taskStatus")
    @Enumerated(EnumType.STRING)
    private TodoStatus status;

    @Column(name = "createdOn", nullable = false)
    private LocalDateTime createdOn = LocalDateTime.now();

    @Column(name = "updatedOn")
    private LocalDateTime updatedOn;



    public enum TodoStatus {
        TODO,
        IN_PROGRESS,
        DONE
    }
}
