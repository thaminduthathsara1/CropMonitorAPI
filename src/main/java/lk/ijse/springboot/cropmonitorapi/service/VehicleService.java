package lk.ijse.springboot.cropmonitorapi.service;

import lk.ijse.springboot.cropmonitorapi.dto.VehicleDTO;
import lk.ijse.springboot.cropmonitorapi.response.VehicleResponse;

import java.util.List;

public interface VehicleService {
    void saveVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String vehicleCode);
    void updateVehicle(String vehicleCode, VehicleDTO vehicle);
    VehicleResponse getSelectedVehicle(String vehicleCode);
    List<VehicleDTO> getAllVehicles();
}
