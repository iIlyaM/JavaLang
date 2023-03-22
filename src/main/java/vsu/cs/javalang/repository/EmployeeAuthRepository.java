package vsu.cs.javalang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.cs.javalang.entity.EmployeeAuth;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeAuthRepository extends JpaRepository<EmployeeAuth, Integer> {
    @Override
    List<EmployeeAuth> findAll();

    Optional<EmployeeAuth> findById(Integer id);
}
