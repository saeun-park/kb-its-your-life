// 객체 - 복합데이터
// 상태와 행동을 가지고 있다

// 복합데이터 {key:value, key:value, key:value, key:value, key:value,...}
// [1, 2, 3, 4] ['1', '2', '3', '4']

let name = 'apple';
let color = 'red';
let display = '빨간사과';

let fruit = {
  name: 'obj-apple',
  color: 'obj-red',
  display: 'obj-빨간사과',
};
console.log(fruit.color);
console.log(fruit);
console.log(typeof fruit);

let a = 1;
let b = a;
b = 2;
console.log(b);
console.log(a);

// reference
// 객체타입은 참조값(메모리 주소, 레퍼런스)이 복사되어 전달됨
console.clear();

let apple = { name: '사과' };
let fruit2 = apple;
fruit2.name = '복숭아';

console.log('apple: ', apple);
console.log('fruit2: ', fruit2);
