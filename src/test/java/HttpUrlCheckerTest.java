import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class HttpUrlCheckerTest {

    @Test
    public void testShortestPossible() {
        Matcher m = HttpUrlChecker.getMatcher("http://b.com");
        assertThat(m, is(nullValue()));
    }

}