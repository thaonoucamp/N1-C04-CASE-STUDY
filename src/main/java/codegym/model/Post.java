package codegym.model;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String fileUpload;
    private String status;
    private LocalDate dateTime;

    @ManyToOne
    private User user;

    @OneToMany
    private List<Like> likes;

    @OneToMany
    private List<FileUpload> filePath;

    @OneToMany
    private List<Comment> comments;

    public Post() {
    }

    public Post(Long id, String title, String content, String fileUpload, String status, LocalDate dateTime, User user, List<Like> likes, List<FileUpload> filePath, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.fileUpload = fileUpload;
        this.status = status;
        this.dateTime = dateTime;
        this.user = user;
        this.likes = likes;
        this.filePath = filePath;
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

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
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

    public String getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(String fileUpload) {
        this.fileUpload = fileUpload;
    }

    public List<FileUpload> getFilePath() {
        return filePath;
    }

    public void setFilePath(List<FileUpload> filePath) {
        this.filePath = filePath;
    }
}
