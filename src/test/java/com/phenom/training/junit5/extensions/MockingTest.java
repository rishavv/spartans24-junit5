package com.phenom.training.junit5.extensions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.function.Function;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockingTest {

    private Processor processor;

    @Mock
    Function functionMock;

    @BeforeEach
    void setUp() {
        processor = new Processor(functionMock);
    }

    @Test
    void process() {
        String text  = "abc";
        int expected = 42;
        when(functionMock.apply(text)).thenReturn(expected);

       int actual = processor.process(text);
       assertEquals(expected, actual, "result");
       verify(functionMock, times(1)).apply(text);
    }
}
