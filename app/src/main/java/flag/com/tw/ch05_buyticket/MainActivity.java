package flag.com.tw.ch05_buyticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View v){
        TextView txv = (TextView) findViewById(R.id.txv);
        RadioGroup ticketType = (RadioGroup) findViewById(R.id.ticketType);
        RadioGroup ticketNumber = (RadioGroup) findViewById(R.id.ticketNumber);

        /*
        switch(ticketType.getCheckedRadioButtonId()){
            case R.id.adult:
                txv.setText("全票50元");
                break;
            case R.id.child:
                txv.setText("兒童票30元");
                break;
            case R.id.senior:
                txv.setText("敬老票15元");
                break;
        }*/

        /*
        RadioButton type = (RadioButton) findViewById(ticketType.getCheckedRadioButtonId());
        txv.setText("買" + type.getText());
        */

        RadioButton type = (RadioButton) findViewById(ticketType.getCheckedRadioButtonId());
        RadioButton number = (RadioButton) findViewById(ticketNumber.getCheckedRadioButtonId());
        txv.setText("買" + type.getText() + " " +  number.getText());


    }
}
