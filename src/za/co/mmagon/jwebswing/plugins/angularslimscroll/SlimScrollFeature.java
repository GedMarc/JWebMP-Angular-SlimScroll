package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

import javax.validation.constraints.NotNull;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

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
	@NotNull
	public SlimScrollOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new SlimScrollOptions());
		}
		return super.getOptions();
	}

}
