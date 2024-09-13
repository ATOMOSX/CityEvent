package org.cityevents.domain.model.subdocs;

import lombok.*;
import org.bson.types.ObjectId;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class DetailOrder implements Serializable {

    private String id;
    private ObjectId idEvent;
    private float price;
    private int amount;
    private String nameLocality;
}
