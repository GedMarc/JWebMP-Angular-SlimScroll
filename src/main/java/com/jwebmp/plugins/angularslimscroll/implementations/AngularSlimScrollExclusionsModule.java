package com.jwebmp.plugins.angularslimscroll.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularSlimScrollExclusionsModule
		implements IGuiceScanModuleExclusions<AngularSlimScrollExclusionsModule>,
				           IGuiceScanJarExclusions<AngularSlimScrollExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-angular-slim-scroll-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularslimscroll");
		return strings;
	}
}
