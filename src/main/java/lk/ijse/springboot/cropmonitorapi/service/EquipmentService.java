package lk.ijse.springboot.cropmonitorapi.service;

import jakarta.validation.Valid;
import lk.ijse.springboot.cropmonitorapi.dto.EquipmentDTO;
import lk.ijse.springboot.cropmonitorapi.response.EquipmentResponse;

import java.util.List;

public interface EquipmentService {
    void saveEquipment(@Valid EquipmentDTO equipment);
    void deleteEquipment(String equipmentId);
    void updateEquipment(String equipmentId, @Valid EquipmentDTO equipment);
    EquipmentResponse getSelectedEquipment(String equipmentId);
    List<EquipmentDTO> getAllEquipments();
}
