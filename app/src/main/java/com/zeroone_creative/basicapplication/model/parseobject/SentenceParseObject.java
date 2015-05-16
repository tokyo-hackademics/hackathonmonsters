package com.zeroone_creative.basicapplication.model.parseobject;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by shunhosaka on 15/05/16.
 */
@ParseClassName("Sentence")
public class SentenceParseObject extends ParseObject {

    public String getId() {
        return getString("id");
    }

    public String getBody() {
        return getString("body");
    }

    public int getLevel() {
        return getInt("level");
    }

    public String getString() {
        return getString("lang");
    }

}
