/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularslimscroll;

import com.jwebmp.Page;
import com.jwebmp.htmlbuilder.css.colours.ColourCSSImpl;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class SlimScrollFeatureTest

{

	public SlimScrollFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		SlimScrollFeature ssf = new SlimScrollFeature(new Page().getBody());
		System.out.println(ssf.renderJavascript());
	}

	@Test
	public void testSomeMethod2()
	{
		SlimScrollFeature ssf = new SlimScrollFeature(new Page().getBody());
		ssf.getOptions()
		   .setRailVisible(true);
		ssf.getOptions()
		   .setRailColor(new ColourCSSImpl("orange"));
		ssf.getOptions()
		   .setDistance(50);
		System.out.println(ssf.renderJavascript());
	}
}
