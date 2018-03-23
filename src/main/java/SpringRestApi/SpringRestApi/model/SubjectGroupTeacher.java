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
    private final Group group;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private final Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private final Teacher teacher;

    public SubjectGroupTeacher(Group group, Subject subject, Teacher teacher) {
        this.group = group;
        this.subject = subject;
        this.teacher = teacher;
    }

    public long getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
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
