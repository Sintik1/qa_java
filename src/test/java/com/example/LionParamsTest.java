package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class LionTest {
    private final boolean expected;
    private final String sex;
@Mock
Feline feline;

    public LionTest(boolean expected, String sex) {
        this.expected = expected;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][]getLionData(){
        return new Object[][]{{"Самец",true},
                {"Самка",false}};
    }


    @Test
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(2);
        Lion lion =new Lion(feline,sex);
        assertEquals(2,lion.getKittens());

    }

    @Test
    public void doesHaveMane() {
    }

    @Test
    public void getFood() {
    }
}