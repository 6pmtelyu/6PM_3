
import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {
	public static void main(String[] args) {
		Counter counter = new Counter();

		counter.increment();
		counter.increment();
		counter.increment();

		System.out.println("Count: " + counter.getCount());

		counter.decrement();

		System.out.println("Count: " + counter.getCount());
	}
}