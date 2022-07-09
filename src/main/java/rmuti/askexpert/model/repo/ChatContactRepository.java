package rmuti.askexpert.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import rmuti.askexpert.model.table.ChatContactData;
import rmuti.askexpert.model.table.CommentData;

import java.util.List;
import java.util.Optional;

public interface ChatContactRepository extends JpaRepository<ChatContactData, String> {
    Optional<ChatContactData> findByChatTxAndChatRx(String chatTx,String chatRx);
    List<ChatContactData> findByChatTx(String chatTx);


    List<ChatContactData> findByChatTxOrChatRx(String chatTx,String chatRx);
}
