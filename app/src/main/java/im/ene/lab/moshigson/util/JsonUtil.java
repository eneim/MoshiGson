package im.ene.lab.moshigson.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.moshi.Moshi;

/**
 * Created by eneim on 6/17/15.
 */
public class JsonUtil {

    public static Gson defaultGson() {
        return new GsonBuilder().create();
    }

    public static Gson exposeGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    public static Moshi getMoshi() {
        return new Moshi.Builder().build();
    }
}
