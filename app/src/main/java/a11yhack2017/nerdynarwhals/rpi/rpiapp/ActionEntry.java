package a11yhack2017.nerdynarwhals.rpi.rpiapp;

import android.util.Log;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017-06-03.
 */

@IgnoreExtraProperties
public class ActionEntry {
    public String uid;
    public String timestamp_start;
    public String timestamp_end;
    public String action_text;
    public String action_type;

    public ActionEntry() {

    }
    public ActionEntry(String uid, String timestamp_start, String timestamp_end, String action_text, String action_type) {
        this.uid = uid;
        this.timestamp_start = timestamp_start;
        this.timestamp_end = timestamp_end;
        this.action_text = action_text;
        this.action_type = action_type;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("timestamp_start", timestamp_start);
        result.put("timestamp_end", timestamp_end);
        result.put("action_text", action_text);
        result.put("action_type", action_type);
        return result;
    }
}
