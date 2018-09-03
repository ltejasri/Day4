package com.capgemini.account.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalesManagerTest {

	@Test
	void test() {
		assertEquals(4100.0,SalesManager.calSalary(2500),1);
	}

}