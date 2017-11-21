package com.cbank.domain.transaction;

import com.bank.domain.services.Direction;
import com.cbank.domain.Persistable;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
public class Transaction extends Persistable {

    @Column(nullable = false)
    private String payer;

    @Column(nullable = false)
    private String recipient;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Direction direction = Direction.OUT;

    @Column(nullable = false)
    private BigDecimal amount;

    private LocalDateTime createAt = LocalDateTime.now();

    private String details;
}
