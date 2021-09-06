package codegym.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthday;

    @OneToMany
    private List<FileUpload> avatar;
    private String telephone;
    private String address;
    private String email;
    private String password;
    private String userName;

    @ManyToMany
    private List<User> friends;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    public User() {
    }

    public User(Long id, String name, String gender, LocalDate birthday, List<FileUpload> avatar, String telephone, String address, String email, String password, String userName, List<User> friends, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.avatar = avatar;
        this.telephone = telephone;
        this.address = address;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.friends = friends;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<FileUpload> getAvatar() {
        return avatar;
    }

    public void setAvatar(List<FileUpload> avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }
}
