function displayA() {
  console.log('A');
}
function displayB(alpha) {
  //   console.log('<<2초 경과후>>');

  setTimeout(() => {
    console.log('B');
    if (alpha == displayC()) {
      console.log('C');
    }
  }, 2000);
}
function displayC() {
  console.log('C');
}
displayA();
displayB(displayC);
