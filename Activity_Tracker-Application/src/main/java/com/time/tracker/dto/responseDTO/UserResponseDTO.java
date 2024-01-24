package com.time.tracker.dto.responseDTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponseDTO {
    private String name;
    private String email;
}
