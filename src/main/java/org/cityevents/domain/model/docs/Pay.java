package org.cityevents.domain.model.docs;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "Pagos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pay implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private String currency;
    private String paymentMethod;
    private String detailPayment;
    private String codeAuthorization;
    private String date;
    private String transactionValue;
    private String status;
}
