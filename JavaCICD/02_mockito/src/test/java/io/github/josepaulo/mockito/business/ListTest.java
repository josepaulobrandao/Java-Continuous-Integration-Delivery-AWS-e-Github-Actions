package io.github.josepaulo.mockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListTest {
	
	// test[System Under Test]_[Condition or State Change]_[Expected Result]
	@Test
	@DisplayName("Display Name")
	void testMockkingList_when_SizeIsCalled_shouldReturn10() {
		// Given - Arrange
		List<?> list = mock(List.class);	
		when(list.size()).thenReturn(10);
	
		// Then - Assert && 	// When - Act
		assertEquals(10, list.size());
		assertEquals(10, list.size());
		assertEquals(10, list.size());
		assertEquals(10, list.size());
	}
	@Test
	@DisplayName("Display Name")
	void testMockkingList_when_SizeIsCalled_shouldReturnMultipleValues() {
		// Given - Arrange
		List<?> list = mock(List.class);	
		when(list.size()).thenReturn(10).thenReturn(20);
	
		// Then - Assert && 	// When - Act
		assertEquals(10, list.size());
		assertEquals(20, list.size());
		assertEquals(20, list.size());
	}
	@Test
	@DisplayName("Display Name")
	void testMockkingList_when_GetIsCalled_shouldReturnErudio() {
		// Given - Arrange
		List<String> list = mock(List.class);	
		when(list.get(0)).thenReturn("Erudio");
		
		// Then - Assert && 	// When - Act
		assertEquals("Erudio", list.get(0));
		assertNull(list.get(1));


	}

}
