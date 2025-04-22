const addBtn = document.querySelector('.fa-plus'); // 추가버튼
const input = document.querySelector('.footer_input'); //input 요소
const items = document.querySelector('.items'); // ul

//li 요소 생성함수
function createItem(text) {
  console.log(text);
  const itemRow = document.createElement('li');
  itemRow.className = 'item';
  itemRow.innerHTML = `<span>${text}</span>
          <i class="fa-solid fa-check"></i>
          <i class="fa-solid fa-trash-can"></i>
        </li>`;

  // 체크버튼 클릭시 클래스 추가 이벤트
  itemRow.querySelector('.fa-check').addEventListener('click', () => {
    itemRow.classList.toggle('item_done');
  });
  //삭제 버튼 클릭시 itemRow 제거 이벤트
  itemRow
    .querySelector('.fa-trash-can')
    .addEventListener('click', () => itemRow.remove());

  //setTimeout(() => itemRow.scrollIntoView({ block: 'center' }), 0);
  requestAnimationFrame(() => itemRow.scrollIntoView({ block: 'center' }));

  return itemRow;
}

// 추가함수
function onAdd() {
  const text = input.value.trim();
  if (!text) {
    input.value = '';
    input.focus();
    return;
  }

  // li생성하는 함수 - createItem(text)
  // ul에 생성값을 추가함

  items.appendChild(createItem(text));
  input.value = '';
  input.focus();
}

// 이벤트 등록
addBtn.addEventListener('click', onAdd);
// input.addEventListener('keypress', (e) => {
//   console.log(e);
//   if (e.key === 'Enter') {
//     onAdd();
//   }
// });

input.addEventListener('keyup', (e) => e.key === 'Enter' && onAdd());
