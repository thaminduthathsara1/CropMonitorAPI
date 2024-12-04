package lk.ijse.springboot.cropmonitorapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lk.ijse.springboot.cropmonitorapi.response.VehicleResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO implements SuperDTO, VehicleResponse {
    private String vehicleCode;
    @NotBlank
    private String licensePlateNumber;
    @NotBlank
    private String vehicleCategory;
    @NotBlank
    private String fuelType;
    @NotBlank
    @Pattern(regexp = "^(available|out of service)$")
    private String status;
    @NotBlank
    @Pattern(regexp = "^(?!\\s*$).+|N/A")
    private String remarks;
    private String staffId;
}
