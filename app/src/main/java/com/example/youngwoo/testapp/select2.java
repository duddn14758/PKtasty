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
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=ad545e3e1c5dd81cbdc8c91d73d4ec43&pinId=38014713&lat=2655644272b2199ecec47b1252c5e95b&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "삼겹싸롱":
                iv.setImageResource(R.drawable.g12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://m.map.naver.com/?mapmode=0&lng=6a4e41deaaa8fcc16c1e121009b46ac7&pinId=16852997&pinType=site&lat=535b0f64f1654bd41f186433aa89a458&dlevel=11&enc=b64"));
                        startActivity(intent);
                    }
                });
                break;
            case "엉터리생고기":
                iv.setImageResource(R.drawable.g13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=fac5f8382bd23c884666359e7108108d&pinId=37765798&lat=52e361b264fbb1180ff90312926d3686&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "1988고기불패":
                iv.setImageResource(R.drawable.g14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=44901796b0c03d930a365f10004baba1&pinId=38547557&lat=bc96528415a1ca937c085ccac2933e6a&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "고소한우":
                iv.setImageResource(R.drawable.g15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=44901796b0c03d930a365f10004baba1&pinId=38547557&lat=bc96528415a1ca937c085ccac2933e6a&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;


            case "육회브라더스":
                iv.setImageResource(R.drawable.g21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=728c1ddb7efe09c7977ddac21a37974f&pinId=1094042424&lat=221b41e4b96669cbfdac48d0805d429e&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "스테이크팩토리":
                iv.setImageResource(R.drawable.g22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=d416e2940f0f87bdacae1e42386908cc&pinId=34678353&lat=3c92e8b7e08ba621b713d5176dfc681f&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "온더블랙":
                iv.setImageResource(R.drawable.g23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=600c97421de9891c99081b78b84dd1af&pinId=38427532&lat=141d1b85732a9613e3830920092a2afe&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "2046 팬 스테이크":
                iv.setImageResource(R.drawable.g24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=74e49d738762316b9c9a85cd5b61df6e&pinId=36528828&lat=d9bad4c8b45814ab17bfb4ab541b3b87&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;

            case "모름지기":
                iv.setImageResource(R.drawable.g31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=56b8dc531dc3d0a2f3e243d84c4f47bf&pinId=37350380&lat=486da19bca1beb07103751d20fa07f4b&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "7u":
                iv.setImageResource(R.drawable.g32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mid=bl0118022502"));
                        startActivity(intent);
                    }
                });
                break;
            case "빼돌린 뒷고기":
                iv.setImageResource(R.drawable.g33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=c94d63ce53e71504e2203f6790f395a3&pinId=37915720&lat=42b8fa2733baf6d3780091faa3125a95&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "하남돼지":
                iv.setImageResource(R.drawable.g34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=0662b5389c40b5e89e1cedf1f98c3a0d&pinId=13411416&lat=2f0655207834c47cfcb5a1fd2d50837f&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "숯불애":
                iv.setImageResource(R.drawable.g35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=7036590454b2401202394b18f1043f0a&pinId=21194544&lat=5f9153e05f5532d89b578eb6b1854ed9&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;


            case "호메이켄":
                iv.setImageResource(R.drawable.j11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=c1d891cc6026b5cfa0f4e5f3b84a147c&pinId=13587325&lat=6daf54daa47b8faad369ce8bbf65ce64&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "아오리라멘":
                iv.setImageResource(R.drawable.j12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=225101737175e74f4daae39ba4e62c3f&pinId=1009151675&lat=ee78a31fca0be5d22a9233893cf36a77&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "오이시라멘":
                iv.setImageResource(R.drawable.j13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mid=bl0123449657"));
                        startActivity(intent);
                    }
                });
                break;
            case "하코네제면소":
                iv.setImageResource(R.drawable.j14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=81735e6124c70003a0ffffb270836586&title=%ED%95%98%EC%BD%94%EB%84%A4&pinId=31288109&pinType=site&dlevel=10&lat=8769958a5ab2b1972b373c4503178bde&enc=
"));
                        startActivity(intent);
                    }
                });
                break;
            case "히노아지":
                iv.setImageResource(R.drawable.j15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=d29e3f63570aee1cf245f9fb570a0ee6&pinId=16541564&lat=60b2884ec13bf77661891c0624b2f628&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;


            case "료우시":
                iv.setImageResource(R.drawable.j21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=98a51482252fc567e6802cd213e0927e&pinId=35149882&lat=63fe2441a7524e45123a2657e5758730&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "초밥가게":
                iv.setImageResource(R.drawable.j22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=98a51482252fc567e6802cd213e0927e&pinId=35149882&lat=63fe2441a7524e45123a2657e5758730&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "연어바치":
                iv.setImageResource(R.drawable.j23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=85255bb5ee177cb11e1622ad14c656d6&pinId=1386348998&pinType=site&lat=85fc143062661b81525a7ef023afe532&dlevel=11&enc=b64
"));
                        startActivity(intent);
                    }
                });
                break;
            case "이자와규카츠":
                iv.setImageResource(R.drawable.j24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mid=bl0132374798"));
                        startActivity(intent);
                    }
                });
                break;


            case "키햐아":
                iv.setImageResource(R.drawable.j31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=2e8c1093419cc678c64bf9e67226d47b&pinId=201824497&pinType=site&lat=679681818eb4f0f6253e17dc6b0cfcb0&dlevel=11&enc=b64
"));
                        startActivity(intent);
                    }
                });
                break;
            case "교토돈부리":
                iv.setImageResource(R.drawable.j32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=27985d668bebe81dab7e0f14fb4d4bc4&pinId=38548731&pinType=site&lat=ae5d71adf18222a6834c1f2645f69879&dlevel=11&enc=b64
"));
                        startActivity(intent);
                    }
                });
                break;
            case "마마돈":
                iv.setImageResource(R.drawable.j33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=6209d112288d55ae4c3ab2289f93f78b&pinId=37755786&lat=69763ceb54a7d4f08b1cbb2682e14bcd&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "겐야":
                iv.setImageResource(R.drawable.j34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=6613f3f78856409128b25c3a7f795c1a&pinId=1755601282&lat=37520112f78aa245365bb3db8e356aff&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "골목 끝에 서울집":
                iv.setImageResource(R.drawable.j35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=ff5d1b6fc96a8c8691dd58f38fffef28&pinId=38562842&lat=890b47abba5de36a4ba0b45a11ceebfc&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;


            case "장수왕돈까스":
                iv.setImageResource(R.drawable.y11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=4f68fef22cccb30bf7dc76a98f168956&pinId=21509937&lat=dffc7eb52b0a1be5c288fcfb5814494a&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "은화수 식당":
                iv.setImageResource(R.drawable.y12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=9db24a770c70ae0aff3d3a91645f1739&pinId=35787658&lat=dffb752f87df0a4d4ec197b0ac402db8&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "모리돈까스":
                iv.setImageResource(R.drawable.y13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=402dd8f7681c016cb836cabafb20d899&pinId=38583671&pinType=site&lat=547adabf44d1965dba0d01613fb855d8&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "바싹돈까스":
                iv.setImageResource(R.drawable.y14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&pinId=34151477&pinType=site&lng=f00a31eac9e075439fdfc098272bd782&lat=185401b8befdea0ddd71e835dbf6b732&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "아카렌":
                iv.setImageResource(R.drawable.y15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=7d578284188f213d7f2d2d0029042f7b&pinId=851225483&lat=194a46295151fa931ca67ce6a71be199&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;

            case "라운지 오":
                iv.setImageResource(R.drawable.y21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=8dc5c758812d2b1cc73a5b9da7cb5a44&pinId=20985815&lat=30019f20c71c1089893ad0ade042f973&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "마린파스타":
                iv.setImageResource(R.drawable.y22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=f8c5e0ba36e98f479721d5c14ef87376&pinId=487865842&pinType=site&lat=5e38ef490c3a99053a83f51bd518786f&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "컨트리맨즈":
                iv.setImageResource(R.drawable.y23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=4f68ae57680c43b298fb1c82864e388b&pinId=36932826&pinType=site&lat=30b557b3dbe3d86f9188eeeef7c07c58&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "엣홈":
                iv.setImageResource(R.drawable.y24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=8ab372de87393662da6d660a6b11bed4&pinId=13573910&pinType=site&lat=abf67fe3968333ac699157c618969a9b&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "서가앤쿡":
                iv.setImageResource(R.drawable.y25);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=194c87a6423a9ffd0d08b1d14efd54d4&pinId=20469362&lat=8f19f48ff86eecd674c1377abf42142b&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;

            case "피자마루":
                iv.setImageResource(R.drawable.y31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=ddb6dce10933c021f51969485a151cfe&pinId=35645897&lat=cf22ccc12a7833d632f191e211bee1e8&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "미스터피자":
                iv.setImageResource(R.drawable.y32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=a81b00178e17bae4217a5b469e034ded&pinId=11826535&lat=0ad734c8e054527753374909e5cbf989&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "피자몰":
                iv.setImageResource(R.drawable.y33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=905950a7ce182b6cf39ec644e52add74&pinId=36538242&lat=4fef762b9a3fe9cf9986792c1e248160&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "LA피자":
                iv.setImageResource(R.drawable.y34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=851dabd97976035c0e471ebac69e1e98&pinId=1071540761&lat=c90bcb0bec9099e1bf508a9afc2f8a8f&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "파파존스":
                iv.setImageResource(R.drawable.y35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=f96f8b857de9dd8a99303681bca1919d&pinId=752963801&lat=8b44f4f1a7e30057f66e486e1180f886&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;


            case "서가네 불백":
                iv.setImageResource(R.drawable.k11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=9dd8366a72fa57b5323ecb90aef0ab31&title=%EC%84%9C%EA%B0%80%EB%84%A4%EC%99%95%EB%8F%BC%EC%A7%80%EA%B5%AD%EB%B0%A5&pinId=1357244850&dlevel=10&lat=64f6ff45a351f2f42f04aeb9a90d99e7&enc=&pinType=site&amp%3B%C3%AB%C2%8F%C2%BC%C3%AC%C2%A7%C2%80%C3%AB%C2%B6%C2%88%C3%AB%C2%B0%C2%B1=\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "옹헤야불백":
                iv.setImageResource(R.drawable.k12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=94311e4ea4f618f529b91c627210ba75&title=%EC%97%90%EB%9B%B0%EB%93%9C%ED%95%98%EC%9A%B0%EC%8A%A4%EA%B2%BD%EC%84%B1%EB%8C%80%EC%A0%90&pinId=19657998&pinType=site&dlevel=10&lat=5aa02cc5d16b93bba40f3aa8d6bb174d&enc=\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "짚신":
                iv.setImageResource(R.drawable.k13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=7ce6e8304139762f225a43f5a7edc796&title=%EC%A7%9A%EC%8B%A0%EB%A7%A4%EC%9A%B4%EA%B0%88%EB%B9%84%EC%B0%9C+%EA%B2%BD%EC%84%B1%EB%8C%80%EC%A0%90&pinId=32964122&dlevel=10&lat=390dd2cfc2fe3146a107ff5a33e66bbd&enc=&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "레츠리너":
                iv.setImageResource(R.drawable.k14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse(" https://map.naver.com/?mapmode=0&lng=453b98540c15a0c2bd54430b1c5d5a26&title=%EB%A0%88%EC%B8%A0%EB%A6%AC%EB%84%88&pinId=1045324942&dlevel=10&lat=54929191ea6a8364cf56e6ec762c4c70&enc=&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "곁집":
                iv.setImageResource(R.drawable.k15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=cf87c3e2a8f5fefcde7ba3720d4bb91d&title=%EA%B3%81%EC%A7%91&pinId=1998680892&dlevel=10&lat=851081537dba3a005309fa0a2583e1b6&enc=&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;


            case "본가네밀면":
                iv.setImageResource(R.drawable.k21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=9b23efa040be3832e23bec1f90132c06&title=%EB%B3%B8%EA%B0%80%EA%B0%80%EC%95%BC%EB%B0%80%EB%A9%B4&pinId=16556743&pinType=site&dlevel=10&lat=51d731fc1a84040a68ba7a4e33dbe6e5&enc=\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "부경밀면":
                iv.setImageResource(R.drawable.k22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=4bf0670cc22383159b0d74fb36d6b497&pinId=1674632763&lat=fa49f29161fb045552756d125476c565&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "조선칼국수":
                iv.setImageResource(R.drawable.k23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mid=bl0126006720"));
                        startActivity(intent);
                    }
                });
                break;
            case "한울타리분식":
                iv.setImageResource(R.drawable.k24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse(" https://map.naver.com/?mapmode=0&lng=5ebd0a56b16e9a30860bc36e204c7e17&pinId=36004159&lat=43c47d6cfac8011267759dab298cd7be&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "얼큰이칼국수":
                iv.setImageResource(R.drawable.k25);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse(" https://map.naver.com/?mapmode=0&lng=2219b1b139125c18121ea1a30249108f&pinId=37961903&pinType=site&lat=af101c865c49eba88a902de4182c9f11&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;


            case "박가부대찌개":
                iv.setImageResource(R.drawable.k31);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=d77d26cd792a9e907f8067410fa1d874&title=%EB%B0%95%EA%B0%80%EB%B6%80%EB%8C%80%EC%B0%8C%EA%B0%9C+%EB%B6%80%EC%82%B0%EA%B2%BD%EC%84%B1%EB%8C%80%EC%A0%90&pinId=36061139&dlevel=10&lat=ee606b95951aa6c86717d4746a0bd443&enc=&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "진미뼈다귀":
                iv.setImageResource(R.drawable.k32);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=917d1acc168543d660ba4792b63c6daa&pinId=37961860&lat=3ed7c3576fbe02ac9e99eefc87e53fd5&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "큰집국밥":
                iv.setImageResource(R.drawable.k33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse(" https://map.naver.com/?mapmode=0&lng=6d458eabdb6ae136bc5ee2ce5e16bedc&title=%ED%81%B0%EC%A7%91%EB%8F%BC%EC%A7%80%EA%B5%AD%EB%B0%A5&pinId=36632140&pinType=site&dlevel=10&lat=8e01f7ef71040358924d31c7851b53be&enc=\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "누리마을":
                iv.setImageResource(R.drawable.k34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=6d458eabdb6ae136bc5ee2ce5e16bedc&title=%ED%81%B0%EC%A7%91%EB%8F%BC%EC%A7%80%EA%B5%AD%EB%B0%A5&pinId=36632140&pinType=site&dlevel=10&lat=8e01f7ef71040358924d31c7851b53be&enc=\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "청춘식당":
                iv.setImageResource(R.drawable.k35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=59b497adcc7fc8c00447d61c4d3f6972&title=%EC%B2%AD%EC%B6%98%EC%8B%9D%EB%8B%B9&pinId=37965899&dlevel=10&lat=da779bfb50119074a806324838645fa2&enc=&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;


            case "대한꼬지":
                iv.setImageResource(R.drawable.i11);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=10bc5b71d295d2d773530b1c9e813173&pinId=1859773629&lat=1177f8b8f9070488c642344ac0b7481b&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "타코비":
                iv.setImageResource(R.drawable.i12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=622b98685e7ed8e419033a0c6a629f02&pinId=817347892&lat=91ab12ee91aef888e9facc585433e3be&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "언더더경대":
                iv.setImageResource(R.drawable.i13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=bf0ef341d00a3269d4ebbb0ee673252a&pinId=1887942003&lat=5e5a8039aa7141def3c2c5628e3e0333&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "명랑핫도그":
                iv.setImageResource(R.drawable.i14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=cad377e838623d3475a70f824038c287&pinId=38549338&lat=427f5f7d8d903874c9e4bf5d31c596ef&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "앤티앤스":
                iv.setImageResource(R.drawable.i15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=89cf83dd9b12ecbb129fd602a5f42268&pinId=604076317&pinType=site&lat=90d6f0c58286d214709502504c4dd331&dlevel=11&enc=b64
"));
                        startActivity(intent);
                    }
                });
                break;

            case "빅다방":
                iv.setImageResource(R.drawable.i21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=89b50a6d0cca782e680b74665f34a2c7&pinId=37392298&lat=fb6b0f8b0a07fcc3dd761bb6f920ac14&dlevel=11&enc=b64&pinType=site
"));
                        startActivity(intent);
                    }
                });
                break;
            case "설빙":
                iv.setImageResource(R.drawable.i22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=09d0daeba556535c3d305dd439d82a7a&pinId=36655661&pinType=site&lat=74bf58749f9ca4bd8586efe816564397&dlevel=11&enc=b64
"));
                        startActivity(intent);
                    }
                });
                break;
            case "모던테이블":
                iv.setImageResource(R.drawable.i23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=15b8906d4ba7e2a6ae28337a5f7349dd&pinId=31498241&pinType=site&lat=4d11775ca1635cb98f46d0767a96e9d9&dlevel=11&enc=b64
"));
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
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=7c33ae94bde54fb49b064f3510d9cb4b&pinId=37963298&pinType=site&lat=050bfeda5db0a2e332296ec7f887a3d4&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "고려왕대포":
                iv.setImageResource(R.drawable.s12);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=9b0dda0a0d17acbd8ac71881750b74ed&pinId=19648616&lat=c53f1aaf237c788e2585966566dfc586&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "아맛나":
                iv.setImageResource(R.drawable.s13);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=022986f4c42c2a126691d4cd720c3fbb&pinId=38590781&lat=5a8d55babebd3e79dbee2862d8a9f34c&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "2000냥포차":
                iv.setImageResource(R.drawable.s14);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=4536f2677dcf80e9172923c714c96e89&pinId=1189332655&lat=a6aba0b9bc588ee9f0c0d506e43f29e3&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "오술차":
                iv.setImageResource(R.drawable.s15);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=83465ea45a56ac3eae55764e59b35e3a&pinId=1780552974&lat=6df3f1ffdfdf49c21e5bf2badf34a6f2&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;


            case "만만코코로":
                iv.setImageResource(R.drawable.s21);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=83465ea45a56ac3eae55764e59b35e3a&pinId=701273689&lat=6df3f1ffdfdf49c21e5bf2badf34a6f2&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "경성주막1929":
                iv.setImageResource(R.drawable.s22);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=8ed262e6505d0ee79581749c33bcdeeb&pinId=1899784759&lat=e3856776baffc8876f6ae649dd161d49&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "접대":
                iv.setImageResource(R.drawable.s23);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mid=bl0143846950"));
                        startActivity(intent);
                    }
                });
                break;
            case "키친우":
                iv.setImageResource(R.drawable.s24);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=4d18eb970376570ca3162181016f32c3&pinId=216514071&pinType=site&lat=594a389226d06f2599bb7f56eee4e1cd&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "퍼지네이블":
                iv.setImageResource(R.drawable.s25);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=6d6e7dc57341d54db7a0f7d8e98ecfee&pinId=36785792&lat=54a7a0568aaf964da911e8440952d241&dlevel=11&enc=b64&pinType=site\n"));
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
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=c0bd4e4986604873735aaffc34ccfcd5&pinId=262839915&pinType=site&lat=ef274d37833315d262b18a8bfb7bc982&dlevel=11&enc=b64\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "땡초우동":
                iv.setImageResource(R.drawable.s33);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://blog.naver.com/girl0419797/221251973429\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "불난술집":
                iv.setImageResource(R.drawable.s34);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mapmode=0&lng=22a140c7e574ed965d3f4c4d6d59bb97&pinId=901704706&lat=935ef036b7869d41e257c4e15adf8b72&dlevel=11&enc=b64&pinType=site\n"));
                        startActivity(intent);
                    }
                });
                break;
            case "Thursday party":
                iv.setImageResource(R.drawable.s35);

                map.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://map.naver.com/?mid=bl01129516"));
                        startActivity(intent);
                    }
                });
                break;


        }
    }
}
