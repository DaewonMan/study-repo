package org.androidtown.study21;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by DaewonMan on 2016-08-01.
 */
public class SongItem {
    Context mContext;
    public String[] names = {"씨스타", "현아", "다비치","걸스데이", "인피니트"};

    public SongItem() {

    }
    public SongItem(Context context) {
        mContext = context;
    }
    public LinearLayout layoutDeclare(int position) {
        LinearLayout horLayout = new LinearLayout(mContext); // 평행 레이아웃 생성
        horLayout.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        LinearLayout verLayout = new LinearLayout(mContext); // 수직 레이아웃 생성
        verLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        ImageView imageView = new ImageView(mContext); // 이미지 출력
        imageView.setImageResource(R.drawable.face03);
        horLayout.addView(imageView, param);

        TextView nameView = new TextView(mContext); // 큰 가수명
        nameView.setText(names[position]);
        nameView.setTextColor(Color.BLUE);
        nameView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        verLayout.addView(nameView, params);

        TextView ageView = new TextView(mContext); // 작은 가수명
        ageView.setText(names[position]);
        ageView.setTextColor(Color.RED);
        ageView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 24);
        verLayout.addView(ageView, params);

        horLayout.addView(verLayout, param); // 수평레이아웃에 수직레이아웃 삽입

        return horLayout;
    }


}
