// 매개변수에 기본값을 설정한 경우
function hello(name) {
  if (name === undefined) return '이름을 입력하세요.';
  else return name + '님, 안녕하세요?';
}

const name = hello();

console.log(name);
