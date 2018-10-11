package com.j420.ddd.old;

import java.util.List;

import lombok.Data;
import lombok.Getter;

@Data
public class BankAccount {

	private Long id;
	private List<BankAccountEvent> events;

}
