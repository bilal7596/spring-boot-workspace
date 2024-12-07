package com.bilal.workspace.config;

import com.bilal.workspace.entity.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) {
        return student;
    }
}
