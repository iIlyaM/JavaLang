package vsu.cs.javalang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.cs.javalang.entity.Fuel;

@Repository
public interface FuelRepository extends JpaRepository<Fuel, Integer> {
}
