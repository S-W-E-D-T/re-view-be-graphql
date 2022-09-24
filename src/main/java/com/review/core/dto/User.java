package com.review.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(fetch = FetchType.LAZY)
    List<PayType> payType;
    @OneToMany(fetch = FetchType.LAZY)
    List<ContactInformation> contactInformation;
    @OneToMany(fetch = FetchType.LAZY)
    List<Pto> pto;
}
