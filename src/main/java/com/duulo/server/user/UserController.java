package com.duulo.server.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(name = "/api/v1/users")
public class UserController {
}
