package com.anychart.core.radar.series;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Define Area series type.<br/>
<b>Note:</b> Better for use {@link anychart.charts.Radar#area} method.
 */
public class Area extends ContinuousBase {

    protected Area() {

    }

    public static Area instantiate() {
        return new Area("new anychart.core.radar.series.area()");
    }

    

    public Area(String jsChart) {
        jsBase = "area" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for element bottom bound settings.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.radar.series.Area bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.radar.series.Area bottom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element bounds settings.
     */
    public com.anychart.core.utils.Bounds bounds() {
        return new com.anychart.core.utils.Bounds(jsBase + ".bounds()");
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.radar.series.Area bounds(com.anychart.utils.RectObj value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.radar.series.Area bounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.radar.series.Area bounds(com.anychart.core.utils.Bounds value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(Number x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.radar.series.Area bounds(String x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Getter for the series color.
     */
    public void color() {
        APIlib.getInstance().addJSLine(jsBase + ".color();");
    }
    /**
     * Setter for the series color.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area color(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".color(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for connectMissingPoints mode.
     */
    public void connectMissingPoints() {
        APIlib.getInstance().addJSLine(jsBase + ".connectMissingPoints();");
    }
    /**
     * Setter for connectMissingPoints mode.
     */
    public com.anychart.core.radar.series.Area connectMissingPoints(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectMissingPoints(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", arrayToString(data)));
    }
    /**
     * Getter for the element state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the element enabled state.
     */
    public com.anychart.core.radar.series.Area enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".excludePoint(%s);", indexes));
    }
    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number[] indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes)));
    }
    /**
     * Getter for the series fill color.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for fill settings using function.
     */
    public com.anychart.core.radar.series.Area fill(String fillFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(fillFunction)));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.radar.series.Area fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.radar.series.Area fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Returns an array of excluded points.
     */
    public void getExcludedPoints() {
        APIlib.getInstance().addJSLine(jsBase + ".getExcludedPoints();");
    }
    /**
     * Returns pixel bounds of the element due to parent bounds and self bounds settings.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * Gets wrapped point by index.
     */
    public com.anychart.core.SeriesPoint getPoint(Number index) {
        return new com.anychart.core.SeriesPoint(String.format(Locale.US, jsBase + ".getPoint(%s)", index));
    }
    /**
     * Getter for the statistics value by key.
     */
    public void getStat(com.anychart.enums.Statistics key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", (key != null) ? key.getJsBase() : null));
    }
    /**
     * Getter for the statistics value by key.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for hatch fill settings.
     */
    public com.anychart.graphics.vector.PatternFill hatchFill() {
        return new com.anychart.graphics.vector.PatternFill(jsBase + ".hatchFill()");
    }
    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.radar.series.Area hatchFill(com.anychart.graphics.vector.PatternFill patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.radar.series.Area hatchFill(com.anychart.graphics.vector.HatchFill patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.radar.series.Area hatchFill(String patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrType), wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.radar.series.Area hatchFill(com.anychart.graphics.vector.hatchfill.HatchFillType patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Getter for element height settings.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.radar.series.Area height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.radar.series.Area height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Hovers points or series.
     */
    public com.anychart.core.radar.series.Area hover() {
        APIlib.getInstance().addJSLine(jsBase + ".hover();");

        return this;
    }
    /**
     * Hovers a point or a series by index.
     */
    public com.anychart.core.radar.series.Area hover(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hover(%s);", index));

        return this;
    }
    /**
     * Hovers points or series by indexes.
     */
    public com.anychart.core.radar.series.Area hover(Number[] indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hover(%s);", Arrays.toString(indexes)));

        return this;
    }
    /**
     * Getter for hovered state settings.
     */
    public com.anychart.core.StateSettings hovered() {
        return new com.anychart.core.StateSettings(jsBase + ".hovered()");
    }
    /**
     * Setter for hovered state settings.
     */
    public com.anychart.core.radar.series.Area hovered(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the series id.
     */
    public void id() {
        APIlib.getInstance().addJSLine(jsBase + ".id();");
    }
    /**
     * Setter for the series id.
     */
    public com.anychart.core.radar.series.Area id(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the series id.
     */
    public com.anychart.core.radar.series.Area id(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", value));

        return this;
    }
    /**
     * Includes all excluded points.
     */
    public void includeAllPoints() {
        APIlib.getInstance().addJSLine(jsBase + ".includeAllPoints();");
    }
    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".includePoint(%s);", indexes));
    }
    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number[] indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes)));
    }
    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", indexes));
    }
    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number[] indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes)));
    }
    /**
     * Getter for series data labels.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for series data labels.
     */
    public com.anychart.core.radar.series.Area labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for series data labels.
     */
    public com.anychart.core.radar.series.Area labels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", value));

        return this;
    }
    /**
     * Getter for element left bound settings.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.radar.series.Area left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.radar.series.Area left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for legend item settings of series.
     */
    public com.anychart.core.utils.LegendItemSettings legendItem() {
        return new com.anychart.core.utils.LegendItemSettings(jsBase + ".legendItem()");
    }
    /**
     * Setter for legend item settings of series.
     */
    public com.anychart.core.radar.series.Area legendItem(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legendItem(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for series data markers.
     */
    public com.anychart.core.ui.MarkersFactory markers() {
        return new com.anychart.core.ui.MarkersFactory(jsBase + ".markers()");
    }
    /**
     * Setter for series data markers.
     */
    public com.anychart.core.radar.series.Area markers(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markers(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for series data markers.
     */
    public com.anychart.core.radar.series.Area markers(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markers(%s);", value));

        return this;
    }
    /**
     * Getter for the maximum height.
     */
    public void maxHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".maxHeight();");
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.radar.series.Area maxHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.radar.series.Area maxHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for maximum labels.
     */
    public com.anychart.core.ui.LabelsFactory maxLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".maxLabels()");
    }
    /**
     * Setter for maximum labels.
     */
    public com.anychart.core.radar.series.Area maxLabels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxLabels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for maximum labels.
     */
    public com.anychart.core.radar.series.Area maxLabels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxLabels(%s);", settings));

        return this;
    }
    /**
     * Getter for the maximum width.
     */
    public void maxWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxWidth();");
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.radar.series.Area maxWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.radar.series.Area maxWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the series meta data.
     */
    public void meta(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(key)));
    }
    /**
     * Add/Replace meta data for series by key.
     */
    public com.anychart.core.radar.series.Area meta(String key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s);", wrapQuotes(key), wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the minimum height.
     */
    public void minHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".minHeight();");
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.radar.series.Area minHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.radar.series.Area minHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for minimum labels.
     */
    public com.anychart.core.ui.LabelsFactory minLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".minLabels()");
    }
    /**
     * Setter for minimum labels.
     */
    public com.anychart.core.radar.series.Area minLabels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minLabels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for minimum labels.
     */
    public com.anychart.core.radar.series.Area minLabels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minLabels(%s);", settings));

        return this;
    }
    /**
     * Getter for the minimum width.
     */
    public void minWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".minWidth();");
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.radar.series.Area minWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.radar.series.Area minWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the series name.
     */
    public void name() {
        APIlib.getInstance().addJSLine(jsBase + ".name();");
    }
    /**
     * Setter for the series name. <br/>
Basically, name of series is used in Legend displaying, but it can be used in tooltips as well.
     */
    public com.anychart.core.radar.series.Area name(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".name(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for normal state settings.
     */
    public com.anychart.core.StateSettings normal() {
        return new com.anychart.core.StateSettings(jsBase + ".normal()");
    }
    /**
     * Setter for normal state settings.
     */
    public com.anychart.core.radar.series.Area normal(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(com.anychart.graphics.vector.PaperSize paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", (paperSizeOrOptions != null) ? paperSizeOrOptions.getJsBase() : null, landscape));
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(String paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrOptions), landscape));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for element right bound settings.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.radar.series.Area right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.radar.series.Area right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Selects point by index.
     */
    public com.anychart.core.radar.series.Area select(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s);", index));

        return this;
    }
    /**
     * Selects point by indexes.
     */
    public com.anychart.core.radar.series.Area select(Number[] indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s);", Arrays.toString(indexes)));

        return this;
    }
    /**
     * Getter for selected state settings.
     */
    public com.anychart.core.StateSettings selected() {
        return new com.anychart.core.StateSettings(jsBase + ".selected()");
    }
    /**
     * Setter for selected state settings.
     */
    public com.anychart.core.radar.series.Area selected(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Gets the state of the series for selection mode.
     */
    public void selectionMode() {
        APIlib.getInstance().addJSLine(jsBase + ".selectionMode();");
    }
    /**
     * Allows to select points of the series.
To select multiple points, press "ctrl" and click on them.
     */
    public com.anychart.core.radar.series.Area selectionMode(com.anychart.enums.SelectionMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectionMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Allows to select points of the series.
To select multiple points, press "ctrl" and click on them.
     */
    public com.anychart.core.radar.series.Area selectionMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectionMode(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for stroke settings.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for series stroke by function.
     */
    public com.anychart.core.radar.series.Area stroke(String strokeFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(strokeFunction)));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.radar.series.Area stroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the series data tooltip.
     */
    public com.anychart.core.ui.Tooltip tooltip() {
        return new com.anychart.core.ui.Tooltip(jsBase + ".tooltip()");
    }
    /**
     * Setter for the series data tooltip.
     */
    public com.anychart.core.radar.series.Area tooltip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the series data tooltip.
     */
    public com.anychart.core.radar.series.Area tooltip(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", value));

        return this;
    }
    /**
     * Getter for element top bound settings.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.radar.series.Area top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.radar.series.Area top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Transforms values to pixel coordinates.
     */
    public void transformXY(String xVal, String yVal, Number xSubRangeRatio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transformXY(%s, %s, %s);", wrapQuotes(xVal), wrapQuotes(yVal), xSubRangeRatio));
    }
    /**
     * Removes hover from the series point or series.
     */
    public com.anychart.core.radar.series.Area unhover() {
        APIlib.getInstance().addJSLine(jsBase + ".unhover();");

        return this;
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Deselects all selected points.
     */
    public com.anychart.core.radar.series.Area unselect() {
        APIlib.getInstance().addJSLine(jsBase + ".unselect();");

        return this;
    }
    /**
     * Deselects selected point by index.
     */
    public com.anychart.core.radar.series.Area unselect(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unselect(%s);", index));

        return this;
    }
    /**
     * Deselects selected points by indexes.
     */
    public com.anychart.core.radar.series.Area unselect(Number[] indexes) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unselect(%s);", Arrays.toString(indexes)));

        return this;
    }
    /**
     * Getter for element width settings.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.radar.series.Area width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.radar.series.Area width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the series X scale.
     */
    public com.anychart.scales.Ordinal xScale() {
        return new com.anychart.scales.Ordinal(jsBase + ".xScale()");
    }
    /**
     * Setter for the series X scale.
     */
    public com.anychart.core.radar.series.Area xScale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the series X scale.
     */
    public com.anychart.core.radar.series.Area xScale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the series X scale.
     */
    public com.anychart.core.radar.series.Area xScale(com.anychart.enums.ScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the series Y scale.
     */
    public com.anychart.scales.Base yScale() {
        return new com.anychart.scales.Base(jsBase + ".yScale()");
    }
    /**
     * Setter for the series Y scale.
     */
    public com.anychart.core.radar.series.Area yScale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the series Y scale.
     */
    public com.anychart.core.radar.series.Area yScale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the series Y scale.
     */
    public com.anychart.core.radar.series.Area yScale(com.anychart.enums.ScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.radar.series.Area zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Getter for the accessibility setting.
     */
    public com.anychart.core.utils.SeriesA11y a11y() {
        return new com.anychart.core.utils.SeriesA11y(jsBase + ".a11y()");
    }
    /**
     * Setter for the accessibility setting.
     */
    public com.anychart.core.radar.series.Area a11y(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".a11y(%s);", value));

        return this;
    }
    /**
     * Setter for the accessibility setting.
     */
    public com.anychart.core.radar.series.Area a11y(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".a11y(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.View data(com.anychart.data.View data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, String fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), wrapQuotes(fillMethod)));
    }
    /**
     * 
     */
    public Object xScale(Class scaleClass) {
        Object instance = null;
        try {
            instance = scaleClass.getDeclaredConstructor(String.class).newInstance(jsBase + ".xScale()");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        return instance;
    }
    /**
     * 
     */
    public Object yScale(Class scaleClass) {
        Object instance = null;
        try {
            instance = scaleClass.getDeclaredConstructor(String.class).newInstance(jsBase + ".yScale()");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        return instance;
    }

}