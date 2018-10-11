package com.j420.ddd.old;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;

@Data
public class Money {
	
	
	private BigDecimal amount;
	private Currency currency;
}
