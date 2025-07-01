const products = [];
products.push('Samsung', 'Apple');
products.push('Xiaomi');
// products.unshift('Oppo');
const tableBody = document.getElementById('productList');
displayProduct();
function displayProduct() {
  tableBody.innerHTML = '';
  document.getElementById(
    'heading'
  ).innerHTML = `<h2 style="display: inline">Add New Product</h2> <strong style="color: #a52a2a">${products.length} Products</strong>`;
  for (let i = 0; i < products.length; i++) {
    tableBody.innerHTML += `<tr>
  <td>${products[i]}</td>
  <td><button onclick="editProduct(${i})">Edit</button></td>
  <td><button onclick="deleteProduct(${i})">Delete</button></td>
  </tr>
  `;
  }
}

function deleteProduct(index) {
  if (confirm(`Bạn có muốn xóa sản phẩm ${products[index]} không!`)) {
    products.splice(index, 1);
    displayProduct();
  }
}

function createProduct(event) {
  event.preventDefault();
  const productName = document.getElementById('productName').value;
  // Nếu có dữ liệu thì mới thêm vào mảng
  if (productName.trim()) {
    products.push(productName);
    displayProduct();
  }
}

function editProduct(index) {
  const newProductName = prompt('Nhập tên sản phẩm cần sửa', products[index]);
  products[index] = newProductName;
  displayProduct();
}
