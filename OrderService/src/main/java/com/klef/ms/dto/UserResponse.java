package com.klef.ms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse 
{

    private Long id;
    private String name;
    private String email;
    private String contact;
    private String role;


}
