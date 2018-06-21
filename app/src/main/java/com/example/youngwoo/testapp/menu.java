package com.example.youngwoo.testapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {

    private String[] items = {"위드센터(구학)", "다래락(신학)","워커하우스(돌집)"};
    private String[] items2 = {"무한리필", "스테이크&육회","인분고깃집"};
    private String[] items3 = {"라멘","스시","덮밥"};
    private String[] items4 = {"돈까스", "파스타&리조또","피자"};
    private String[] items5 = {"밥", "면","탕"};
    private String[] items6= {"길거리음식","아이스크림or빵","인스타찰칵"};
    private String[] items7 ={"중식"};
    private String[] items8 = {"패스트푸드"};
    private String[] items9 = {"가성비","인스타갬성★","핫플"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        ImageButton univ = (ImageButton) findViewById(R.id.univ);
        ImageButton meat = (ImageButton) findViewById(R.id.meat);
        ImageButton japan = (ImageButton) findViewById(R.id.japan);
        ImageButton western = (ImageButton) findViewById(R.id.western);
        ImageButton korea = (ImageButton) findViewById(R.id.korea);
        ImageButton china = (ImageButton) findViewById(R.id.china);
        ImageButton snack = (ImageButton) findViewById(R.id.snack);
        ImageButton fastfood = (ImageButton) findViewById(R.id.fastfood);
        ImageButton pub = (ImageButton) findViewById(R.id.pub);
        ImageButton roulette = (ImageButton) findViewById(R.id.roulette);

        roulette.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), roulette.class);
                startActivity(intent);
            }
        });
        univ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
                builder.setTitle("학식");
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), select2.class);

                        if (i == 0) {
                            intent.putExtra("식당", "구학");
                        } else if (i == 1) {
                            intent.putExtra("식당", "신학");
                        } else {
                            intent.putExtra("식당", "돌집");
                        }
                        startActivityForResult(intent, 0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
                builder.setTitle("고기");
                builder.setItems(items2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), select1.class);

                        if (i == 0) {
                            intent.putExtra("menu", "무한리필");
                        } else if (i == 1) {
                            intent.putExtra("menu", "스테이크&육회");
                        } else {
                            intent.putExtra("menu", "인분고깃집");
                        }
                        startActivityForResult(intent, 0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
                builder.setTitle("일식");
                builder.setItems(items3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), select1.class);

                        if (i == 0) {
                            intent.putExtra("menu", "라멘");
                        } else if (i == 1) {
                            intent.putExtra("menu", "스시&규카츠");
                        } else {
                            intent.putExtra("menu", "덮밥");
                        }
                        startActivityForResult(intent, 0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        western.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
                builder.setTitle("양식");
                builder.setItems(items4, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), select1.class);

                        if (i == 0) {
                            intent.putExtra("menu", "돈까스");
                        } else if (i == 1) {
                            intent.putExtra("menu", "파스타&리조또");
                        } else {
                            intent.putExtra("menu", "피자");
                        }
                        startActivityForResult(intent, 0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
                builder.setTitle("한식");
                builder.setItems(items5, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), select1.class);

                        if (i == 0) {
                            intent.putExtra("menu", "밥");
                        } else if (i == 1) {
                            intent.putExtra("menu", "면");
                        } else {
                            intent.putExtra("menu", "탕");
                        }
                        startActivityForResult(intent, 0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        china.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), select1.class);
                intent.putExtra("menu", "중식");
                startActivityForResult(intent, 0);
            }
        });


        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
                builder.setTitle("디저트");
                builder.setItems(items6, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(),select1.class);

                        if (i == 0) {
                            intent.putExtra("menu","길거리음식");
                        }
                        else if (i == 1) {
                            intent.putExtra("menu","아이스크림&빵");
                        }
                        else {
                            intent.putExtra("menu","인스타갬성 카페");
                        }
                        startActivityForResult(intent,0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        fastfood.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),select1.class);
                intent.putExtra("menu","패스트푸드");
                startActivity(intent);
            }
        });
        pub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
                builder.setTitle("술집");
                builder.setItems(items9, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(),select1.class);

                        if (i == 0) {
                            intent.putExtra("menu","가성비");
                        }
                        else if (i == 1) {
                            intent.putExtra("menu","인스타갬성★");
                        }
                        else {
                            intent.putExtra("menu","핫플");
                        }
                        startActivityForResult(intent,0);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


    }
}
