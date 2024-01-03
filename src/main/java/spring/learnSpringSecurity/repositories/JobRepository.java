package spring.learnSpringSecurity.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.learnSpringSecurity.models.Job;

public interface JobRepository extends MongoRepository <Job,String> {

}
