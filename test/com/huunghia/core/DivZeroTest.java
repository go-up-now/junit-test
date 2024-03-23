
package com.huunghia.core;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Van Bao
 */
public class DivZeroTest {
    
    @Test(expected = ArithmeticException.class)
    public void checkDiv() throws Exception{
        DivZero.divide(10, 0);
    }
}
