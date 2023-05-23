package ua.com.shop_course_371.shop_course_371.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "attribute_has_product")
public class AttributeHasProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;
    @ManyToOne
    @JoinColumn(name = "productss_id")
    private Product productss;
}
