package SpringRestApi.SpringRestApi.model;

import javax.persistence.*;


/**
 * Entity class to create data about subjects in group with teacher in dataBase
 *
 * @author Yaroslav Makhnov
 */
@Entity
@Table(name = "subjects_group")
public class SubjectGroupTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "SubjectGroupTeacher{" +
                "id=" + id +
                ", group=" + group +
                ", subject=" + subject +
                ", teacher=" + teacher +
                '}';
    }
}