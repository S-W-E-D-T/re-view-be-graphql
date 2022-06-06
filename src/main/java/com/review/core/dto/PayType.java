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
public class PayType {
    @Id
    @GeneratedValue
    private Long id;

    String salary;

    String hourly;
    @ManyToOne(fetch = FetchType.LAZY)
    Commission commission;
    @ManyToOne(fetch = FetchType.LAZY)
    Bonus bonus;
}
