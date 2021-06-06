package com.datetime.prueba.controllers;


import com.datetime.prueba.Services.IServices.IDateTimeService;
import com.datetime.prueba.models.DateTime;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@CrossOrigin
@RequestMapping("api/datetime")
@RestController
public class DateTimeController {

    @Autowired
    private IDateTimeService dateTimeService;

    @PostMapping()
    public ResponseEntity<?> insertDateTime(@RequestBody DateTime dateTime) {
        Map<String, Object> message = new HashMap<>();
        DateTime dateTimeResponse = new DateTime();

        if (dateTime == null || dateTime.getTime().equals("")) {
            message.put("error", "La clase esta vacia");
            return new ResponseEntity<Map<String, Object>>(message, HttpStatus.BAD_REQUEST);
        }

        dateTimeResponse = dateTimeService.insertDateTime(dateTime);

        message.put("response",dateTimeResponse);

        return new ResponseEntity<Map<String, Object>>(message, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<?> getAllDateTimes() {
        Map<String, Object> message = new HashMap<>();

        List<DateTime> dateTimes = dateTimeService.getAllDateTimes();

        message.put("response", dateTimes);

        return new ResponseEntity<Map<String, Object>>(message, HttpStatus.OK);
    }
}
