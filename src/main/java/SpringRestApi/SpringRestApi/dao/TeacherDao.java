package SpringRestApi.SpringRestApi.dao;

import SpringRestApi.SpringRestApi.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Uses methods from JpaRepository to works with table teachers
 *
 * @author Yaroslav Makhnov
 */
@Repository
public interface TeacherDao extends JpaRepository<Teacher, Long> {
}
