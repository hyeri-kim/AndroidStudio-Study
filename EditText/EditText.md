```java
// activity_main.xml
<LinearLayout

	<EditText
		android:id="@+id/et_id" />

	<Button
		android:id="@+id/btn_test" />

</LinearLayout>
```

```java
// MainActivity.java
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// Alt + Enter -> 자동으로 import
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
	
// type 똑같이 작성 !!
	EditText et_id;
	Button btn_test;

	@Override
	protected void onCreate(Bundle savedinstanceState) { // 어플을 켰을 때 처음으로 실행됨
		super.onCreate(savedinstanceState);
		setContentView(R.layout.activity_main); // xml 파일 연결
		
		// findViewById : R.id.et_id를 et_id에 속성으로 부여
		et_id = findViewById(R.id.et_id); // xml에 있는 EditText와 연결
		btn_test = findViesById(R.id.btn_test); // xml에 있는 Button과 연결

		// 사용
		btn_test.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { // 버튼을 클릭했을 때의 액션
				et_id.setText("홍드로이드"); // setText : xml에서 text 값을 써주고 싶을 때 이곳에서 **동적으로** 사용 -> 버튼을 누르면 EditText안에 "홍드로이드"가 자동으로 써짐
			}
		});
```
