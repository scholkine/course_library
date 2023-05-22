package ua.com.course_library.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "fix_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    private String name;
    private String description;
    public String permissions;
    @ManyToMany(mappedBy = "roles")
    private Set<User> userSet;
}
