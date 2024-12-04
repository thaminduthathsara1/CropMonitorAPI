package lk.ijse.springboot.cropmonitorapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lk.ijse.springboot.cropmonitorapi.response.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO implements SuperDTO, UserResponse {
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String role;
}
