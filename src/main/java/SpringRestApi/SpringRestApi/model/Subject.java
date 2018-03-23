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
    private long id;

    private final String subjectName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "subject")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<SubjectGroupTeacher> subjectsGroupList;

    public Subject(String subjectName){
        this.subjectName = subjectName;
    }

    public Long getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public List<SubjectGroupTeacher> getSubjectsGroupList() {
        return subjectsGroupList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
