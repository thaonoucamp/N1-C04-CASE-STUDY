package codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Relationship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;

    @OneToOne
    private User myUser;

    @OneToOne
    private User friend;

    public Relationship() {
    }

    public Relationship(Long id, String name, User myUser, User friend) {
        Id = id;
        this.name = name;
        this.myUser = myUser;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public User getMyUser() {
        return myUser;
    }

    public void setMyUser(User myUser) {
        this.myUser = myUser;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }
}
