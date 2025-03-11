// 숫자
// 정수, 실수(소수점), 2진수, 8진수, 16진수

let integer = 123;
console.log(integer);

let binary = 0b1111011; //0x7b도 123임
console.log(binary);

console.log(binary == 123);

// 특정 숫자를 0으로 나눌 때 무한대가 나온다
console.log(0 / 123);
console.log(123 / -0);
console.log(123 / 'text'); // NaN : Not a Number
