package com.anychart.core;

import com.anychart.APIlib;

import java.util.Locale;

// class
/**
 * Point representing pie point.
 */
public class PiePoint extends Point {

    protected PiePoint() {

    }

    public static PiePoint instantiate() {
        return new PiePoint("new anychart.core.piePoint()");
    }

    

    public PiePoint(String jsChart) {
        jsBase = "piePoint" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Checks the existence of the current point (by index) in dataset.
     */
    public void exists() {
        APIlib.getInstance().addJSLine(jsBase + ".exists();");
    }
    /**
     * Fetches a field value from point data row by its name.
     */
    public void get(String field) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(field)));
    }
    /**
     * Getter for the chart which current point belongs to.
     */
    public com.anychart.core.SeparateChart getChart() {
        return new com.anychart.core.SeparateChart(jsBase + ".getChart()");
    }
    /**
     * Gets end angle of the point.
<b>Note</b>: Works only after chart.draw() is called.
     */
    public void getEndAngle() {
        APIlib.getInstance().addJSLine(jsBase + ".getEndAngle();");
    }
    /**
     * Getter for the point index in chart or series.
     */
    public void getIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".getIndex();");
    }
    /**
     * Gets start angle of the point.
<b>Note</b>: Works only after chart.draw() is called.
     */
    public void getStartAngle() {
        APIlib.getInstance().addJSLine(jsBase + ".getStartAngle();");
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
     * Getter for the hover point state.
     */
    public void hovered() {
        APIlib.getInstance().addJSLine(jsBase + ".hovered();");
    }
    /**
     * Setter for hover point state.
     */
    public com.anychart.core.PiePoint hovered(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", value));

        return this;
    }
    /**
     * Getter for the select point state.
     */
    public void selected() {
        APIlib.getInstance().addJSLine(jsBase + ".selected();");
    }
    /**
     * Setter for the select point state.
     */
    public com.anychart.core.PiePoint selected(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", value));

        return this;
    }
    /**
     * Sets the field of the point data row to the specified value.
     */
    public com.anychart.core.PiePoint set(String field, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s);", wrapQuotes(field), wrapQuotes(value)));

        return this;
    }

}