package com.jwebmp.plugins.angularslimscroll.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularSlimScrollModuleInclusions implements IGuiceScanModuleInclusions<AngularSlimScrollModuleInclusions>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularslimscroll");
		return set;
	}
}
