package SpringRestApi.SpringRestApi.dao;

import SpringRestApi.SpringRestApi.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Uses methods from JpaRepository to works with table subjects
 *
 * @author Yaroslav Makhnov
 */
@Repository
public interface SubjectDao extends JpaRepository<Subject, Long> {
}
