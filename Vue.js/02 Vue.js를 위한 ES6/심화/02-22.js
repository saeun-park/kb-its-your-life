let p = new Promise((resolve, reject) => {
  resolve('first!'); // first 호출됨
});

p.then((msg) => {
  console.log(msg); // first 출력
  return 'second'; // 다음 then에 second를 전달함
})
  .then((msg) => {
    console.log(msg); // second 출력
    return 'third'; // 다음 then에 third 출력
  })
  .then((msg) => {
    console.log(msg); // third 출력
  })
  .catch((error) => {
    console.log('오류 발생 --> ' + error); // 실행되지 않음
  });
