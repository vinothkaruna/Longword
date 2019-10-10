/**
 * 
 */
package test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Vinoth
 *
 */
class Findlongwordtest {
     String val="Testing the code";
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@Test
	void test() {
		Assert.assertEquals(7, FindLongword.longword(val));
		
	}

}
