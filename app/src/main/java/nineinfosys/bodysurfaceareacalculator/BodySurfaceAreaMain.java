package nineinfosys.bodysurfaceareacalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BodySurfaceAreaMain extends AppCompatActivity {
EditText heightIncm,weightInkg;
    TextView resultBodySurfaceArea12;
   BodySurfaceAreaCalculator area;
    private static final String REQUIRED_MSG = "required";
//    DecimalFormat f = new DecimalFormat("##.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_surface_area_main);
        heightIncm=(EditText)findViewById(R.id.editTextHeight);
        weightInkg=(EditText)findViewById(R.id.editTextWeight);
        resultBodySurfaceArea12=(TextView)findViewById(R.id.textViewResult);
        Button Calculate=(Button)findViewById(R.id.CalculateBodySurfceArea);
        Button CalculateClear=(Button)findViewById(R.id.buttonClear);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(heightIncm.getText().toString().trim())) {
                    heightIncm.setError("enter the height");
                    return;
                }
                if (TextUtils.isEmpty(weightInkg.getText().toString().trim())) {
                    weightInkg.setError("enter the weight");
                    return;
                }

                 double heightIncmValue=Double.parseDouble(heightIncm.getText().toString().trim());

                double weightInkgValue=Double.parseDouble(weightInkg.getText().toString().trim());
                String heightIncmValue1 = Double.toString((double) heightIncmValue);
                String weightInkgValue1 = Double.toString((double) weightInkgValue);
                area=new BodySurfaceAreaCalculator(heightIncmValue,weightInkgValue);
                double resultBodySurfaceArea=area.bsaCalculator();
             //   String resultBodySurfaceArea1 = Double.toString((double) resultBodySurfaceArea);
                resultBodySurfaceArea12.setText( "Body Surface Area:".toString()+Double.toString((double) resultBodySurfaceArea));
                // new DecimalFormat("##.00").format(Double.toString((double) resultBodySurfaceArea));
             //   new DecimalFormat("#.00").format(resultBodySurfaceArea);

            }
        });
        CalculateClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heightIncm.getText().clear();
                weightInkg.getText().clear();
                resultBodySurfaceArea12.setText("");


            }
        });
    }
  /*  public static boolean hasText(EditText heightIncm) {

        String text = heightIncm.getText().toString().trim();
        heightIncm.setError(null);

        // length 0 means there is no text
        if (text.length() == 0) {
            heightIncm.setError(REQUIRED_MSG);
            return false;
        }
        return  true;
    }*/
    }




