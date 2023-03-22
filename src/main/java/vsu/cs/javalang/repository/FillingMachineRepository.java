package vsu.cs.javalang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.cs.javalang.entity.FillingMachine;

@Repository
public interface FillingMachineRepository extends JpaRepository<FillingMachine, Integer> {
}
