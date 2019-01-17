package com.jwebmp.plugins.angularslimscroll;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Adds and removes the slim scroll attribute from angular components
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Angular Slim Scroll",
		description = "slimScroll is a small jQuery plugin that transforms any div into a scrollable area with a nice scrollbar.",
		url = "https://github.com/GedMarc/JWebMP-Angular-SlimScroll")
public class AngularSlimScroll
{
	private static final String SlimScrollAttributeName = "slimscroll";

	/*
	 * Constructs a new AngularSlimScroll
	 */
	private AngularSlimScroll()
	{
		//Nothing needed
	}

	/**
	 * Implements the slim scroll using angular on a given component
	 *
	 * @param component
	 * @param options
	 */
	public static void applySlimScroll(ComponentHierarchyBase component, SlimScrollOptions options)
	{
		if (options != null)
		{
			component.addAttribute(SlimScrollAttributeName, options.toString());
		}
		else
		{
			component.addAttribute(SlimScrollAttributeName, null);
		}
	}

	/**
	 * Removes slim scroll from a given component
	 *
	 * @param component
	 */
	public static void removeSlimScroll(ComponentHierarchyBase component)
	{
		component.addAttribute(SlimScrollAttributeName, null);
	}
}
