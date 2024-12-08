package com.bilal.workspace.controller;

import com.bilal.workspace.service.JpaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class JpaRestController {

    private final JpaService jpaService;

    @GetMapping("/one-to-many")
    public Object oneToMany() {
        return jpaService.oneToMany();
    }
}
