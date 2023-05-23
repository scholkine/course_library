package ua.com.shop_course_371.shop_course_371.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "product_has_order")
public class ProductHasOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order orderss;
    private int quantity;
}
