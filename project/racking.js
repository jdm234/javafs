// 페이지 로드 후 롤링 시작
window.addEventListener("load", startRolling);

// 롤링을 시작하고 일정한 간격으로 롤링을 반복
function startRolling() {
  setInterval(rollText, 5000); // 6초마다 롤링 반복
}


// 롤링 애니메이션 함수
function rollText() {
  const rolling = document.querySelector(".rolling");
  const firstItem = rolling.firstElementChild;

  // 첫 번째 아이템을 맨 뒤로 이동
  rolling.appendChild(firstItem);
}


