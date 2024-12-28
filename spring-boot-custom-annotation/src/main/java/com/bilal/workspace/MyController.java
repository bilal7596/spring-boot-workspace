package com.bilal.workspace;

import com.bilal.workspace.model.SanitizeType;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @MeasureExecutionTime
    @GetMapping
//    public String execute(@Valid @RequestParam @LuckNumberValidate Integer number) throws InterruptedException {
    public String execute(@Valid @RequestParam @SanitizeInputValidate(sanitizeType = SanitizeType.NUMBER) String number) throws InterruptedException {

        Thread.sleep(1000);
        return "Please check logs" + number;
    }

}
