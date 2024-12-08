package com.bilal.workspace.service;

import com.bilal.workspace.repository.SchoolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JpaServiceImpl implements JpaService {
    private final SchoolRepository schoolRepository;

    @Override
    public Object oneToMany() {
        return schoolRepository.findAll();
    }
}