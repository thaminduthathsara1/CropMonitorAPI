package lk.ijse.springboot.cropmonitorapi.service;

import lk.ijse.springboot.cropmonitorapi.dto.MonitoringLogDTO;
import lk.ijse.springboot.cropmonitorapi.response.MonitoringLogResponse;

import java.util.List;

public interface MonitoringLogService {
    void saveMonitoringLog(MonitoringLogDTO monitoringLogDTO);
    void deleteMonitoringLog(String logCode);
    void updateMonitoringLog(String logCode, MonitoringLogDTO monitoringLogDTO);
    MonitoringLogResponse getSelectedMonitoringLog(String logCode);
    List<MonitoringLogDTO> getAllMonitoringLogs();
}
