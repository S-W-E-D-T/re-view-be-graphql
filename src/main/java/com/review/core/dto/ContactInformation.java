package com.review.core.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ContactInformation {
    @Id
    @GeneratedValue
    private Long id;

    String phoneNumber;
    String streetAddress;
    String state;
    String zipcode;
    String emailAddress;

    @OneToMany(fetch = FetchType.LAZY)
    EmergencyContact emergencyContact;
}
