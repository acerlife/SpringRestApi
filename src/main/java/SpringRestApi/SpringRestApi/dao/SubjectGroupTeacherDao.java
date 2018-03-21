package SpringRestApi.SpringRestApi.dao;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.SubjectGroupTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Uses methods from JpaRepository to works with table subject-group-teacher
 *
 * @author Yaroslav Makhnov
 */
@Repository
public interface SubjectGroupTeacherDao extends JpaRepository<SubjectGroupTeacher, Long> {
    List<SubjectGroupTeacher> findByGroup(Group group);
}
