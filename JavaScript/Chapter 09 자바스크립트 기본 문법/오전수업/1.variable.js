// 주석처리
/**
 * let, const, (var)
 *
 * 메모리
 */
console.clear();

let test = '테스트';
console.log('출력확인', test);

test = 300;
console.log('출력확인3', test);

// 변수 (변경 가능)
let a = 'saeun';
a = 'park';
let b;
b = 100;
console.log(b);
console.log(a);
// let b : 같은 변수명으로 선언할 수 없다.\\

// const (변경 불가)
const c = 'ccccc'; //선언만 불가, 반드시 할당해야함, 재할당 불가

var d = 'test';

const MAX_FRUITS = 100;
