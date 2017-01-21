package kr.co.novacode.mycodinglayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);

        // 상단 레이아웃 구현
        LinearLayout topLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        // android:layout_weight="1"
        // layout_ 로 시작하는 파라미터는 params 에서 처리한다.
        params.weight = 1;
        topLayout.setOrientation(LinearLayout.VERTICAL);
        topLayout.setBackgroundColor(R.color.colorBackBlue);
        topLayout.setLayoutParams(params);
        mainLayout.addView(topLayout);

        //상단 레이아웃 > 이미지 로고 구현
        ImageView logoImageView = new ImageView(this);
        params = new LinearLayout.LayoutParams(
                80,
                80
        );
        // android:layout_gravity="center"
        params.gravity = Gravity.CENTER;
        // android:layout_marginTop="110dp"
        params.topMargin = 110;
        logoImageView.setImageResource(R.drawable.square_logo);
        logoImageView.setLayoutParams(params);
        topLayout.addView(logoImageView);

        // 상단 레이아웃 > 어플명 구현
        TextView titleTextView = new TextView(this);
        params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        // android:layout_gravity="center"
        params.gravity = Gravity.CENTER;
        // android:layout_marginTop="40dp"
        params.topMargin = 40;
        titleTextView.setText(R.string.application_name);
        titleTextView.setTextSize(70);
        titleTextView.setTextColor(R.color.colorFontWhite);
        titleTextView.setLayoutParams(params);
        topLayout.addView(titleTextView);

        // 상단 레이아웃 > 어플 설명
        TextView descTextView = new TextView(this);
        params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        // android:layout_gravity="center"
        params.gravity = Gravity.CENTER;
        // android:layout_marginTop="40dp"
        params.topMargin = 10;
        descTextView.setText(R.string.application_desc);
        descTextView.setTextSize(30);
        descTextView.setTextColor(R.color.colorFontWhite);
        descTextView.setLayoutParams(params);
        topLayout.addView(descTextView);






        /*
37         <TextView
38             android:id="@+id/textView02"
39             android:layout_width="wrap_content"
40             android:layout_height="wrap_content"
41             android:text="@string/application_desc"
42             android:textColor="@color/colorFontWhite"
43             android:layout_gravity="center"
44             android:layout_marginTop="10dp"
45             android:textSize="30dp" />








        // 바탕 레이아웃 설계
        RelativeLayout mainLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        mainLayout.setBackgroundColor(R.color.colorAccent);
        mainLayout.setPadding(10, 10, 10, 10);
        mainLayout.setLayoutParams(params);

        //타이틀 레이아웃
        TextView titleTextView = new TextView(this);
        params.width = RelativeLayout.LayoutParams.MATCH_PARENT;
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        params.topMargin = 20;
        titleTextView.setGravity(View.TEXT_ALIGNMENT_CENTER);
        titleTextView.setText("식당 찾기 도우미");
        titleTextView.setTextColor(Color.parseColor("#ffffffff"));
        titleTextView.setTextSize(24);

        mainLayout.addView(titleTextView);


                setContentView(mainLayout);
        */

    }
}
