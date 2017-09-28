package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourCSSImpl;

/**
 * @author Marc Magon
 */
public class SlimScrollOptionsTest
{
	
	public SlimScrollOptionsTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		SlimScrollOptions sso = new SlimScrollOptions();
		sso.setAlwaysVisible(true);
		sso.setColor(new ColourCSSImpl("#ffffff"));
		System.out.println(sso);
	}
}
