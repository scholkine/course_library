package ua.com.course_library.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @OneToOne
    @MapKey
    @MapsId
    @JoinColumn(name = "reader_id")
    private Reader reader;
    private String firstName;
    private String lastName;
    private int age;
    private int phone;
    private String email;
    private Date activeUntil;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER )
    private Set<Role> roles;
}
