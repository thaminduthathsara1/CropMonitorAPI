package lk.ijse.springboot.cropmonitorapi.Repository;

import lk.ijse.springboot.cropmonitorapi.entity.MonitoringLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitoringLogRepository extends JpaRepository<MonitoringLog, String> {
}
