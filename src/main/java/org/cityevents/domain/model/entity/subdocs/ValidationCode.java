package org.cityevents.domain.model.entity.subdocs;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class ValidationCode implements Serializable {

    private String creationDate;
    private String code;
}
