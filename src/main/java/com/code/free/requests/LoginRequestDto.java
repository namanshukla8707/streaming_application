package com.code.free.requests;

import lombok.Data;

@Data
public class LoginRequestDto {

    private String username;
    private String password;
    private String email;
}
