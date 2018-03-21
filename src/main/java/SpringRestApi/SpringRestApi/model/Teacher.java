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
    private Long id;

    private String firstName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "teacher")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<SubjectGroupTeacher> subjectsGroupList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<SubjectGroupTeacher> getSubjectsGroupList() {
        return subjectsGroupList;
    }

    public void setSubjectsGroupList(List<SubjectGroupTeacher> subjectsGroupList) {
        this.subjectsGroupList = subjectsGroupList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
