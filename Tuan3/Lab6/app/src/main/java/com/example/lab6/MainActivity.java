package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etHoTen,etCmnd,etThongTinBoSung;
CheckBox chkDocBao,chkDocSach,chkDocCoding;
RadioButton radiobtnTrungCap,radiobtnCaoDang,radiobtnDaiHoc;
Button btnGuiThongBao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHoTen =findViewById(R.id.etHoTen);
        etCmnd=findViewById(R.id.etCmnd);
        etThongTinBoSung=findViewById(R.id.etThongTinBoSung);
        chkDocBao=findViewById(R.id.chkDocSach);
        chkDocCoding=findViewById(R.id.chkDocCoding);
        chkDocSach=findViewById(R.id.chkDocBao);
        btnGuiThongBao = findViewById(R.id.btnGuiThongBao);
        btnGuiThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                doShowInformation();

            }

            private void doShowInformation() {
                //Kiểm tra tên hợp lệ
                String ten=etHoTen.getText()+"";
                ten=ten.trim();
                if(ten.length()<3){
                    etHoTen.requestFocus();
                    etHoTen.selectAll();
                    Toast.makeText(MainActivity.this,"Tên Phải >=3 ký tự",Toast.LENGTH_SHORT).show();
                    return;

                }
                //kiểm tra CMND hợp lệ
                String cmnd=etCmnd.getText()+"";
                cmnd=cmnd.trim();
                if(cmnd.length()!=9){
                    etCmnd.requestFocus();
                    etCmnd.selectAll();
                    Toast.makeText(MainActivity.this,"Cmnd phải có đúng 9 ký tự",Toast.LENGTH_SHORT).show();
                    return;
                }
                //Kiểm tra bằng cấp
                String bang="";
                RadioGroup group =findViewById(R.id.radioGroup1);
                int id=group.getCheckedRadioButtonId();
                if(id==-1){
                    Toast.makeText(MainActivity.this,"Phải Chon Bằng Cấp",Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton rad =findViewById(id);
                bang =rad.getText()+"";
                //Kiểm tra sở thích
                String sothich="";
                if(chkDocBao.isChecked())
                    sothich+=chkDocBao.getText()+"\n";
                if(chkDocSach.isChecked())
                    sothich+=chkDocSach.getText()+"\n";
                if(chkDocCoding.isChecked())
                    sothich+=chkDocCoding.getText()+"\n";
                String bosung=etThongTinBoSung.getText()+"";
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông Tin Cá NHân");
                builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        dialog.cancel();
                    }
                });
                //tạo nội dung
                String msg=ten+"\n";
                msg+= cmnd+"\n";
                msg+=bang+"\n";
                msg+=sothich;
                msg+="—————————–\n";
                msg+="Thông tin bổ sung:\n";
                msg+=bosung+ "\n";
                msg+="—————————–";
                builder.setMessage(msg);//thiết lập nội dung
                builder.create().show();//hiển thị Dialog
            }



        });
    }
}
