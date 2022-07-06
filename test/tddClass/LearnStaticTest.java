package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static tddClass.LearnStatic.getName;
import static tddClass.LearnStatic.setName;

public class LearnStaticTest {
    @Test
    @DisplayName("Testing for static method")
    void setUp(){
        setName("James");
    }
}
