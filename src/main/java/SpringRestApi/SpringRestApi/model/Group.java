package SpringRestApi.SpringRestApi.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Entity class to create data about groups in dataBase
 *
 * @author Yaroslav Makhnov
 */
@Entity
@Table(name = "groups")
public class Group implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "group")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Student> students;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "group")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<SubjectGroupTeacher> subjectsGroups;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SubjectGroupTeacher> getSubjectsGroups() {
        return subjectsGroups;
    }

    public void setSubjectsGroups(List<SubjectGroupTeacher> subjectsGroups) {
        this.subjectsGroups = subjectsGroups;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return  id + " " + groupName;
    }
}
