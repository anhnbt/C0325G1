let canNang = +prompt('Nhập số cân nặng c');
if (isNaN(canNang)) {
    alert('Bạn phải nhập số');
} else if (canNang < 50) {
    alert('Bạn nên mặc size S');
} else if (canNang < 65) {
    alert('Bạn nên mặc size M');
} else if (canNang < 80) {
    alert('Bạn nên mặc size L');
} else {
    alert('Bạn nên mặc size XL');
}
