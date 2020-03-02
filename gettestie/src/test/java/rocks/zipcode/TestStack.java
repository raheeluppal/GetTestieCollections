package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;
import java.util.logging.Logger;

public class TestStack {
    private static final Logger LOGGER = Logger.getLogger(TestStack.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void TestStack2(){
        Stack<Person> stack = new Stack<>();
        Person Raheel = new Person("Raheel",1994);
        Person Zan = new Person("Zan",1991);
        stack.push(Raheel);
        stack.push(Zan);
        Person expected = Zan;
        Person actual = stack.pop();
        LOGGER.info("" + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestStack3(){
        Stack<Person> stack = new Stack<>();
        Person Raheel = new Person("Raheel",1994);
        Person Zan = new Person("Zan",1991);
        stack.push(Raheel);
        stack.push(Zan);
        Person expected = Zan;
        Person actual = stack.peek();
        LOGGER.info("" + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestStack4(){
        Stack<Person> stack = new Stack<>();
        Person Raheel = new Person("Raheel",1994);
        Person Zan = new Person("Zan",1991);
        LOGGER.info("" + stack);
        Assert.assertTrue(stack.empty());
    }
}
