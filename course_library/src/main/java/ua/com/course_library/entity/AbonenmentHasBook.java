package ua.com.course_library.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "abonenment_has_book")
public class AbonenmentHasBook {
    @Id
    @ManyToOne
    @JoinColumn(name = "abonenment_id")
    private Abonenment abonenment;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
