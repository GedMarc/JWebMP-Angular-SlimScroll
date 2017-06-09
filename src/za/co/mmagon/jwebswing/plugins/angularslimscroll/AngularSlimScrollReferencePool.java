package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum AngularSlimScrollReferencePool implements ReferencePool
{
    SlimScrollReference(new JavascriptReference("SlimScroll", 1.1, "bower_components/slimScroll/jquery.slimscroll.js"), null),
    AngularSlimScroll(new JavascriptReference("AngularSlimScroll", 1.1, "bower_components/angular-slimscroll/angular-slimscroll.js"), null);
    /**
     * Any sub data
     */
    private String data;

    /**
     * A new AngularSlimScrollReferencePool
     */
    private AngularSlimScrollReferencePool()
    {

    }

    /**
     * A new AngularSlimScrollReferencePool with data
     */
    private AngularSlimScrollReferencePool(String data)
    {

    }

    private JavascriptReference javaScriptReference;
    private CSSReference cssReference;

    private AngularSlimScrollReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
    {
        this.javaScriptReference = javaScriptReference;
        if (this.javaScriptReference != null)
        {
            this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
        }
        this.cssReference = cssReference;
        if (this.cssReference != null)
        {
            this.cssReference.setPriority(RequirementsPriority.DontCare);
        }
    }

    @Override
    public JavascriptReference getJavaScriptReference()
    {
        return javaScriptReference;
    }

    @Override
    public void setJavaScriptReference(JavascriptReference javaScriptReference)
    {
        this.javaScriptReference = javaScriptReference;
    }

    @Override
    public CSSReference getCssReference()
    {
        return cssReference;
    }

    @Override
    public void setCssReference(CSSReference cssReference)
    {
        this.cssReference = cssReference;
    }

    /**
     * Returns the name or the data contained within
     *
     * @return
     */
    @Override
    public String toString()
    {
        if (data != null && !data.isEmpty())
        {
            return data;
        }
        else
        {
            return name();
        }
    }
}
