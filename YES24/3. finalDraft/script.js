// 1. 로그인 상태 유지 팝업
document.addEventListener('DOMContentLoaded', function () {
  const checkbox = document.getElementById('keep-login');
  const popup = document.getElementById('popup-login-status');
  const closeButton = document.getElementById('popup-close');

  if (!checkbox.checked) {
    popup.style.display = 'none';
  }

  // 체크박스를 체크하면 팝업 표시
  checkbox.addEventListener('change', function () {
    if (this.checked) {
      popup.style.display = 'flex';
    } else {
      popup.style.display = 'none';
    }
  });

  // 팝업 닫기 버튼 클릭 시 팝업 숨김
  closeButton.addEventListener('click', function () {
    popup.style.display = 'none';
  });

  // 팝업 외부 클릭 시 닫기
  // popup.addEventListener('click', function (event) {
  //   if (event.target === popup) {
  //     popup.style.display = 'none';
  //   }
  // });
});
// -----------------------------------------------------------
// 2. 비회원 주문확인 탭
document.addEventListener('DOMContentLoaded', function () {
  const tabs = document.querySelectorAll('.member-or-guest li');
  const forms = document.querySelectorAll('.login-form');

  tabs.forEach((tab) => {
    tab.addEventListener('click', function () {
      // 모든 탭의 active 제거
      tabs.forEach((t) => t.classList.remove('active'));
      this.classList.add('active');

      // 모든 폼 숨기기
      forms.forEach((form) => (form.style.display = 'none'));

      const target = this.getAttribute('data-target');
      document.getElementById(target).style.display = 'block';
    });
  });
});

// -----------------------------------------------------------
// 3. 아이디/비밀번호를 입력하지 않으면 빨간 에러 메시지 표시
document
  .getElementById('login-member')
  .addEventListener('submit', function (event) {
    event.preventDefault();

    var errorUsername = document.getElementById('error-username');
    var errorPassword = document.getElementById('error-password');
    var username = document.getElementById('username').value.trim();
    var password = document.getElementById('password').value.trim();

    // 모든 에러 메시지를 먼저 숨김
    errorUsername.style.display = 'none';
    errorPassword.style.display = 'none';

    if (!username) {
      errorUsername.style.display = 'block';
    } else if (!password) {
      errorPassword.style.display = 'block';
    } else {
      alert('유효한 접근이 아닙니다. 다시 시도해 주세요.');
      window.location.reload();
    }
  });

document
  .getElementById('login-guest')
  .addEventListener('submit', function (event) {
    event.preventDefault();

    var errorOrdernum = document.getElementById('error-ordernum');
    var errorOrderpw = document.getElementById('error-orderpw');
    var ordernum = document.getElementById('ordernum').value.trim();
    var orderpw = document.getElementById('orderpw').value.trim();

    // 모든 에러 메시지를 먼저 숨김
    errorOrdernum.style.display = 'none';
    errorOrderpw.style.display = 'none';

    if (!ordernum) {
      errorOrdernum.style.display = 'block';
    } else if (!orderpw) {
      errorOrderpw.style.display = 'block';
    } else {
      alert(
        '주문번호 또는 비밀번호를 잘못 입력하셨습니다. \n다시 확인 후 입력해주세요. \n모르시는 경우 고객센터로 문의바랍니다. \n(TEL : 1544-3800)'
      );
    }
  });
