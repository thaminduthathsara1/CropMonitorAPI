package lk.ijse.springboot.cropmonitorapi.Repository;

import lk.ijse.springboot.cropmonitorapi.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field, String> {
}
