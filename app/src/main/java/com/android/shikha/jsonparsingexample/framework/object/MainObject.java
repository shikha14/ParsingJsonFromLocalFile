package com.android.shikha.jsonparsingexample.framework.object;

/**
 * Created by shikha on 26/7/15.
 */
public class MainObject {

    private  ResultObject[] results;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResultObject[] getResults() {

        return results;
    }

    public void setResults(ResultObject[] results) {
        this.results = results;
    }
}
