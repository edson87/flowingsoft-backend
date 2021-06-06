package com.datetime.prueba.repositories;

import com.datetime.prueba.models.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDateTimeRepository extends JpaRepository<DateTime, Long> {

}
