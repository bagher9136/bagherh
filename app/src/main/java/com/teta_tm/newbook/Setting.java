package com.teta_tm.newbook;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class Setting extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private TextView tv_preview,tv_set_font;
    Spinner sp_selectfont;
    private SeekBar seekbar_fontsize,seekbar_linespace;
    RadioButton rb_day,rb_night;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        init();
        sharedPreferences=getSharedPreferences("settings",MODE_PRIVATE);
    }
    public void init(){
        tv_preview=findViewById(R.id.tv_txt_preview);
        tv_set_font=findViewById(R.id.tv_set_font);
        sp_selectfont=findViewById(R.id.sp_select_font);
        seekbar_fontsize=findViewById(R.id.sb_font_size);
        seekbar_linespace=findViewById(R.id.sb_line_space);



    }
}
