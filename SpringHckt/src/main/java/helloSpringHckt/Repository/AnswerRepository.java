package helloSpringHckt.Repository;

import helloSpringHckt.Domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
