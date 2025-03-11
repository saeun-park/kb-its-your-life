// 실행 순서를 제어하는 것을 제어문이라고 한다
// 조건문, 반복문

// if(조건식){실행문}
// if(조건식){실행문}else{실행문}
// if(조건식){실행문}else if(조건문){실행문}else{실행문}

// console.log(fruit === 'apple'); //true
let fruit = 'pineapple';
if (fruit === 'apple') {
  console.log('사과네');
} else if (fruit === 'orange') {
  console.log('오렌지네');
} else {
  console.log('사과도 오렌지도 아니네');
}

if ('text') {
  console.log('true 입니다');
} else {
  console.log('false 입니다');
}

// 삼항연산자
// 조건식 ? 참일 경우 실행내용 : 거짓일 경우 실행내용
'text' ? console.log(' 참') : console.log('거짓');

if ('text') {
  console.log('true 입니다');
} else {
  console.log('false 입니다');
}
