package org.cityevents.domain.model.docs;

import lombok.*;
import org.cityevents.domain.model.enums.EventState;
import org.cityevents.domain.model.enums.TypeEvent;
import org.cityevents.domain.model.subdocs.Locality;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Event {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private String imageCover;
    private EventState state;
    private String name;
    private String description;
    private String address;
    private String imageLocations;
    private TypeEvent typeEvent;
    private String date;
    private String city;
    private List<Locality> localities;
}
