package algorithmia.DemoJavaAlgorithm;


import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DemoJavaAlgorithmTest extends TestCase {

    private final DemoJavaAlgorithm underTest;

    public DemoJavaAlgorithmTest() {
        underTest = new DemoJavaAlgorithm();
    }

    @Test
    public void testhwj() throws Exception {
        assertThat(underTest.apply("Bob"), equalTo("Hello Bob"));
    }
}
