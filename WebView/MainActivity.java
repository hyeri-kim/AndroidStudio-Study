import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

	private WebView webView;
	private String url = "https://www.naver.com";

	@Override
	protected void onCreate(Bundle savedinstanceState) {
		super.onCreate(savedinstanceState);
		setContentView(R.layout.activity_main);

		webView = (WebView)findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl(url);
		webView.setWebChromeClient(new WebChromeClient());
		webView.setWebViewClient(new WebViewClientClass());
		
	}
	// 뒤로가기 눌렀을 때 웹뷰에서 뒤로가기
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
			webView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	private class WebViewClientClass extends WebViewClient {
		// 현재 페이지의 url을 읽어오는 메소드
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
}
