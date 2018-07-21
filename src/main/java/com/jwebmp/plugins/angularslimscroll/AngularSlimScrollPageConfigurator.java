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

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "SlimScroll",
		pluginDescription = "slimScroll is a small jQuery plugin that transforms any div into a scrollable area with a nice scrollbar - similar to the one Facebook and Google started using in their products recently. slimScroll doesn't occupy any visual space as it only appears on a user initiated mouse-over. User can drag the scrollbar or use mouse-wheel to change the scroll value.",
		pluginUniqueName = "jwebswing-slimscroll",
		pluginVersion = "1.3.8",
		pluginCategories = "scrolling, ui,web ui, framework",
		pluginSubtitle = "slimScroll is a small jQuery plugin that transforms any div into a scrollable area with a nice scrollbar",
		pluginSourceUrl = "https://github.com/rochal/jQuery-slimScroll",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-SlimScroll/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-SlimScroll",
		pluginIconUrl = "bower_components/bootstrap/bootstrapicon.jpg",
		pluginIconImageUrl = "bower_components/bootstrap/bootstraplogo.jpg",
		pluginOriginalHomepage = "https://www.npmjs.com/package/angular-slimscroll",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularSlimScroll.jar/download") class AngularSlimScrollPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularSlimScrollPageConfigurator
	 */
	public AngularSlimScrollPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(AngularSlimScrollReferencePool.SlimScrollReference.getJavaScriptReference()
			                                                                              .setSortOrder(30));
			page.getBody()
			    .addJavaScriptReference(AngularSlimScrollReferencePool.AngularSlimScroll.getJavaScriptReference()
			                                                                            .setSortOrder(31));

			page.getAngular()
			    .getAngularModules()
			    .add(new AngularSlimScrollModule());
		}

		return page;
	}
}
