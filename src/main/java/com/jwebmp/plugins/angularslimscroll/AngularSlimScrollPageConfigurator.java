/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "SlimScroll",
		pluginDescription = "slimScroll is a small jQuery plugin that transforms any div into a scrollable area with a nice scrollbar - similar to the one Facebook and Google started using in their products recently. slimScroll doesn't occupy any visual space as it only appears on a user initiated mouse-over. User can drag the scrollbar or use mouse-wheel to change the scroll value.",
		pluginUniqueName = "slimscroll",
		pluginVersion = "1.3.8",
		pluginCategories = "scrolling, ui,web ui, framework",
		pluginSubtitle = "slimScroll is a small jQuery plugin that transforms any div into a scrollable area with a nice scrollbar",
		pluginSourceUrl = "https://github.com/rochal/jQuery-slimScroll",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-SlimScroll/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-SlimScroll",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.npmjs.com/package/angular-slimscroll",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-slim-scroll",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-angular-slim-scroll",
		pluginModuleName = "com.jwebmp.plugins.angularslimscroll",
		pluginStatus = PluginStatus.Released
)
public class AngularSlimScrollPageConfigurator
		implements IPageConfigurator<AngularSlimScrollPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularSlimScrollPageConfigurator
	 */
	public AngularSlimScrollPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularSlimScrollPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularSlimScrollPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			
			

			page.getBody()
			    .addJavaScriptReference(AngularSlimScrollReferencePool.SlimScrollReference.getJavaScriptReference());
			page.getBody()
			    .addJavaScriptReference(AngularSlimScrollReferencePool.AngularSlimScroll.getJavaScriptReference()
			                                                                            .setSortOrder(31));
		}

		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularSlimScrollPageConfigurator.enabled;
	}
}
