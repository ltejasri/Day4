package com.capgemini.account.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



	class PresidentTest {

		@Test
		void test() {

			assertEquals(5564.0,President.calSalary(2500 , 8),1);
		}

	}



