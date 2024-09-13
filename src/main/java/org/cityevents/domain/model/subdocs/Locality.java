package org.cityevents.domain.model.subdocs;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Locality implements Serializable {

    private float price;
    private String nameLocality;
    private int ticketsSold;
    private  int maximumCapacity;
}
