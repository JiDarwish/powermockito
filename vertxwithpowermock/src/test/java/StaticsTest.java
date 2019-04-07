import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;

@RunWith(VertxUnitRunner.class)
@PowerMockIgnore({"com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*", "org.w3c.*"})
@PrepareForTest(Statics.class)
public class StaticsTest {

    @Rule
    public PowerMockRule powerMockRule = new PowerMockRule();

    @Test
    public void makeMethodReturnFalseByMock() {
        PowerMockito.mockStatic(Statics.class);
        PowerMockito.when(Statics.returnTrue()).thenReturn(false);
        Assert.assertFalse(Statics.returnTrue());
    }
}
