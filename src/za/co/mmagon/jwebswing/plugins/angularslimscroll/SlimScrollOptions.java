package za.co.mmagon.jwebswing.plugins.angularslimscroll;

import za.co.mmagon.jwebswing.generics.LeftOrRight;
import za.co.mmagon.jwebswing.generics.TopOrBottom;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * All the options available for slim scroll
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class SlimScrollOptions extends JavaScriptPart
{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Prevent directive from watching the option object
	 */
	private Boolean noWatch;
	/**
	 * Width in pixels of the visible scroll area. Stretch-to-parent if not set. Default: none
	 */
	private String width;
	/**
	 * Height in pixels of the visible scroll area. Also supports auto to set the height to same as parent container. Default: 250px
	 */
	private String height;
	/**
	 * Width in pixels of the scrollbar. Default: 7px
	 */
	private Integer size;
	/**
	 * left or right. Sets the position of the scrollbar. Default: right
	 */
	private LeftOrRight position;
	/**
	 * Color in hex of the scrollbar. Default: #000000
	 */
	private ColourCSSImpl color;
	/**
	 * Disables scrollbar hide. Default: false
	 */
	private Boolean alwaysVisible;
	/**
	 * Distance in pixels from the edge of the parent element where scrollbar should appear. It is used together with position property. Default:1px
	 */
	private Integer distance;
	/**
	 * top or bottom or $(selector) - defines initial position of the scrollbar. When set to bottom it automatically scrolls to the bottom of the scrollable container. When HTML element is passed,
	 * slimScroll defaults to offsetTop of this element. Default: top.
	 */
	private TopOrBottom start;
	/**
	 * Integer value for mouse wheel delta. Default: 20
	 */
	private Integer wheelStep;
	/**
	 * Enables scrollbar rail. Default: false
	 */
	private Boolean railVisible;
	/**
	 * Sets scrollbar rail color, Default: #333333
	 */
	private ColourCSSImpl railColor;
	/**
	 * Sets scrollbar rail opacity. Default: 0.2
	 */
	private Double railOpacity;
	/**
	 * Checks if mouse wheel should scroll page when bar reaches top or bottom of the container. When set to true is scrolls the page.Default: false
	 */
	private Boolean allowPageScroll;
	/**
	 * Jumps to the specified scroll value. Can be called on any element with slimScroll already enabled. Example: $(element).slimScroll({ scrollTo: '50px' });
	 */
	private Integer scrollTo;
	/**
	 * Increases/decreases current scroll value by specified amount (positive or negative). Can be called on any element with slimScroll already enabled. Example: $(element).slimScroll({ scrollBy:
	 * '60px' });
	 */
	private Integer scrollBy;
	/**
	 * Disables scrollbar auto fade. When set to true scrollbar doesn't disappear after some time when mouse is over the slimscroll div.Default: false
	 */
	private Boolean disableFadeOut;
	/**
	 * Allows to set different sensitivity for touch scroll events. Negative number inverts scroll direction.Default: 200
	 */
	private Integer touchScrollStep;
	
	/*
	 * Constructs a new SlimScrollOptions
	 */
	public SlimScrollOptions()
	{
		//Nothing needed
	}
	
	/**
	 * Prevent directive from watching the option object
	 *
	 * @return
	 */
	public Boolean getNoWatch()
	{
		return noWatch;
	}
	
	/**
	 * Prevent directive from watching the option object
	 *
	 * @param noWatch
	 *
	 * @return
	 */
	public SlimScrollOptions setNoWatch(Boolean noWatch)
	{
		this.noWatch = noWatch;
		return this;
	}
	
	/**
	 * Width in pixels of the visible scroll area. Stretch-to-parent if not set. Default: none
	 *
	 * @return
	 */
	public String getWidth()
	{
		return width;
	}
	
	/**
	 * Width in pixels of the visible scroll area. Stretch-to-parent if not set. Default: none
	 *
	 * @param width
	 *
	 * @return
	 */
	public SlimScrollOptions setWidth(String width)
	{
		this.width = width;
		return this;
	}
	
	/**
	 * Height in pixels of the visible scroll area. Also supports auto to set the height to same as parent container. Default: 250px
	 *
	 * @return
	 */
	public String getHeight()
	{
		return height;
	}
	
	/**
	 * Height in pixels of the visible scroll area. Also supports auto to set the height to same as parent container. Default: 250px
	 *
	 * @param height
	 *
	 * @return
	 */
	public SlimScrollOptions setHeight(String height)
	{
		this.height = height;
		return this;
	}
	
	/**
	 * Width in pixels of the scrollbar. Default: 7px
	 *
	 * @return
	 */
	public Integer getSize()
	{
		return size;
	}
	
	/**
	 * Width in pixels of the scrollbar. Default: 7px
	 *
	 * @param size
	 *
	 * @return
	 */
	public SlimScrollOptions setSize(Integer size)
	{
		this.size = size;
		return this;
	}
	
	/**
	 * left or right. Sets the position of the scrollbar. Default: right
	 *
	 * @return
	 */
	public LeftOrRight getPosition()
	{
		return position;
	}
	
	/**
	 * left or right. Sets the position of the scrollbar. Default: right
	 *
	 * @param position
	 *
	 * @return
	 */
	public SlimScrollOptions setPosition(LeftOrRight position)
	{
		this.position = position;
		return this;
	}
	
	/**
	 * Color in hex of the scrollbar. Default: #000000
	 *
	 * @return
	 */
	public ColourCSSImpl getColor()
	{
		return color;
	}
	
	/**
	 * Color in hex of the scrollbar. Default: #000000
	 *
	 * @param color
	 *
	 * @return
	 */
	public SlimScrollOptions setColor(ColourCSSImpl color)
	{
		this.color = color;
		return this;
	}
	
	/**
	 * Disables scrollbar hide. Default: false
	 *
	 * @return
	 */
	public Boolean getAlwaysVisible()
	{
		return alwaysVisible;
	}
	
	/**
	 * Disables scrollbar hide. Default: false
	 *
	 * @param alwaysVisible
	 *
	 * @return
	 */
	public SlimScrollOptions setAlwaysVisible(Boolean alwaysVisible)
	{
		this.alwaysVisible = alwaysVisible;
		return this;
	}
	
	/**
	 * Distance in pixels from the edge of the parent element where scrollbar should appear. It is used together with position property. Default:1px
	 *
	 * @return
	 */
	public Integer getDistance()
	{
		return distance;
	}
	
	/**
	 * Distance in pixels from the edge of the parent element where scrollbar should appear. It is used together with position property. Default:1px
	 *
	 * @param distance
	 *
	 * @return
	 */
	public SlimScrollOptions setDistance(Integer distance)
	{
		this.distance = distance;
		return this;
	}
	
	/**
	 * top or bottom or $(selector) - defines initial position of the scrollbar. When set to bottom it automatically scrolls to the bottom of the scrollable container. When HTML element is passed,
	 * slimScroll defaults to offsetTop of this element. Default: top.
	 *
	 * @return
	 */
	public TopOrBottom getStart()
	{
		return start;
	}
	
	/**
	 * top or bottom or $(selector) - defines initial position of the scrollbar. When set to bottom it automatically scrolls to the bottom of the scrollable container. When HTML element is passed,
	 * slimScroll defaults to offsetTop of this element. Default: top.
	 *
	 * @param start
	 *
	 * @return
	 */
	public SlimScrollOptions setStart(TopOrBottom start)
	{
		this.start = start;
		return this;
	}
	
	/**
	 * Integer value for mouse wheel delta. Default: 20
	 *
	 * @return
	 */
	public Integer getWheelStep()
	{
		return wheelStep;
	}
	
	/**
	 * Integer value for mouse wheel delta. Default: 20
	 *
	 * @param wheelStep
	 *
	 * @return
	 */
	public SlimScrollOptions setWheelStep(Integer wheelStep)
	{
		this.wheelStep = wheelStep;
		return this;
	}
	
	/**
	 * Enables scrollbar rail. Default: false
	 *
	 * @return
	 */
	public Boolean getRailVisible()
	{
		return railVisible;
	}
	
	/**
	 * Enables scrollbar rail. Default: false
	 *
	 * @param railVisible
	 *
	 * @return
	 */
	public SlimScrollOptions setRailVisible(Boolean railVisible)
	{
		this.railVisible = railVisible;
		return this;
	}
	
	/**
	 * Sets scrollbar rail color, Default: #333333
	 *
	 * @return
	 */
	public ColourCSSImpl getRailColor()
	{
		return railColor;
	}
	
	/**
	 * Sets scrollbar rail color, Default: #333333
	 *
	 * @param railColor
	 *
	 * @return
	 */
	public SlimScrollOptions setRailColor(ColourCSSImpl railColor)
	{
		this.railColor = railColor;
		return this;
	}
	
	/**
	 * Sets scrollbar rail opacity. Default: 0.2
	 *
	 * @return
	 */
	public Double getRailOpacity()
	{
		return railOpacity;
	}
	
	/**
	 * Sets scrollbar rail opacity. Default: 0.2
	 *
	 * @param railOpacity
	 *
	 * @return
	 */
	public SlimScrollOptions setRailOpacity(Double railOpacity)
	{
		this.railOpacity = railOpacity;
		return this;
	}
	
	/**
	 * Checks if mouse wheel should scroll page when bar reaches top or bottom of the container. When set to true is scrolls the page.Default: false
	 *
	 * @return
	 */
	public Boolean getAllowPageScroll()
	{
		return allowPageScroll;
	}
	
	/**
	 * Checks if mouse wheel should scroll page when bar reaches top or bottom of the container. When set to true is scrolls the page.Default: false
	 *
	 * @param allowPageScroll
	 *
	 * @return
	 */
	public SlimScrollOptions setAllowPageScroll(Boolean allowPageScroll)
	{
		this.allowPageScroll = allowPageScroll;
		return this;
	}
	
	/**
	 * Jumps to the specified scroll value. Can be called on any element with slimScroll already enabled. Example: $(element).slimScroll({ scrollTo: '50px' });
	 *
	 * @return
	 */
	public Integer getScrollTo()
	{
		return scrollTo;
	}
	
	/**
	 * Jumps to the specified scroll value. Can be called on any element with slimScroll already enabled. Example: $(element).slimScroll({ scrollTo: '50px' });
	 *
	 * @param scrollTo
	 *
	 * @return
	 */
	public SlimScrollOptions setScrollTo(Integer scrollTo)
	{
		this.scrollTo = scrollTo;
		return this;
	}
	
	/**
	 * Increases/decreases current scroll value by specified amount (positive or negative). Can be called on any element with slimScroll already enabled. Example: $(element).slimScroll({ scrollBy:
	 * '60px' });
	 *
	 * @return
	 */
	public Integer getScrollBy()
	{
		return scrollBy;
	}
	
	/**
	 * Increases/decreases current scroll value by specified amount (positive or negative). Can be called on any element with slimScroll already enabled. Example: $(element).slimScroll({ scrollBy:
	 * '60px' });
	 *
	 * @param scrollBy
	 *
	 * @return
	 */
	public SlimScrollOptions setScrollBy(Integer scrollBy)
	{
		this.scrollBy = scrollBy;
		return this;
	}
	
	/**
	 * Disables scrollbar auto fade. When set to true scrollbar doesn't disappear after some time when mouse is over the slimscroll div.Default: false
	 *
	 * @return
	 */
	public Boolean getDisableFadeOut()
	{
		return disableFadeOut;
	}
	
	/**
	 * Disables scrollbar auto fade. When set to true scrollbar doesn't disappear after some time when mouse is over the slimscroll div.Default: false
	 *
	 * @param disableFadeOut
	 *
	 * @return
	 */
	public SlimScrollOptions setDisableFadeOut(Boolean disableFadeOut)
	{
		this.disableFadeOut = disableFadeOut;
		return this;
	}
	
	/**
	 * Allows to set different sensitivity for touch scroll events. Negative number inverts scroll direction.Default: 200
	 *
	 * @return
	 */
	public Integer getTouchScrollStep()
	{
		return touchScrollStep;
	}
	
	/**
	 * Allows to set different sensitivity for touch scroll events. Negative number inverts scroll direction.Default: 200
	 *
	 * @param touchScrollStep
	 *
	 * @return
	 */
	public SlimScrollOptions setTouchScrollStep(Integer touchScrollStep)
	{
		this.touchScrollStep = touchScrollStep;
		return this;
	}
	
	@Override
	public String toString()
	{
		return super.toString().replaceAll("\\s*\\n\\s*", "");
	}

}
