// boolean - true, false

const { log } = require('node:console');

let isFree = true;
console.log(isFree);

// 값 앞에 !!를 붙이면 boolean 타입으로 변경할 수 있다

// falshy 값
console.log(!!0);
console.log(!!-0);
console.log(!!'');
console.log(!!null);
console.log(!!undefined);
console.log(!!NaN);

// truthy 값
console.log(!!1); // 0이 아닌 모든 숫자
console.log(!!-1);
console.log(!!'test'); // 비어있지 않은 문자열
console.log(!!{}); // 비어있으나 객체인 경우
console.log(!!Infinity);

// null
console.clear();
let test = null;
let test2 = undefined;
console.log(typeof test);
console.log(typeof test2);
