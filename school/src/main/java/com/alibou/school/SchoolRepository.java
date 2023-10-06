package com.alibou.school;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School,Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
