package SpringRestApi.SpringRestApi.dao;

import SpringRestApi.SpringRestApi.model.ExamBook;
import SpringRestApi.SpringRestApi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Uses methods from JpaRepository to works with table exam-books
 *
 * @author Yaroslav Makhnov
 */
@Repository
public interface ExamBookDao extends JpaRepository<ExamBook, Long> {
    List<ExamBook> findAllByStudent(Student studentId);
}
