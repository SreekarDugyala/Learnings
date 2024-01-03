package spring.learnSpringSecurity.repositories;

import spring.learnSpringSecurity.models.Job;

import java.util.List;


public interface SearchRepository {
    List<Job> findByText(String key);
}
