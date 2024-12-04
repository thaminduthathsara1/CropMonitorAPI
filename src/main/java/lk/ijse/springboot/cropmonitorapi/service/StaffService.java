package lk.ijse.springboot.cropmonitorapi.service;

import lk.ijse.springboot.cropmonitorapi.dto.StaffDTO;
import lk.ijse.springboot.cropmonitorapi.response.StaffResponse;

import java.util.List;

public interface StaffService {
    void saveStaff(StaffDTO staffDTO) throws Exception;
    void deleteStaff(String staffId);
    void updateStaff(String staffId, StaffDTO staff);
    StaffResponse getSelectedStaff(String staffId);
    List<StaffDTO> getAllStaff();
}
