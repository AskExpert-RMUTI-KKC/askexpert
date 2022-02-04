package rmuti.askexpert.model.services;

import org.springframework.data.jpa.repository.JpaRepository;
import rmuti.askexpert.model.table.CommentData;
import rmuti.askexpert.model.table.UserName;

import java.util.List;

public interface UserNameRepository  extends JpaRepository<UserName, Integer> {
    List<CommentData> FindAll();
}
