### ํ๋ฉด ์ ํ

๐ธ a, b Activity๊ฐ ์์ ๋ aโb๋ก ๋ฐ์ดํฐ ์ด๋

- Activity๊ฐ ๋ ๊ฐ ์กด์ฌํด์ผ ํจ
    - MainActivity
    - SubActivity
- ์๋ก์ด Activity ์์ฑ : ํจํค์ง ์ฐํด๋ฆญ โ new โ Activity โ Empty Activity
    - res ํด๋์์ ์๋ก ์์ฑ๋ Activity ํ์ธ(SubActivity)
```java
// ๊ฐ๋จํ๊ฒ ์ฐ๊ฒฐ
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
