package org.cityevents.domain.model.entity.docs;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class User {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private String phone;
    private String name;
    private String cedula;
    private String address;

}
