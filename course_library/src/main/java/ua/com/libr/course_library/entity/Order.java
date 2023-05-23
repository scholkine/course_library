package ua.com.shop_course_371.shop_course_371.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date creationDate;
    private String delivery;
    private boolean orderStatus;
    @ManyToOne
    @JoinColumn(name = "clients_id")
    private Client client;
    @OneToMany(mappedBy = "orderss")
    private List<ProductHasOrder> orderList;
}
