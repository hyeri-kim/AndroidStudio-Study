import ...

public class MainActivity extends AppCompatActivity {

	private ListView list;

	@Override
	protected void onCreate(Bundle savedinstanceState) {
		super.onCreate(savedinstanceState);
		setContentView(R.layout.activity_main);
		
		list = (ListView)findViewById(R.id.list); // ListView의 id를 가져옴

		List<String> data = new ArrayList<>(); // String 타입으로 list 선언
		
		ArrayAdapter<String> adapter = new ArrayAdapter<>(context:this,android.R.layout.simple_list_item_1,data); // 중간 다리 역할(연결)
		list.setAdapter(adapter); // adapter를 list에 세팅

		data.add("홍드로이드");
		data.add("안드로이드");
		data.add("사과");
		adapter.notifyDataSetChanged(); // 이 상태를 저장

	}
}
