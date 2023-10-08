package com.duulo.server.utils.verification;

import com.duulo.server.utils.verification.VerificationCode;

import java.time.LocalDateTime;
import java.util.Random;

abstract public class VerificationCodeGenerator {
    public static VerificationCode newCode() {

        Random random = new Random();
        String code =
                String.valueOf(random.nextInt(900000) + 100000);

        LocalDateTime expirationDate =
                LocalDateTime
                        .now()
                        .plusMinutes(5);

        return new VerificationCode(code, expirationDate);
    }

}
