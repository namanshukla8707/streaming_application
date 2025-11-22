package com.code.free.utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Constants {
    
    @Value("${jwt.secret}")
    private String jwtSecretKey;

    @Value("${jwt.expiration.ms}")
    private Integer jwtExpirationMs;

}
