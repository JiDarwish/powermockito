import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*", "org.w3c.*"})
public class StaticsTest {

    @Test
    @PrepareForTest(Statics.class)
    public void mockStaticAndLetItReturnFalse() {
        PowerMockito.mockStatic(Statics.class);

        PowerMockito.when(Statics.returnTrue()).thenReturn(false);

        Assert.assertFalse(Statics.returnTrue());
    }


}
