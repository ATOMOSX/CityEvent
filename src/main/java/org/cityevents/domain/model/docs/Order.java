package org.cityevents.domain.model.docs;

import lombok.*;
import org.bson.types.ObjectId;
import org.cityevents.domain.model.subdocs.DetailOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Ordenes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private ObjectId idUser;
    private String date;
    private String plotCode;
    private List<DetailOrder> items;
    private Pay pay;
    private float total;
    private ObjectId idCoupon;

}
