import ...

public class MainActivity extends AppCompatActivity {

	private Button btn_move;
	private EditText et_test;
	private String str; // EditText에서 가져온 데이터 값을 담을 변수

	@Override
	protected void onCreate(Bundle savedinstanceState) {
		super.onCreate(savedinstanceState);
		setContentView(R.layout.activity_main);

		et_test = findViewById(R.id.et_test);
		
		btn_move = findViewById(R.id.btn_move); // xml파일의 버튼과 연결
		btn_move.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { // 버튼을 클릭했을 때의 액션
				// Intent 객체 생성
				str = et_test.getText().toString(); // EditText의 데이터 값을 가져와서 str에 넣어줌 ==>데이터 이동할 때
				Intent intent = new Intent(MainActivity.this, SubActivity.class); // (현재Activity, 이동하고싶은Activity) ==>화면전환할 때
				intent.putExtra(name: "str", str); // putExtra : str에 담아서 sub로 넘겨줌 ==>데이터 이동할 때
				startActivity(intent); // Activity 이동 ==>화면전환할 때
			}
		});
	}
}
