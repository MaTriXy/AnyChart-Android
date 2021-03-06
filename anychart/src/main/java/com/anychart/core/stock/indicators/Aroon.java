package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Aroon indicator class.
{docs:Stock_Charts/Technical_Indicators/Aroon}Learn more about the Aroon indicator.{docs}
 */
public class Aroon extends JsObject {

    protected Aroon() {

    }

    public static Aroon instantiate() {
        return new Aroon("new anychart.core.stock.indicators.aroon()");
    }

    

    public Aroon(String jsChart) {
        jsBase = "aroon" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the indicator Down Series.
     */
    public com.anychart.core.stock.series.Base downSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".downSeries()");
    }
    /**
     * Setter for the indicator Down Series.
     */
    public com.anychart.core.stock.indicators.Aroon downSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".downSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Down Series.
     */
    public com.anychart.core.stock.indicators.Aroon downSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".downSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator period.
     */
    public void period() {
        APIlib.getInstance().addJSLine(jsBase + ".period();");
    }
    /**
     * Setter for the indicator period.
     */
    public com.anychart.core.stock.indicators.Aroon period(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", value));

        return this;
    }
    /**
     * Getter for the indicator Up Series.
     */
    public com.anychart.core.stock.series.Base upSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".upSeries()");
    }
    /**
     * Setter for the indicator Up Series.
     */
    public com.anychart.core.stock.indicators.Aroon upSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".upSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Up Series.
     */
    public com.anychart.core.stock.indicators.Aroon upSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".upSeries(%s);", wrapQuotes(type)));

        return this;
    }

}