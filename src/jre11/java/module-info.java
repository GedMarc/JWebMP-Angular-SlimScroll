import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularslimscroll.AngularSlimScrollModule;
import com.jwebmp.plugins.angularslimscroll.AngularSlimScrollPageConfigurator;
import com.jwebmp.plugins.angularslimscroll.implementations.AngularSlimScrollExclusionsModule;

module com.jwebmp.plugins.angularslimscroll {
	exports com.jwebmp.plugins.angularslimscroll;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularSlimScrollPageConfigurator;
	provides IAngularModule with AngularSlimScrollModule;

	provides IGuiceScanJarExclusions with AngularSlimScrollExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularSlimScrollExclusionsModule;

	opens com.jwebmp.plugins.angularslimscroll to com.fasterxml.jackson.databind, com.jwebmp.core;
}
