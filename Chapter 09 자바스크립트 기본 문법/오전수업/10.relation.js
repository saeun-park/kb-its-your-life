// 대소간계 비교 연산자
// >, <, >=, <=

console.log(2 > 3); // false
console.log(2 <= 3); // true

// 연산자의 우선순위
let a = 2;
let b = 3;
let result = a + (b * 4) / 5;
console.log(result);

// 동등 비교 관계 연산자 ==
// == 값이 같은가
// != 값이 다른가
// === 값과 타입까지 같은가
// !== 값과 타입이 다른가

console.clear();
console.log(2 == 2);
console.log(2 != 2);
console.log(2 === '2');
console.log(2 !== '2');
console.log(true == 1);
console.log(true === 1);
console.log(false == 0);
console.log(false === 0);

const obj1 = { name: 'saeun' };
const obj2 = { name: 'saeun' };

console.clear();
console.log(obj1 === obj2);

console.log(obj1.name === obj2.name);
