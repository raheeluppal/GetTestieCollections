package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class DequeTest { private static final Logger LOGGER = Logger.getLogger(QueueTest.class.getName());

    @org.junit.Test
    public void TestDeque1() {
        Deque<String> queue = new LinkedList<>();
        queue.add("Hello world");
        assertEquals(false, queue.isEmpty()); // false
    }
    @Test
    public void TestDeque2(){
        Deque<Person> queue = new LinkedList<>();
        Person Raheel = new Person("Raheel",1994);
        Person Zan = new Person("Zan",1991);
        queue.add(Raheel);
        queue.add(Zan);
        Person expected = Raheel;
        Person actual = queue.poll();
        LOGGER.info("" + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestDeque3(){
        Deque<Person> queue= new LinkedList<>();

        Person Raheel = new Person("Raheel",1994);
        Person Zan = new Person("Zan",1991);
        queue.add(Raheel);
        queue.add(Zan);
        Person expected = Raheel;
        Person actual = queue.peek();
        LOGGER.info("" + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestDeque4(){
        Deque<Person> queue= new LinkedList<>();

        LOGGER.info("" + queue);
        Assert.assertTrue(queue.isEmpty());
    }


}


