package io.github.adil_jr.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/api/test/v1")
    public String testLog() {
        logger.debug("Test is an DEBUG log");
        logger.info("Test is an INFO log");
        logger.warn("Test is an WARN log");
        logger.error("Test is an ERROR log");
        return "Logs generated successfully";
    }
}
