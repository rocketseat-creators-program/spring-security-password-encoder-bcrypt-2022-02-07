package com.rocketseat.experts.club.passwordencoderbcrypt.repository;

import com.rocketseat.experts.club.passwordencoderbcrypt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}