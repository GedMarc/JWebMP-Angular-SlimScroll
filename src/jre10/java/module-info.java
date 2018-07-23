import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularslimscroll.AngularSlimScrollModule;
import com.jwebmp.plugins.angularslimscroll.AngularSlimScrollPageConfigurator;

module com.jwebmp.plugins.angularslimscroll {
	exports com.jwebmp.plugins.angularslimscroll;

	requires com.jwebmp.core;
	provides IPageConfigurator with AngularSlimScrollPageConfigurator;
	provides IAngularModule with AngularSlimScrollModule;

}
