package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Model.Todo;
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
