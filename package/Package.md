## 패키지 구조 & 역할
🔸 App 기본 세팅

**AndroidMainifest.xml** ← manifests패키지 폴더 안에 있음

> **application 태그**
> 

<application

</application>

`android:icon="@minmap/..."`  : App 아이콘 -> 변경 : drawable 이나 minmap 파일에 넣고 거기로 경로 설정

`android:label="@String/..."` : App 이름

`android:theme="@style/AppTheme"` : App의 심볼 컬러

> **res폴더**
> 

: 리소스들이 모여있는 곳

- **drawable** : 주로 이미지 폴더 담당
- **layout** : activity와 연결하는 레이아웃 파일들을 담당
- **minmap** : 기본적인 앱 아이콘
- **values** : colors / strings / styles
