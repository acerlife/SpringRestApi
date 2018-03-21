package SpringRestApi.SpringRestApi.dao;

import SpringRestApi.SpringRestApi.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Uses methods from JpaRepository to works with table groups
 *
 * @author Yaroslav Makhnov
 */
@Repository
public interface GroupDao extends JpaRepository<Group, Long> {
}
