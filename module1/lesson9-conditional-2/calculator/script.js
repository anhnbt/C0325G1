const buttons = document.querySelectorAll('button');
let firstNumber = '';
let secondNumber = '';
for (let i = 0; i < buttons.length; i++) {
  buttons[i].addEventListener('click', function (event) {
    if (firstNumber === '' && secondNumber === '') {
      document.getElementById('value').value = '';
    }
    const oldValue = document.getElementById('value').value;
    const newValue = event.target.innerText; // Giá trị mới do người dùng chọn
    if (newValue === '=') {
      const KQ = eval(oldValue); // Tính toán kết quả
      document.getElementById('value').value = KQ;
      firstNumber = '';
      secondNumber = '';
    } else if (newValue === 'C') {
      document.getElementById('value').value = '';
    } else if (
      oldValue.includes('+') ||
      oldValue.includes('-') ||
      oldValue.includes('*') ||
      oldValue.includes('/')
    ) {
      secondNumber += newValue;
      document.getElementById('value').value = oldValue + newValue; // Cập nhật lại màn hình
      console.log(secondNumber);
    } else {
      document.getElementById('value').value = oldValue + newValue;
      firstNumber = parseInt(document.getElementById('value').value);
      console.log(firstNumber);
    }
  });
}
