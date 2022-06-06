package com.review.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    String name;

    @Column(unique=true)
    String userName;
    String password;
    String role;
    String photo;
    @ManyToOne(fetch = FetchType.LAZY)
    PayType payType;
    @ManyToOne(fetch = FetchType.LAZY)
    ContactInformation contactInformation;
    @ManyToOne(fetch = FetchType.LAZY)
    Pto pto;


}
