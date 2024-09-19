package org.cityevents.domain.model.entity.subdocs;

import lombok.*;
import org.bson.types.ObjectId;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class DetailCart implements Serializable {

    private int amount;
    private String nameLocality;
    private ObjectId idEvent;
}
