package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class AngularSlimScrollModule extends AngularModuleBase
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new AngularSlimScrollModule
     */
    public AngularSlimScrollModule()
    {
        super("ui.slimscroll");
    }

    @Override
    public String renderFunction()
    {
        return null;
    }
}
