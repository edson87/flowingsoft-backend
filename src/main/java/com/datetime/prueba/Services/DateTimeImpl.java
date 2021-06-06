package com.datetime.prueba.Services;

import com.datetime.prueba.Services.IServices.IDateTimeService;
import com.datetime.prueba.models.DateTime;
import com.datetime.prueba.repositories.IDateTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class DateTimeImpl implements IDateTimeService {

    @Autowired
    private IDateTimeRepository dateTimeRepository;

    @Override
    public DateTime insertDateTime(DateTime dateTime) {
        return dateTimeRepository.save(dateTime);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DateTime> getAllDateTimes() {
        List<DateTime> list = dateTimeRepository.findAll();

        return list;
    }
}
