package com.arrxy.bms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    @Enumerated
    private PaymentMode mode;
    private Double amount;
    @Enumerated
    private PaymentStatus status;
}
