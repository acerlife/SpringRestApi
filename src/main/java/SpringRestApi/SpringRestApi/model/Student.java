package SpringRestApi.SpringRestApi.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Entity class to create data about students in dataBase
 *
 * @author Yaroslav Makhnov
 */
@Entity
@Table(name = "students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private final String firstName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "student")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ExamBook> examBooks;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private final Group group;

    public Student(String firstName, Group group){
        this.firstName = firstName;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<ExamBook> getExamBooks() {
        return examBooks;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
