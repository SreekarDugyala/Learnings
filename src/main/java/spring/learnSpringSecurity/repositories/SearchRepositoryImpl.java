package spring.learnSpringSecurity.repositories;

import org.springframework.stereotype.Component;
import spring.learnSpringSecurity.models.Job;

import java.util.ArrayList;
import java.util.List;
@Component
public class SearchRepositoryImpl implements SearchRepository{
    @Override
    public List<Job> findByText(String key) {
        List<Job> jobs = new ArrayList<>();
        //Aggregate function to enable atlas search feature.
        return jobs;
    }
}
