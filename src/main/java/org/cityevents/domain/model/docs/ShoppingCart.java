package org.cityevents.domain.model.docs;

import lombok.*;
import org.bson.types.ObjectId;
import org.cityevents.domain.model.subdocs.DetailCart;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "Carrito de Compras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ShoppingCart implements Serializable {


    @Id
    @EqualsAndHashCode.Include
    private String id;
    private List<DetailCart> items;
    private String date;
    private ObjectId userId;
}
