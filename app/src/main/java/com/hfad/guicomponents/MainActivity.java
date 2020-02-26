package com.hfad.guicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ImageView photo = (ImageView)findViewById(R.id.photo);
        int image = R.drawable.leads_logo;
        String description = "This is leads logo";

        photo.setImageResource(image);
        photo.setContentDescription(description);
        */


    }



    public void onClickRadioButton(View view) {

        TextView textView = (TextView)findViewById(R.id.radiobutton);

        switch(view.getId())

        {
            case R.id.radio_cavemen:
                textView.setText("CAVEMEN!!");
                break;

            case R.id.radio_ast:
                textView.setText("ASTRONAUT !!");
                break;

        }
    }




    public void onCheckBoxClicked (View view)
    {
        TextView text = (TextView)findViewById(R.id.checkbox);

        Boolean checked = ((CheckBox)view).isChecked();

        switch (view.getId())
        {
            case R.id.checkbox_milk :
                if(checked)
                {
                  text.setText("Milk is checked");
                }
                else
                {
                    text.setText("Milk is unchecked");
                }
                break;

            case R.id.checkbox_sugar:
                if(checked)
                {
                    text.setText("Sugar is checked");
                }
                else
                {
                    text.setText("Sugar is unchecked");
                }
        }

    }




    public void onToggleBoxClicked(View view)
    {
        TextView text = (TextView)findViewById(R.id.togglebutton);

        Boolean on = ((ToggleButton)view).isChecked();

        if(on)
        {
            text.setText("Toggle ON");
        }
        else
        {
            text.setText("Toggle OFF");
        }

    }


}
