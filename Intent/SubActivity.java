import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SubActivity extends AppCompatActivity {
	
	private TextView tv_sub;

	@Override
	protected void onCreate(Bundle savedinstanceState) {
		super.onCreate(savedinstanceState);
		setContentView(R.layout.activity_main);

		tv_sub = findViewById(R.id.tv_sub);

		// 날아오는 데이터 값이 있으면 여기서 받음
		Intent intent = getIntent();
		String str = intent.getStringExtra( name: "str");

		tv_sub.setText(str); // 최종적으로 데이터를 씀
	}
}
