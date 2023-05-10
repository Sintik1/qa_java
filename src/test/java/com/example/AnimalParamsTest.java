package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class AnimalParamsTest {
private final String animalKind;
private final List<String>expected;

    public AnimalParamsTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][]getFoodData(){
        return new Object[][]{{"Травоядное", List.of("Трава", "Различные растения")}, {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }
    @Test
    public void getFood() throws Exception {
        Animal animal=new Animal();
        List<String>stringList=animal.getFood(animalKind);
        assertEquals(expected,stringList);
    }


}