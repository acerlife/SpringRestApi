package SpringRestApi.SpringRestApi.dao;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


/**
 * Uses methods from JpaRepository to works with table students
 *
 * @author Yaroslav Makhnov
 */
@Repository
public interface StudentDao extends JpaRepository<Student, Long> {
    List<Student> findByGroup(Group group);
}
