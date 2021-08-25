package com.adfolks.project1.repository;

import com.adfolks.project1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department,Long> {
    public Department findByDepartmentName(String departmentName);


}
