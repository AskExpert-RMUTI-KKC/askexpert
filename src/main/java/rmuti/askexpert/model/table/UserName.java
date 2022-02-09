package rmuti.askexpert.model.table;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user_name")
public class UserName {
    @Id
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "uuid2")
    @Column(length = 36,nullable = false,updatable = false)
    private String userId;

    @Column (name = "e_mail", unique = true,nullable = false)
    private String email;

    @Column(name = "user_name",nullable = false)
    private String userName;

    @Column (name = "pass_word",nullable = false)
    private String passWord;

    @Column(name = "first_name"/*,nullable = false*/)
    private String firstName;

    @Column(name = "last_name"/*,nullable = false*/)
    private String lastName;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column (name = "join_date"/*,nullable = false*/)
    private Date joinDate;

    //@Column(length = 100)
    /*,nullable = false*/

    @Column (name = "profile_pic")
    private String profilePic;
}
