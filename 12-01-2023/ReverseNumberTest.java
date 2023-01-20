package com.test.junittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseNumberTest {
	
	@Test
	@DisplayName("Reverse of the number is:")
	public void reverse()
	{
		ReverseNumber rev = new ReverseNumber();
		//Will give positive test case
		assertEquals(115, rev.reverse(511));
		assertEquals(204, rev.reverse(402));
		//Will give negative test case
		assertEquals(204, rev.reverse(024));
	}

}
