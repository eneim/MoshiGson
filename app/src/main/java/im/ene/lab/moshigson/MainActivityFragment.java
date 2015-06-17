package im.ene.lab.moshigson;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import com.bluelinelabs.logansquare.LoganSquare;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.Header;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.InjectView;
import im.ene.lab.moshigson.api.Client;
import im.ene.lab.moshigson.api.model.User;
import im.ene.lab.moshigson.util.JsonUtil;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @InjectView(R.id.text)
    TextView mText;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.inject(this, view);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Client.user(1, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                mText.setText(responseString + "\n" + throwable.getMessage());
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                try {
                    updateResult(responseString);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private int MAX_TEST_NUMBER = 5000;

    private void updateResult(String response) throws IOException {
        StringBuilder result = new StringBuilder();
        long start;

        result.append(System.lineSeparator())
                .append("Logan Square: ");
        start = System.nanoTime();

        for (int i = 0; i < MAX_TEST_NUMBER; i++) {
            LoganSquare.parse(response, User.class);
        }

        result.append((System.nanoTime() - start) / 1000000)
                .append("ms");

        result.append(System.lineSeparator()).append("Moshi: ");
        start = System.nanoTime();
        for (int i = 0; i < MAX_TEST_NUMBER; i++) {
            User.moshi.fromJson(response);
        }

        result.append((System.nanoTime() - start) / 1000000)
                .append("ms");

        result.append(System.lineSeparator())
                .append("Gson default: ");
        start = System.nanoTime();
        for (int i = 0; i < MAX_TEST_NUMBER; i++) {
            JsonUtil.defaultGson().fromJson(response, User.class);
        }

        result.append((System.nanoTime() - start) / 1000000)
                .append("ms");

        result.append(System.lineSeparator())
                .append("Gson expose: ");
        start = System.nanoTime();

        for (int i = 0; i < MAX_TEST_NUMBER; i++) {
            JsonUtil.exposeGson().fromJson(response, User.class);
        }

        result.append((System.nanoTime() - start) / 1000000)
                .append("ms");

        mText.setText(result.toString());
    }

}
