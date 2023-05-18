package ua.com.course_library.entity;

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
@Table(name = "abonenments")
public class Abonenment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;
    private Date dueDate;
    @OneToMany(mappedBy = "abonenment")
    private List<AbonenmentHasBook> bookList;
}
