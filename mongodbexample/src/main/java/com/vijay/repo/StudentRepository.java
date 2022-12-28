package com.vijay.repo;

import com.vijay.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer>
{

}
