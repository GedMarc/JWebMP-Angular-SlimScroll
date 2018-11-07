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

import com.jwebmp.core.base.angular.modules.AngularModuleBase;
import com.jwebmp.core.base.angular.services.IAngularModule;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
public class AngularSlimScrollModule
		extends AngularModuleBase
		implements IAngularModule<AngularSlimScrollModule>
{
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

	/**
	 * If this page configurator is enabled
	 *
	 * @return if the configuration must run
	 */
	@Override
	public boolean enabled()
	{
		return AngularSlimScrollPageConfigurator.isEnabled();
	}
}
