package ua.com.shop_course_371.shop_course_371.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    @OneToMany(mappedBy = "categories")
    private List<Product> productList;
}
