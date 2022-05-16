### 화면 전환

🔸 a, b Activity가 있을 때 a→b로 데이터 이동

- Activity가 두 개 존재해야 함
    - MainActivity
    - SubActivity
- 새로운 Activity 생성 : 패키지 우클릭 → new → Activity → Empty Activity
    - res 폴더에서 새로 생성된 Activity 확인(SubActivity)
```java
// 간단하게 연결
protected void onCreate(Bundle savedinstanceState)
{
	super.onCreate(savedinstanceState);
	setContentView(R.layout.activity_main);

	findViesById(R.id.btn_move).setOnClickListener(new View.OnClickListener()
	{
		@Override
		public void onClick(View vew)
		{
			// main - > sub
			startActivity(new Intent(MainActivity.this, SubActivity.class));
		}
	});
}
```
