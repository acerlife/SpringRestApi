package SpringRestApi.SpringRestApi.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;


/**
 * Entity class to create data about teachers in dataBase
 *
 * @author Yaroslav Makhnov
 */
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private final String firstName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "teacher")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<SubjectGroupTeacher> subjectsGroupList;

    public Teacher(String firstName){
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<SubjectGroupTeacher> getSubjectsGroupList() {
        return subjectsGroupList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
