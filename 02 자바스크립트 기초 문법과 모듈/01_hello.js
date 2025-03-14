const c = require('ansi-colors');

// let name = '홍길동';

const hello = function (e) {
  console.log(c.green(e) + ' 님, 안녕하세요?');
};

hello('홍길동');

//
// hello1('홍길동');
// function hello1(e) {
//   console.log(e + ' 님, 안녕하세요?');
// }
