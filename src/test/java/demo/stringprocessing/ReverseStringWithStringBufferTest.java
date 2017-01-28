package demo.stringprocessing;

/**
 * Need JDK 8 for Instant Class (Cool and as good as my TimeUtil I wrote)
 * While developing show timer remove after after dev.
 * @author Philip Chauvet (Jahmani)
 */
import org.junit.Assert;
import org.junit.Test;
import java.time.*;

public class ReverseStringWithStringBufferTest {

	@Test
	public void reverseUseCase1() {
		Instant before = Instant.now();

		String result = ReverseStringWithStringBuffer.reverseUsingTwoStringBuilder(StringReverseUseCases.USECASE1);
		Assert.assertEquals(StringReverseUseCases.RESULTCASE1, result);

		StringReverseUseCases.showTimer(before);
	}

	@Test
	public void reverseUseCase2() {
		Instant before = Instant.now();

		String result = ReverseStringWithStringBuffer.reverseUsingTwoStringBuilder(StringReverseUseCases.USECASE2);
		Assert.assertEquals(StringReverseUseCases.RESULTCASE2, result);

		StringReverseUseCases.showTimer(before);
	}

	@Test
	public void reverseUseCase3() {
		Instant before = Instant.now();

		String result = ReverseStringWithStringBuffer.reverseUsingTwoStringBuilder(StringReverseUseCases.USECASE3);
		Assert.assertEquals(StringReverseUseCases.RESULTCASE3, result);

		StringReverseUseCases.showTimer(before);
	}

	@Test
	public void reverseUseCase4() {
		Instant before = Instant.now();

		String result = ReverseStringWithStringBuffer.reverseUsingTwoStringBuilder(StringReverseUseCases.USECASE4);
		Assert.assertEquals(StringReverseUseCases.RESULTCASE4, result);

		StringReverseUseCases.showTimer(before);
	}

	@Test
	public void reverseUseCase5() {
		Instant before = Instant.now();

		String result = ReverseStringWithStringBuffer.reverseUsingTwoStringBuilder(StringReverseUseCases.USECASE5);
		Assert.assertEquals(StringReverseUseCases.RESULTCASE5, result);

		StringReverseUseCases.showTimer(before);
	}

	@Test
	public void reverseUseCase6() {
		Instant before = Instant.now();

		String result = ReverseStringWithStringBuffer.reverseUsingTwoStringBuilder(StringReverseUseCases.USECASE6);
		Assert.assertEquals(StringReverseUseCases.RESULTCASE6, result);

		StringReverseUseCases.showTimer(before);
	}

}
