const root = document.getElementById('root');
createImage(1);
createImage(2);
createImage(3);
createImage(4);
createImage(5);
function createImage(i) {
  const image = new Image();
  image.style.width = '600px';
  const div = document.createElement('div');
  const animalRandom = Math.round(Math.random() * 3 + 1);
  // Tạo một số ngẫu nhiên từ 1 đến 3
  if (animalRandom === 1) {
    image.src = `./img/funny-cat1_part${i}x1.jpg`; // Đường dẫn đến hình ảnh
  } else if (animalRandom === 2) {
    image.src = `./img/monkey_part${i}x1.jpg`; // Đường dẫn đến hình ảnh
  } else {
    image.src = `./img/panda_swap_part${i}x1.jpg`; // Đường dẫn đến hình ảnh
  }
  div.appendChild(image); // Thêm hình ảnh vào phần tử root
  root.appendChild(div); // Thêm thẻ br vào phần tử root

  // Xử lý sự kiện click vào hình ảnh
  image.addEventListener('click', function () {
    if (image.src.includes('funny-cat1_part1')) {
      image.src = `./img/monkey_part1x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('monkey_part1')) {
      image.src = `./img/panda_swap_part1x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('panda_swap_part1')) {
      image.src = `./img/funny-cat1_part1x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('funny-cat1_part2')) {
      image.src = `./img/monkey_part2x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('monkey_part2')) {
      image.src = `./img/panda_swap_part2x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('panda_swap_part2')) {
      image.src = `./img/funny-cat1_part2x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('funny-cat1_part3')) {
      image.src = `./img/monkey_part3x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('monkey_part3')) {
      image.src = `./img/panda_swap_part3x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('panda_swap_part3')) {
      image.src = `./img/funny-cat1_part3x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('funny-cat1_part4')) {
      image.src = `./img/monkey_part4x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('monkey_part4')) {
      image.src = `./img/panda_swap_part4x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('panda_swap_part4')) {
      image.src = `./img/funny-cat1_part4x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('funny-cat1_part5')) {
      image.src = `./img/monkey_part5x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('monkey_part5')) {
      image.src = `./img/panda_swap_part5x1.jpg`; // Đường dẫn đến hình ảnh
    } else if (image.src.includes('panda_swap_part5')) {
      image.src = `./img/funny-cat1_part5x1.jpg`; // Đường dẫn đến hình ảnh
    }

    checkFinish();
  });
}

function checkFinish() {}
