package com.datetime.prueba.Services.IServices;

import com.datetime.prueba.models.DateTime;

import java.util.List;

public interface IDateTimeService {
    public DateTime insertDateTime(DateTime dateTime);

    public List<DateTime> getAllDateTimes();
}
