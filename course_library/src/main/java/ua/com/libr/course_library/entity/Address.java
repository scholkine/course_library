package ua.com.shop_course_371.shop_course_371.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String town;
    private String house;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientss;
}
