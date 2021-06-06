package com.datetime.prueba.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Setter
@Getter
@Entity
@Table(name = "datetimes")
public class DateTime implements Serializable {
    private static long serialVersionUID = -8278157603448610956L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String time;

    private String timeZone;
}
