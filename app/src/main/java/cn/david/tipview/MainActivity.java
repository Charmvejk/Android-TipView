package cn.david.tipview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.david.tipview.view.TipView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TipView tipView = findViewById(R.id.tip_view);
        tipView.setTipList(generateTips());
    }

    private List<String> generateTips() {
        List<String> tips = new ArrayList<>();
        for (int i = 100; i < 120; i++) {
            tips.add(TIP_PREFIX + i);
        }
        return tips;
    }

    private static final String TIP_PREFIX = "this is tip No.";
}
