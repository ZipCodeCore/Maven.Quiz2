package com.zipcodewilmington.assessment2.part2.router;

import com.zipcodewilmington.assessment2.part2.Router;
import javafx.beans.NamedArg;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;

public class SizeTest {

    @Test
    public void test1() {
        test( // expected size of 3
                new Pair("/users", "UserController"),
                new Pair("/students", "StudentController"),
                new Pair("/instructors", "InstructorController"));
    }


    @Test
    public void test2() {
        test( // expected size of 4
                new Pair("/employees", "EmployeeController"),
                new Pair("/muffins", "MuffinController"),
                new Pair("/cupcakes", "CupcakeController"),
                new Pair("/tests", "TestController"));
    }


    @Test
    public void test3() {
        test( // expected size of 2
                new Pair("/cupcakes", "CupcakeController"),
                new Pair("/tests", "TestController"));
    }


    public void test(Pair<String, String>... entries) {
        // given
        Router router = new Router();
        int expectedSize = entries.length;
        for (Pair<String, String> entry : entries) {
            String path = entry.getKey();
            String controller = entry.getValue();

            router.add(path, controller);
        }

        // when
        int actualSize = router.size();

        // then
        Assert.assertEquals(expectedSize, actualSize);
    }

    class Pair<K, V> implements Serializable {
        private K key;
        private V value;

        public Pair(@NamedArg("key") K key, @NamedArg("value") V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}