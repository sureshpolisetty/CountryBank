package com.bank.domain.services.credit;

import com.bank.domain.services.Direction;

import static com.bank.domain.services.Direction.*;


public enum CreditType {
    CREDIT_FOR_PERSONAL(9, IN), CREDIT_FOR_BUSINESS(15, IN), DEPOSIT_FOR_BUSINESS(4, OUT);

    private final int per;
    private final Direction direction;

    CreditType(int per, Direction direction) {
        this.per = per;
        this.direction = direction;
    }

    public int getPer() {
        return per;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "CreditType{" +
                "per=" + per +
                ", direction=" + direction +
                '}';
    }

    public static CreditType getType(Integer i) {
        if (i < 0 || i > 2) throw new IllegalArgumentException("Wrong credit type");
        return values()[i];
    }
}
