package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;

/**
 *
 * @author Marc Magon
 */
public class SlimScrollFeatureTest extends BaseTestClass
{

    public SlimScrollFeatureTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        SlimScrollFeature ssf = new SlimScrollFeature(getInstance().getBody());
        System.out.println(ssf.renderJavascript());
    }

    @Test
    public void testSomeMethod2()
    {
        SlimScrollFeature ssf = new SlimScrollFeature(getInstance().getBody());
        ssf.getOptions().setRailVisible(true);
        ssf.getOptions().setDistance(50);
        System.out.println(ssf.renderJavascript());
    }
}
