package org.millaniumcorp.crm.model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    private String name;
    private String contactNumber;
    private Integer age;
    boolean isActive = false;

}
