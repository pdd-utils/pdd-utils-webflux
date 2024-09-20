package com.pdd.pop.sdk.message.model;

/**
 * @author likun 2019/10/15
 */
public class TimeMetrics {
    private long count;
    private long max;
    private long min;
    private double mean;
    private double median;
    private double thPercentile75;
    private double thPercentile95;
    private double thPercentile99;
    private double meanRate;

    private double oneMinuteRate;

    public double getOneMinuteRate() {
        return oneMinuteRate;
    }

    public void setOneMinuteRate(double oneMinuteRate) {
        this.oneMinuteRate = oneMinuteRate;
    }

    public double getMeanRate() {
        return meanRate;
    }

    public void setMeanRate(double meanRate) {
        this.meanRate = meanRate;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getThPercentile75() {
        return thPercentile75;
    }

    public void setThPercentile75(double thPercentile75) {
        this.thPercentile75 = thPercentile75;
    }

    public double getThPercentile95() {
        return thPercentile95;
    }

    public void setThPercentile95(double thPercentile95) {
        this.thPercentile95 = thPercentile95;
    }

    public double getThPercentile99() {
        return thPercentile99;
    }

    public void setThPercentile99(double thPercentile99) {
        this.thPercentile99 = thPercentile99;
    }
}
