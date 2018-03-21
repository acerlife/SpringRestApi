package SpringRestApi.SpringRestApi.model;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;


/**
 * Entity class to create data about subjects in dataBase
 *
 * @author Yaroslav Makhnov
 */
@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subjectName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "subject")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<SubjectGroupTeacher> subjectsGroupList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<SubjectGroupTeacher> getSubjectsGroupList() {
        return subjectsGroupList;
    }

    public void setSubjectsGroupList(List<SubjectGroupTeacher> subjectsGroupList) {
        this.subjectsGroupList = subjectsGroupList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
