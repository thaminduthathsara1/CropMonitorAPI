package lk.ijse.springboot.cropmonitorapi.Repository;

import lk.ijse.springboot.cropmonitorapi.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
}
