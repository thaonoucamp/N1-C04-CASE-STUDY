package codegym.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String status;
    private Date dateTime;

    @OneToOne
    private User user;

    @OneToMany
    private List<Like> likes;

    @OneToMany
    private List<Comment> comments;

    public Post() {
    }

    public Post(Long id, String title, String content, String status, Date dateTime, User user, List<Like> likes, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.status = status;
        this.dateTime = dateTime;
        this.user = user;
        this.likes = likes;
        this.comments = comments;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
