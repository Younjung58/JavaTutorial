<img alt="Static Badge" src="https://capsule-render.vercel.app/api?type=waving&height=300&color=gradient&text=Younjung's%20Github&section=header&reversal=false&textBg=false&fontColor=000010&fontSize=65&fontAlign=50&fontAlignY=44&animation=fadeIn&rotate=0&stroke=000001&strokeWidth=3&desc=ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ•̫͡•ʕ•̫͡•ʔ%20%20%20%20%20%20ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ•̫͡•ʕ•̫͡•ʔ&descSize=15&descAlignY=70&descAlign=30">
<div>
<img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" style="width: 120px; height: 50px;">
</div>
<h3>Java Tutorial</h3>
<div>
  <h5>day 01.</h5>
  -Java-</br>
 -변수: 값을 저장하는 공간(중간과정을 저장하기 위해서)(적을수록 좋음, 프로그램 가벼워짐)(var, let, const)</br>
  -> 선언문의 형태: '자료형'(값이 무엇인지를 알려줌 (정수, 문자, 문자열, 실수..)) '변수명'(변수) = '초기값'(변수가 처음 만들어질때 가지는 값);
  </br>
  String(문자열) 선언시에 java는 " "로 선언해야함</br>
  char(문자)는 ' '로 선언해야함</br>
  </br></br>
  프로그래밍의 문제가 주어졌을때는 항상 시나리오와 문제해결 부분을 분리하여 생각하고, 구성한다.</br>
  예를들어, </br>
  철수는 30세이고 키는 180이다(시나리오)</br>
  철수의 나이와 이름을 저장하고 철수의 나이를 +2 증가한다.(문제해결)</br>
</div>
<div>
  <h5>day 02.</h5>
  컴퓨터의 구조</br>
  1. cpu(중앙처리장치, 처리하는 곳, 주방장)</br>
  2. 메모리(주기억 장치(RAM), 임시적인 기억장치(휘발성), 컴퓨터가 켜졌을 때 보조기억장치로부터 data를 가져옴, 즉 cpu에게 데이터를 가져다주는 보조장치임, cpu가 다 사용하면 삭제함)</br>
  3. 보조기억장치(USB, HDD, SD ....처럼 데이터를 저장하고 전원이 꺼져도 삭제되지 않음, 영구적으로 저장하는 곳, 냉장고)</br>
  -> 메모리와 보조기억장치의 차이는 전원이 켜졌을 때와 안켜졌을 때로 구분!</br>
  -> 즉, 사용자가 ctrl +f11을 누를때 메모리가 보조기억장치로 부터 test01을 가져오는 개념</br>
  -> 사용되는 byte에 따라서 현명하게 자료형을 선택하여 사용하기(불필요하게 메모리를 잡아먹는 것을 방지하기 위해서)</br>
  (예를들어 1부터 100까지의 숫자만 필요하면 4바이트를 사용하는 int보다는 1byte를 사용하는 byte로 자료형을 지정하기)</br>
  ***자료형 종류와 byte수를 기억하기***</br>
  </br>
  -------------------------------------------------------------------------------------------------------------
  </br>
  연산자</br>
  단항 : ++, --, +(양의정수), -(음의정수)</br>
  이항 : 산술연산자(+ - * / %), 비교연산자(== != >= <= > <), 대입연산자(= += -= *= /=)</br>
  a++이 a+1보다 속도빠름(즉, 이는 단항연산자가 이항연산자보다 컴퓨터에서 처리하는 속도가 빠름을 의미한다.)</br>
  // 우선순위는 단항>이항(산술>비교>대입)>...순임</br></br>
  
  배열</br>
  장점 : 변수를 하나로 사용해서 여러개의 값을 저장할 수 있다</br>
  특징 : 고정길이를 가지고있음</br>
  예를들어, 로또번호 6개를 추출할때, 연속된 a의 배열을 만듦</br>
  (저장시에 변수를 6개 선언하는 것 보다 배열의 값을 수정하는 것이 편리함)</br>
   int[ ] a = new int[6];</br>
   0   1   2   3   4   5  -> index</br>
  ----------------------</br>
  20  30  40  36  2  5   -> value</br>
  -> a[0] = 20;</br>
  -> 길이 : 6  / 인덱스의 값 : 0 부터 (길이-1)까지</br></br>
  오늘 배운 내용 중에서 단항 연산자에 존재하는 +와 이항 연산자에 존재하는 +를 비교하는 부분이 조금 헷갈렸다. 즉, +는 사용되어지는 경우에 따라 단항과 이항이 모두 되어질 수 있으며 사용될 경우에 의미를 구분하는 것이 필요할 것 같다. 이러한 부분을 추가적으로 학습하여 실전에서 혼동하지않고 잘 사용할 것이다.</br>
  a=3; 인 경우에, </br>
  '-a(단항)'로 사용되어지면 값은 -3로, 'a-2(이항)'로 사용되어지면 값은 1로 도출되어진다.</br>
