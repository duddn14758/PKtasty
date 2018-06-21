package com.example.youngwoo.testapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.content.Intent.ACTION_VIEW;

/**
 * Created by 혜림 on 2018-06-08.
 */

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Intent.ACTION_VIEW;

/**
 * Created by 혜림 on 2018-06-08.
 */

public class select2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select2);


        Button map = findViewById(R.id.map);
        ImageButton Back = findViewById(R.id.back);
        ImageView iv = (ImageView) findViewById(R.id.rest);

        Intent inIntent = getIntent();
        final String Resta = inIntent.getStringExtra("식당");

        Back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        switch (Resta) {
            case "구학":
                iv.setImageResource(R.drawable.h1);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;

            case "신학":
                iv.setImageResource(R.drawable.h2);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;

            case "돌집":
                iv.setImageResource(R.drawable.h3);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "무한돈":
                iv.setImageResource(R.drawable.g11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "삼겹싸롱":
                iv.setImageResource(R.drawable.g12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "엉터리생고기":
                iv.setImageResource(R.drawable.g13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "1988고기불패":
                iv.setImageResource(R.drawable.g14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "고소한우":
                iv.setImageResource(R.drawable.g15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "육회브라더스":
                iv.setImageResource(R.drawable.g21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "스테이크팩토리":
                iv.setImageResource(R.drawable.g22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "온더블랙":
                iv.setImageResource(R.drawable.g23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "2046 팬 스테이크":
                iv.setImageResource(R.drawable.g24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;

            case "모름지기":
                iv.setImageResource(R.drawable.g31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "7u":
                iv.setImageResource(R.drawable.g32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "빼돌린 뒷고기":
                iv.setImageResource(R.drawable.g33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "하남돼지":
                iv.setImageResource(R.drawable.g34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "숯불애":
                iv.setImageResource(R.drawable.g35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "호메이켄":
                iv.setImageResource(R.drawable.j11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "아오리라멘":
                iv.setImageResource(R.drawable.j12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "오이시라멘":
                iv.setImageResource(R.drawable.j13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "하코네제면소":
                iv.setImageResource(R.drawable.j14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "히노아지":
                iv.setImageResource(R.drawable.j15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "료우시":
                iv.setImageResource(R.drawable.j21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "초밥가게":
                iv.setImageResource(R.drawable.j22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "연어바치":
                iv.setImageResource(R.drawable.j23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "이자와규카츠":
                iv.setImageResource(R.drawable.j24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "키햐아":
                iv.setImageResource(R.drawable.j31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "교토돈부리":
                iv.setImageResource(R.drawable.j32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "마마돈":
                iv.setImageResource(R.drawable.j33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "겐야":
                iv.setImageResource(R.drawable.j34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "골목 끝에 서울집":
                iv.setImageResource(R.drawable.j35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "장수왕돈까스":
                iv.setImageResource(R.drawable.y11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "은화수 식당":
                iv.setImageResource(R.drawable.y12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "모리돈까스":
                iv.setImageResource(R.drawable.y13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "바싹돈까스":
                iv.setImageResource(R.drawable.y14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "아카렌":
                iv.setImageResource(R.drawable.y15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;

            case "라운지 오":
                iv.setImageResource(R.drawable.y21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "마린파스타":
                iv.setImageResource(R.drawable.y22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "컨트리맨즈":
                iv.setImageResource(R.drawable.y23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "엣홈":
                iv.setImageResource(R.drawable.y24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "서가앤쿡":
                iv.setImageResource(R.drawable.y25);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;

            case "피자마루":
                iv.setImageResource(R.drawable.y31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "미스터피자":
                iv.setImageResource(R.drawable.y32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "피자몰":
                iv.setImageResource(R.drawable.y33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "LA피자":
                iv.setImageResource(R.drawable.y34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "파파존스":
                iv.setImageResource(R.drawable.y35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "서가네 불백":
                iv.setImageResource(R.drawable.k11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "옹헤야불백":
                iv.setImageResource(R.drawable.k12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "짚신":
                iv.setImageResource(R.drawable.k13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "레츠리너":
                iv.setImageResource(R.drawable.k14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "곁집":
                iv.setImageResource(R.drawable.k15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "본가네밀면":
                iv.setImageResource(R.drawable.k21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "부경밀면":
                iv.setImageResource(R.drawable.k22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "조선칼국수":
                iv.setImageResource(R.drawable.k23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "한울타리분식":
                iv.setImageResource(R.drawable.k24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "얼큰이칼국수":
                iv.setImageResource(R.drawable.k25);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "박가부대찌개":
                iv.setImageResource(R.drawable.k31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "진미뼈다귀":
                iv.setImageResource(R.drawable.k32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "큰집국밥":
                iv.setImageResource(R.drawable.k33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "누리마을":
                iv.setImageResource(R.drawable.k34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "청춘식당":
                iv.setImageResource(R.drawable.k35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "대한꼬지":
                iv.setImageResource(R.drawable.i11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "타코비":
                iv.setImageResource(R.drawable.i12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "언더더경대":
                iv.setImageResource(R.drawable.i13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "명랑핫도그":
                iv.setImageResource(R.drawable.i14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "앤티앤스":
                iv.setImageResource(R.drawable.i15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;

            case "빅다방":
                iv.setImageResource(R.drawable.i21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "설빙":
                iv.setImageResource(R.drawable.i22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "모던테이블":
                iv.setImageResource(R.drawable.i23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "더블스윗":
                iv.setImageResource(R.drawable.i24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "빵은이지비아":
                iv.setImageResource(R.drawable.i25);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "카페안":
                iv.setImageResource(R.drawable.i31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "딜라잇식스":
                iv.setImageResource(R.drawable.i32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "너에게꽃이다":
                iv.setImageResource(R.drawable.i33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "카페아정원":
                iv.setImageResource(R.drawable.i34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://goo" +
                                "" +
                                "gle.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "라드커피":
                iv.setImageResource(R.drawable.i35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "하오하오":
                iv.setImageResource(R.drawable.c11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "중찬":
                iv.setImageResource(R.drawable.c12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "니뽕내뽕":
                iv.setImageResource(R.drawable.c13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "차이쿡":
                iv.setImageResource(R.drawable.c14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "초심":
                iv.setImageResource(R.drawable.c15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "서브웨이":
                iv.setImageResource(R.drawable.f1);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "농부네꼬꼬":
                iv.setImageResource(R.drawable.f2);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "하이파이브":
                iv.setImageResource(R.drawable.f3);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "엘부리또":
                iv.setImageResource(R.drawable.f4);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "천탁":
                iv.setImageResource(R.drawable.s11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "고려왕대포":
                iv.setImageResource(R.drawable.s12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "아맛나":
                iv.setImageResource(R.drawable.s13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "2000냥포차":
                iv.setImageResource(R.drawable.s14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "오술차":
                iv.setImageResource(R.drawable.s15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


            case "만만코코로":
                iv.setImageResource(R.drawable.s21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "경성주막1929":
                iv.setImageResource(R.drawable.s22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "접대":
                iv.setImageResource(R.drawable.s23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "키친우":
                iv.setImageResource(R.drawable.s24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "퍼지네이블":
                iv.setImageResource(R.drawable.s25);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;

            case "발빠닭":
                iv.setImageResource(R.drawable.s31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "897야시장":
                iv.setImageResource(R.drawable.s32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "땡초우동":
                iv.setImageResource(R.drawable.s33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "불난술집":
                iv.setImageResource(R.drawable.s34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;
            case "Thursday party":
                iv.setImageResource(R.drawable.s35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
                break;


        }
    }
}