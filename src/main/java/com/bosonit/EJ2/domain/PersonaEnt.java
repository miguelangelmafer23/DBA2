package com.bosonit.EJ2.domain;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor


@Document(collection = "Personas")
public class PersonaEnt {

    @Id
    private String id;

    private String usuario;

    private Integer password;

    private String name;

    private String surname;

    private String company_email;

    private String persona_email;

    private String city;

    private Boolean active;

    private Date created_date;

    private String imagen_url;

    private Date termination_date;

}
