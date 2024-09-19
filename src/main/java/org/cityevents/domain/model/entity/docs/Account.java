package org.cityevents.domain.model.entity.docs;

import lombok.*;
import org.bson.types.ObjectId;
import org.cityevents.domain.model.entity.enums.StateAccount;
import org.cityevents.domain.model.entity.enums.Role;
import org.cityevents.domain.model.entity.subdocs.ValidationCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "Cuenta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Account implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private Role role;
    private String email;
    private ValidationCode validationCode;
    private ObjectId idUser;
    private String dateRecord;
    @ToString.Exclude
    private String password;
    private StateAccount stateAccount;
    private ValidationCode codeValidationPassword;

}
