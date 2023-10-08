package com.duulo.server.utils.verification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class VerificationCode {

    private String code;
    private LocalDateTime expirationDate;

}
