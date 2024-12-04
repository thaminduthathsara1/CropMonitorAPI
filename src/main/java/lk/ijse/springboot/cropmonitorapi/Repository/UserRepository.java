package lk.ijse.springboot.cropmonitorapi.Repository;

import lk.ijse.springboot.cropmonitorapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
