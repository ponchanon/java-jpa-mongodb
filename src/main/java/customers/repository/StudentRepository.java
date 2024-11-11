package customers.repository;

import java.util.List;

import customers.domain.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{
    Student findByName(String name);
    Student findByPhone(String phone);
    List<Student> findByNameOrPhone(String name, String phone);

    @Query("{}")
    List<Student>  findStudentAll();

    @Query("{name : ?0}")
    List<Student>  findStudentWithName(String name);

    @Query("{phone : ?0}")
    Student findStudentWithPhone(String phone);

    @Query("{'address.city' : ?0}")
    List<Student>  findStudentWithCity(String city);
}
