package im.ene.lab.moshigson.api;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

/**
 * Created by eneim on 6/17/15.
 */
public class Client {

    private static final String ENDPOINT = "http://jsonplaceholder.typicode.com";

    private static final AsyncHttpClient client = new AsyncHttpClient();

    public static void user(int id, TextHttpResponseHandler handler) {
        client.get(get("/users/" + id), handler);
    }

    private static String get(String path) {
        return ENDPOINT + path;
    }
}