</div>
<div>
  <h5>day 03.</h5>
  조건: 참(true)과 거짓(false)으로 구분
  -> 연산자: 비교연산자(!=, ==, >, <, >=, <=)
  ** 조건을 사용하는 이유는 조건에 따라서 참과 거짓으로 구분하여 코드를 분리하기 위함**
  *** 조건의 타입
  ex) 1차 조건 : 조건 1개 (A)(if  / else)
       1차조건 2차조건 3차조건... : 1개씩 단일 조건존재 (B)(조건 각각에서 true/false가 나옴)(if  /else if  /else if)
       1차조건 만족 후 2차조건 : 연속적인 조건 (C)
  (A타입의 예시 : 키가 160cm미만은 놀이기구를 못탐
   B타입의 예시 : 조편성을 키가 180cm 이상은 1조, 170~179cm는 2조, 169cm이하는 3조임
   C타입의 예시 : 일주일간 출결이 100%이면서 과제제출이 90%이상인 경우)

    if문을 공부하면서 들었던 궁금증.
    ?? if-if-if와 같이 if가 여러개 나열된 경우와 if-else if-else if가 나열된 경우의 차이점에 대해서 정확히 구분이 되지 않아서 추가적으로 학습을 하였다.??
    -> 정리하여 간단히 차이점을 나타내보자면, if가 나열된 구문은 성립되는 경우를 if구문 각각 따로 구분하여 판별하고(하나의 성립되는 경우가 있어도 다음 if문을 또 진행)
       else if의 구문은 연속적으로 실행되다가, 하나의 성립되는 경우가 발생하면 그 이후의 조건문은 실행되지않고 종료된다는 점이다.
</div>
<div>
  <h5>day 04.</h5>
  -for문의 형태-
  for(초기값;조건;증감식){
  
  }
  초기값은 일반적으로 변수를 선언
  조건은 참과 거짓
  증감식은 ++,--
  
  예제
  for(int i=0;i<3;i++){
  	sysout("*");
  }
  이러한 반복문의 순서
  -> 초기값(i=0) -> 조건판별(false면 exit)하여 true면-> 반복문 수행 -> 증감식 -> 다시 조건판별의 단계 .... 의 과정을 반복
                         
  -> 즉 i가 0일때, 0<3을 판별하고, true이기 때문에 반복문을 실행하며 i를 1증가시켜 i=1로 만들어 다시 1<3을 판별...

  반복문을 적용하여 코드를 작성할 경우에 생각해야 할 것!
  -> 여기서의 반복은 '특정한 코드의 반복'을 의미함
    반복문을 생각할 때 (반복할 코드(중복하여 나오는 부분)가 무엇인가), (반복할 값(변화하는 값)이 무엇인가)를 먼저 생각.
</div>
</br></br>
<img src="https://github-readme-stats.vercel.app/api/top-langs/?username=Younjung58&layout=compact"><br><br>
<img src="https://github-readme-stats.vercel.app/api?username=Younjung58&show_icons=true">
</br>
<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://user-images.githubusercontent.com/25423296/163456776-7f95b81a-f1ed-45f7-b7ab-8fa810d529fa.png">
  <img alt="Shows an illustrated sun in light color mode and a moon with stars in dark color mode." src="https://user-images.githubusercontent.com/25423296/163456779-a8556205-d0a5-45e2-ac17-42d089e3c3f8.png">
</picture>
