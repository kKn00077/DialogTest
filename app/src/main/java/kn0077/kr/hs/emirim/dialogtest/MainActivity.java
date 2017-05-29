package kn0077.kr.hs.emirim.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[]itemArr={"바나나","딸기","망고","청포도"};//onClick 메서드 안에 선언해도 됨
    Button butDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this); // 대화상자 객체 생성과 동시에 어느 화면에 띄워 줄 것인지 지정
        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.mipmap.star);
        //dialog.setMessage("여기는 메시지를 쓰는 곳입니다. ");

        //그냥 목록
       /* dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { // which 는 클릭한 항목의 인덱스값
                butDialog.setText(itemArr[which]);
            }
        });*/

       //라디오 버튼 목록
        dialog.setSingleChoiceItems(itemArr,0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { // which 는 클릭한 항목의 인덱스값
                butDialog.setText(itemArr[which]);
            }
        });
        dialog.setPositiveButton("OK",null);
        dialog.show();//다이얼로그를 화면에 보이게 설정
    }
}
