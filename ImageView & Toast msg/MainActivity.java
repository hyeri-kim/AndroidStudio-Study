import ...

public class MainActivity extends AppCompatActivity {

	ImageView test;

	@Override
	protected void onCreate(Bundle savedinstanceState) {
		super.onCreate(savedinstanceState);
		setContentView(R.layout.activity_main);
		
		test = (ImageView)findViewById(R.id.test); // "test"라는 id를 찾아옴 -> 연결
		test.setOnClickListener(new View.OnClickListener() { // 동작
			Toast.makeText(getApplicationContext(), resId: "원하는 메세지", Toast.LENGTH_SHORT).show(); // (main Activity, 원하는 Toast메세지, Toast메세지를 띄우는 시간)
		});
	}
}
