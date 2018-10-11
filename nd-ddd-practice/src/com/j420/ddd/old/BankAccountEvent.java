package com.j420.ddd.old;

import java.time.ZonedDateTime;

import lombok.Data;
import lombok.Getter;

@Data
public class BankAccountEvent {

	private Long id;
	private Long toBankAccountId;
	private Long fromBankAccountId;
	
	@Getter
	private Money money;
	private ZonedDateTime orrcurredAt;

}
