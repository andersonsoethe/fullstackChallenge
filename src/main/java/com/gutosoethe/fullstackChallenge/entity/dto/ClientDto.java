package com.gutosoethe.fullstackChallenge.entity.dto;

import java.math.BigDecimal;

public record ClientDto(String firstName, String lastName, BigDecimal participation) {
}
