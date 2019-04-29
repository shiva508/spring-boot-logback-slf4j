package com.logback.repository;

import org.hibernate.boot.spi.JpaOrmXmlPersistenceUnitDefaultAware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logback.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>,StudentCustumRepository {

}
