package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Adds and removes the slim scroll attribute from angular components
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Angular Slim Scroll", description = "slimScroll is a small jQuery plugin that transforms any div into a scrollable area with a nice scrollbar.",
         url = "https://github.com/GedMarc/JWebSwing-Angular-SlimScroll")
public class AngularSlimScroll
{

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
        component.addAttribute("slimscroll", options.toString());
    }

    /**
     * Removes slim scroll from a given component
     *
     * @param component
     */
    public static void removeSlimScroll(ComponentHierarchyBase component)
    {
        component.addAttribute("slimscroll", null);
    }
}
