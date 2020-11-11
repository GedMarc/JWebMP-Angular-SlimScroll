package com.jwebmp.plugins.angularslimscroll.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularSlimScrollExclusionsModule
		implements IGuiceScanModuleExclusions<AngularSlimScrollExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularslimscroll");
		return strings;
	}
}
