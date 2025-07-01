// Khai báo hàm
// function sayHello() {
//   console.log('Hello, World!');
// }

// // Gọi hàm
// sayHello(); // Kết quả: Hello, World!

function showNotification(tieuDe, noiDung, icon, okText) {
  console.log(undefined);
  Swal.fire({
    title: tieuDe,
    text: noiDung,
    icon: icon ? icon : 'error',
    confirmButtonText: okText,
  });
}

function showFirework() {
  const duration = 15 * 1000,
    animationEnd = Date.now() + duration,
    defaults = { startVelocity: 30, spread: 360, ticks: 60, zIndex: 0 };

  function randomInRange(min, max) {
    return Math.random() * (max - min) + min;
  }

  const interval = setInterval(function () {
    const timeLeft = animationEnd - Date.now();

    if (timeLeft <= 0) {
      return clearInterval(interval);
    }

    const particleCount = 50 * (timeLeft / duration);

    // since particles fall down, start a bit higher than random
    confetti(
      Object.assign({}, defaults, {
        particleCount,
        origin: { x: randomInRange(0.1, 0.3), y: Math.random() - 0.2 },
      })
    );
    confetti(
      Object.assign({}, defaults, {
        particleCount,
        origin: { x: randomInRange(0.7, 0.9), y: Math.random() - 0.2 },
      })
    );
  }, 250);
}

// let numberOne = 10;

// function changeNumber(number) {
//   number = 20;
// }
// console.log(number);

// changeNumber(numberOne);
// console.log(numberOne); // Kết quả: 10

// function sayHello() {
//   var fullName = 'Nguyễn Văn A';
//   console.log(fullName); // Kết quả: Nguyễn Văn A
// }

// console.log(fullName); // Kết quả: Uncaught ReferenceError: fullName is not defined

// function viduVar() {
//   // function scope
//   for (var i = 0; i < 5; i++) {
//     // TODO:
//   }
//   console.log(i); // Kết quả: 5
// }

// viduVar(); // Kết quả: 5

// function viduLet() {
//   // block scope
//   for (let i = 0; i < 5; i++) {
//     // TODO:
//     console.log(i); // Kết quả: 0 1 2 3 4
//   }
//   // console.log(i); // Kết quả: Uncaught ReferenceError: i is not defined
// }
// viduLet(); // Kết quả: Uncaught ReferenceError: i is not defined

// if (true) {
//   let x = 1; // function scope
// }

// console.log(x); // Kết quả: 1
// Kết quả: Hello, undefined
// hoisting

sayHello();
// Hàm nặc danh (Anonymous function)
const sayHello = function () {
  var fullName;
  console.log('Hello, ' + fullName); // Kết quả: Hello, Nguyễn Văn A
  fullName = 'Nguyễn Văn A';
};
