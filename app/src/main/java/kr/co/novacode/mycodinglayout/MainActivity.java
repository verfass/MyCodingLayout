package kr.co.novacode.mycodinglayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
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

        // 하단 레이아웃 생성
        LinearLayout bottomLayout = new LinearLayout(this);
        params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        params.weight = 2;
        bottomLayout.setOrientation(LinearLayout.VERTICAL);
        bottomLayout.setBackgroundColor(R.color.colorBackWhite);
        bottomLayout.setLayoutParams(params);
        mainLayout.addView(bottomLayout);

        // 하단 레이아웃 버튼01
        Button button01 = new Button(this);
        params = new LinearLayout.LayoutParams(
                700,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.topMargin = 30;
        params.gravity = Gravity.CENTER;
        button01.setText("Create Account");
        button01.setTextSize(25);
        button01.setTextColor(R.color.colorBtnFontWhite);
        button01.setBackgroundColor(R.color.colorBtnBlue);
        button01.setPadding(15, 15, 15, 15);
        button01.setAllCaps(false);
        button01.setLayoutParams(params);
        bottomLayout.addView(button01);

        // 하단 레이아웃 버튼02
        Button button02 = new Button(this);
        params = new LinearLayout.LayoutParams(
                700,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.topMargin = 30;
        params.gravity = Gravity.CENTER;
        button02.setText("Create Account");
        button02.setTextSize(25);
        button02.setTextColor(R.color.colorBtnFontBlue);
        button02.setBackgroundColor(R.color.colorBtnWhite);
        button02.setPadding(15, 15, 15, 15);
        button02.setAllCaps(false);
        button02.setLayoutParams(params);
        bottomLayout.addView(button02);

    }
}
