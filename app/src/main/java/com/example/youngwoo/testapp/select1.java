package com.example.youngwoo.testapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 혜림 on 2018-06-08.
 */
public class select1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.select1);


        final Button btn[] = new Button[5];
        Integer[] numBtnIDs = { R.id.one, R.id.two, R.id.three,
                R.id.four, R.id.five};

        for(int i = 0; i < 5; i++){
            btn[i] = (Button) findViewById(numBtnIDs[i]);
        }

        TextView tv=findViewById(R.id.tv);

        Intent inIntent = getIntent();
        final String Menu;
        Menu=inIntent.getStringExtra("menu");
        tv.setText(Menu);
        switch(Menu){
            case "구학":
                Intent intent = new Intent(getApplicationContext(), select2.class);
                intent.putExtra("식당", "구학");
                startActivity(intent);
                break;

            case "신학":
                Intent intent2 = new Intent(getApplicationContext(), select2.class);
                intent2.putExtra("식당", "신학");
                startActivity(intent2);

                break;

            case "돌집":
                Intent intent3 = new Intent(getApplicationContext(), select2.class);
                intent3.putExtra("식당", "돌집");
                startActivity(intent3);
                break;

            case "무한리필":
                tv.setText(Menu);
                btn[0].setText("무한돈"); btn[1].setText("삼겹싸롱"); btn[2].setText("엉터리생고기");
                btn[3].setText("1988고기불패"); btn[4].setText("고소한우");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;

            case "스테이크&육회":
                tv.setText(Menu);

                btn[0].setText("육회브라더스"); btn[1].setText("스테이크팩토리"); btn[2].setText("온더블랙");
                btn[3].setText("2046 팬 스테이크"); btn[4].setText("필플레이트");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;

            case "인분고깃집":
                tv.setText(Menu);
                btn[0].setText("모름지기"); btn[1].setText("7u"); btn[2].setText("빼돌린 뒷고기");
                btn[3].setText("하남돼지"); btn[4].setText("숯불애");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;

            case "라멘":
                tv.setText(Menu);
                btn[0].setText("호메이켄"); btn[1].setText("아오리라멘"); btn[2].setText("오이시라멘");
                btn[3].setText("하코네제면소"); btn[4].setText("히노아지");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;

            case "스시&규카츠":
                tv.setText(Menu);
                btn[0].setText("료우시"); btn[1].setText("초밥가게"); btn[2].setText("연어바치");
                btn[3].setText("이자와규카츠"); btn[4].setText("정희옥스시");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;

            case "덮밥":
                tv.setText(Menu);
                btn[0].setText("키햐아"); btn[1].setText("교토돈부리"); btn[2].setText("마마돈");
                btn[3].setText("겐야"); btn[4].setText("골목 끝에 서울집");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;


            case "돈까스":
                tv.setText(Menu);
                btn[0].setText("장수왕돈까스"); btn[1].setText("은화수 식당"); btn[2].setText("모리돈까스");
                btn[3].setText("바싹돈까스"); btn[4].setText("아카렌");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;

            case "파스타&리조또":
                tv.setText(Menu);
                btn[0].setText("라운지 오"); btn[1].setText("마린파스타"); btn[2].setText("컨트리맨즈");
                btn[3].setText("엣홈"); btn[4].setText("서가앤쿡");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "피자":
                tv.setText(Menu);
                btn[0].setText("피자마루"); btn[1].setText("미스터피자"); btn[2].setText("피자몰");
                btn[3].setText("LA피자"); btn[4].setText("파파존스");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "밥":
                tv.setText(Menu);
                btn[0].setText("서가네 불백"); btn[1].setText("옹헤야불백"); btn[2].setText("짚신");
                btn[3].setText("레츠리너"); btn[4].setText("곁집");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "면":
                tv.setText(Menu);
                btn[0].setText("본가네밀면"); btn[1].setText("부경밀면"); btn[2].setText("조선칼국수");
                btn[3].setText("한울타리분식"); btn[4].setText("얼큰이칼국수");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "탕":
                tv.setText(Menu);
                btn[0].setText("박가부대찌개"); btn[1].setText("진미뼈다귀"); btn[2].setText("큰집국밥");
                btn[3].setText("누리마을"); btn[4].setText("청춘식당");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "길거리음식":
                tv.setText(Menu);
                btn[0].setText("대한꼬지"); btn[1].setText("타코비"); btn[2].setText("언더더경대");
                btn[3].setText("명랑핫도그"); btn[4].setText("앤티앤스");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "아이스크림&빵":
                tv.setText(Menu);
                btn[0].setText("빅다방"); btn[1].setText("설빙"); btn[2].setText("모던테이블");
                btn[3].setText("더블스윗"); btn[4].setText("빵은이지비아");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "인스타갬성 카페":
                tv.setText(Menu);
                btn[0].setText("카페안"); btn[1].setText("딜라잇식스"); btn[2].setText("너에게꽃이다");
                btn[3].setText("카페아정원"); btn[4].setText("라드커피");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "가성비":
                tv.setText(Menu);
                btn[0].setText("천탁"); btn[1].setText("고려왕대포"); btn[2].setText("아맛나");
                btn[3].setText("2000냥포차"); btn[4].setText("오술차");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "인스타갬성★":
                tv.setText(Menu);
                btn[0].setText("만만코코로"); btn[1].setText("경성주막1929"); btn[2].setText("접대");
                btn[3].setText("키친우"); btn[4].setText("퍼지네이블");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "핫플":
                tv.setText(Menu);
                btn[0].setText("만만코코로"); btn[1].setText("897야시장"); btn[2].setText("땡초우동");
                btn[3].setText("불난술집"); btn[4].setText("Thursday party");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "중식":
                tv.setText(Menu);
                btn[0].setText("하오하오"); btn[1].setText("중찬"); btn[2].setText("니뽕내뽕");
                btn[3].setText("차이쿡"); btn[4].setText("초심");

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                btn[4].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[4].getText());
                        startActivity(intent);
                    }
                });
                break;
            case "패스트푸드":
                tv.setText(Menu);
                btn[0].setText("서브웨이"); btn[1].setText("농부네꼬꼬"); btn[2].setText("하이파이브");
                btn[3].setText("엘부리또");btn[4].setVisibility(View.INVISIBLE);

                btn[0].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[0].getText());
                        startActivity(intent);
                    }
                });
                btn[1].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[1].getText());
                        startActivity(intent);
                    }
                });
                btn[2].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[2].getText());
                        startActivity(intent);
                    }
                });
                btn[3].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);
                        intent.putExtra("식당", btn[3].getText());
                        startActivity(intent);
                    }
                });
                break;
        }
    }
}