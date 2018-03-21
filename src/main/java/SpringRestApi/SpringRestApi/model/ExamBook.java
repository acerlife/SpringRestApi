package SpringRestApi.SpringRestApi.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Entity class to create data about exam-books in dataBase
 *
 * @author Yaroslav Makhnov
 */
@Entity
@Table(name = "exam_books")
public class ExamBook implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subjects_group_id")
    private SubjectGroupTeacher subjectsGroup;

    private int mark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SubjectGroupTeacher getSubjectsGroup() {
        return subjectsGroup;
    }

    public void setSubjectsGroup(SubjectGroupTeacher subjectsGroup) {
        this.subjectsGroup = subjectsGroup;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ExamBook{" +
                "id=" + id +
                ", student=" + student +
                ", subjectsGroup=" + subjectsGroup +
                ", mark=" + mark +
                '}';
    }
}
