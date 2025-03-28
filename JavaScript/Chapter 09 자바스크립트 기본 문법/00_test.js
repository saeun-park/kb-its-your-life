let num = -21;

if (num % 2 == 0) {
  console.log('짝수입니다');
} else {
  console.log('홀수입니다');
}

// 양의 점수만 입력 받기
console.clear();
if (num % 2 == 0 && num > 0) {
  console.log('짝수입니다');
} else if (num % 2 == 1 && num > 0) {
  console.log('홀수입니다');
} else {
  console.log('양수만 입력가능합니다.');
}
