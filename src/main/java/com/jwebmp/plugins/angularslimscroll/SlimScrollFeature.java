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

import com.jwebmp.Feature;
import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.plugins.ComponentInformation;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * Implements the Slim Scroll option via JavaScript instead of angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Slim Scroll JS",
		description = "slimScroll is a small jQuery plugin that transforms any div into a scrollable area with a nice scrollbar.",
		url = "https://github.com/GedMarc/JWebSwing-Angular-SlimScroll")
public class SlimScrollFeature
		extends Feature<SlimScrollOptions, SlimScrollFeature>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new SlimScrollFeature
	 */
	public SlimScrollFeature(ComponentHierarchyBase component)
	{
		super("SlimScrollFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "slimScroll(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}

	@Override

	public SlimScrollOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new SlimScrollOptions());
		}
		return super.getOptions();
	}

}
