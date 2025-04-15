document.getElementById('myButton').addEventListener('click', function() {
    var message = "Hello, world!";
    console.log(message);
});
function calculateSum(a, b) {
    return +a + +b;
}
const total = calculateSum("5", "10"); // 15
console.log(total);
