import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    private EditText num1EditText;
    private EditText num2EditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void calculate(View view) {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        int operation = view.getId();

        double result = 0.0;

        switch (operation) {
            case R.id.addButton:
                result = num1+num2;
                resultTextView.setText("\nResult: " + result);
                break;

            case R.id.subtractButton:
                result = num1-num2;
                resultTextView.setText("\nResult: " + result);
                break;

            case R.id.multiplyButton:
                result = num1*num2;
                resultTextView.setText("\nResult: " + result);
                break;

            case R.id.divideButton:
                if (num2!=0){
                    result = num1/num2;
                    resultTextView.setText("\nResult: " + result);
                }
                else{
                    resultTextView.setText("\nNot Defined!");
                }
                break;

            case R.id.powerButton:
                if (num2!=0){
                    result = Math.pow(num1,num2);
                    resultTextView.setText("\nResult: " + result);
                }
                else{
                    resultTextView.setText("\nResult: 0.0");
                }
                break;

            case R.id.remainderButton:
                if (num2!=0){
                    result = num1%num2;
                    resultTextView.setText("\nResult: " + result);
                }
                else{
                    resultTextView.setText("\nResult: "+ num1);
                }
                break;

            case R.id.logarithmButton:
                if (num2!=0 && num2!=1){
                    result = Math.log(num1)/Math.log(num2);
                    resultTextView.setText("\nResult: " + result);
                }
                else{
                    resultTextView.setText("\nNot Defined!");
                }
                break;

            case R.id.bitwiseXORButton:
                result = (int)num1^(int)num2;
                resultTextView.setText("\nResult: " + result);
                break;

            case R.id.bitwiseORButton:
                result = (int)num1|(int)num2;
                resultTextView.setText("\nResult: " + result);
                break;

            case R.id.bitwiseANDButton:
                result = (int)num1&(int)num2;
                resultTextView.setText("\nResult: " + result);
                break;

            case R.id.bitwiseNOTButton:
                result = (int)num1~(int)num2;
                resultTextView.setText("\nResult: " + result);
                break;

            default:
                resultTextView.setText("\nInvalid Input!");
                break;
        }
    }
}
