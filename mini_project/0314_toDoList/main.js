const addBtn = document.querySelector('.fa-plus'); //추가 버튼임
const input = document.querySelector('.footer_input');
const items = document.querySelector('.items'); // ul

// li요소 생성하는 함수
function createItem(text) {
  console.log(text);
  const itemRow = document.createElement('li');
  itemRow.className = 'item';
  itemRow.innerHTML = `<span>${text}</span>
          <i class="fa-solid fa-check"></i>
          <i class="fa-solid fa-trash-alt"></i>
        </li>`;

  // 체크버튼 클릭시 클래스 추가 이벤트
  itemRow.querySelector('.fa-check').addEventListener('click', () => {
    itemRow.classList.toggle('item_done');
  });
  //   삭제 버튼 클릭시 itemRow 제거 이벤트
  itemRow.querySelector('.fa-trash-alt').addEventListener('click', () => {
    itemRow.remove();
  });
  // 새롭게 추가하면 스크롤이 아래로 고정됨 (아래 두 가지 방법)
  //   setTimeout(() => itemRow.scrollIntoView({ block: 'center' }), 0);
  requestAnimationFrame(() => itemRow.scrollIntoView({ block: 'center' }), 0);

  return itemRow;
}

function onAdd() {
  //   console.log('함수가 실행됐다');
  const text = input.value.trim();
  if (!text) {
    input.value = '';
    input.focus();
    return;
  }

  // li를 생성하는 함수 - createItem(text)
  // ul에 생성된 값을 추가함

  items.appendChild(createItem(text));
  input.value = '';
  input.focus();
}

// 이벤트 등록
addBtn.addEventListener('click', onAdd);

// 방법1
// input.addEventListener('keypress', (e) => {
//   console.log(e);
//   if (e.key === 'Enter') {
//     onAdd();
//   }
// });

// 방법2
input.addEventListener('keyup', (e) => e.key === 'Enter' && onAdd());
