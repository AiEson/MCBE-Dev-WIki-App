package com.wvt.mcbewiki.others;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class WikiUtil {

    public static JSONObject getPageData(String pageName, String otherPostValue, boolean hasOtherValue) throws JSONException {
        JSONObject jsonObject = null;
        String values = "action=query&format=json&formatversion=2&prop=revisions&titles=" + pageName + "&rvprop=content&rvparse=true";
        if (hasOtherValue) values += "&" + otherPostValue;
        jsonObject = new JSONObject(HttpUtil.doPost(FinalValue.wikiApiUrl, values));
        return jsonObject;
    }
}
