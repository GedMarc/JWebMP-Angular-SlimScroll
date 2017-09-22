package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularSlimScroll.jar/download"
) class AngularSlimScrollPageConfigurator extends PageConfigurator
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
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);
			
			page.getBody().addJavaScriptReference(AngularSlimScrollReferencePool.SlimScrollReference.getJavaScriptReference());
			page.getBody().addJavaScriptReference(AngularSlimScrollReferencePool.AngularSlimScroll.getJavaScriptReference());
			
			page.getAngular().getAngularModules().add(new AngularSlimScrollModule());
		}
		
		return page;
	}
}
