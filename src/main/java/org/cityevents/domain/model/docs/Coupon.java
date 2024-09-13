package org.cityevents.domain.model.docs;

import lombok.*;
import org.cityevents.domain.model.enums.CouponType;
import org.cityevents.domain.model.enums.StatusCoupon;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "searches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Coupon {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private float discount;
    private String code;
    private StatusCoupon status;
    private CouponType type;
    private String name;
}
