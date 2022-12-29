package Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;

import com.example.crud.TodoStatus;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

import java.sql.Timestamp;
import jakarta.persistence.Entity;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Todo {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    Long id;
    @Column
    String title;
    @Column
    String description;
    @Column
    TodoStatus todoStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public TodoStatus getTodoStatus() {
		return todoStatus;
	}
	public void setTodoStatus(TodoStatus todoStatus) {
		this.todoStatus = todoStatus;
	}

    public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Timestamp getLastModified() {
		return lastModified;
	}
	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	@CreationTimestamp
    @Column(updatable = false)
    Timestamp dateCreated;
    @UpdateTimestamp
    Timestamp lastModified;

}