module com.jwebmp.plugins.angularslimscroll {
	exports com.jwebmp.plugins.angularslimscroll;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularslimscroll.AngularSlimScrollPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularslimscroll.AngularSlimScrollModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularslimscroll.implementations.AngularSlimScrollExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularslimscroll.implementations.AngularSlimScrollExclusionsModule;

	opens com.jwebmp.plugins.angularslimscroll to com.fasterxml.jackson.databind, com.jwebmp.core;
}