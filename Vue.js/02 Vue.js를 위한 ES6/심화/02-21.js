// resolve : 성공했을 때 호출 -> then()
// reject : 실패했을 때 호출 -> catch()
// p.then(성공했을 때 실행할 함수).catch(실패했을때 실행할 함수)

const p = new Promise((resolve, reject) => {
  setTimeout(() => {
    let num = Math.random(); // 0~1 사이의 난수 발생
    if (num >= 0.8) {
      reject(`생성된 숫자가 0.8 이상임 - ${num}`);
    } else {
      resolve(num);
    }
  }, 2000);
});

p.then((result) => {
  // result는 resolve(num)의 값이다
  console.log('처리 결과 : ', result);
}).catch((error) => {
  // error는 reject의 값읻4ㅏ
  console.log('오류 : ', error);
});

console.log('## Promise 객체 생성!');
