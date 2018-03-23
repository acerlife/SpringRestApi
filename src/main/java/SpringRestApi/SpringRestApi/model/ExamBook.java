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
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private final Student student;

    @ManyToOne
    @JoinColumn(name = "subjects_group_id")
    private final SubjectGroupTeacher subjectsGroupTeacher;

    private final int mark;

    public ExamBook(Student student, SubjectGroupTeacher subjectGroupTeacher, int mark){
        this.student = student;
        this.subjectsGroupTeacher = subjectGroupTeacher;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public SubjectGroupTeacher getSubjectsGroup() {
        return subjectsGroupTeacher;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "ExamBook{" +
                "id=" + id +
                ", student=" + student +
                ", subjectsGroup=" + subjectsGroupTeacher +
                ", mark=" + mark +
                '}';
    }
}
