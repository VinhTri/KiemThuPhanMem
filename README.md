# BÁO CÁO TUẦN 1 – KIỂM THỬ PHẦN MỀM

## 1. Thông tin sinh viên
- Họ và tên: Trần Vinh Trí
- Mã sinh viên: bit230407
- Môn học: Kiểm thử phần mềm
- Tuần: Tuần 1

## 2. Nội dung đã học trong tuần 1

### 2.1. Tổng quan về Kiểm thử phần mềm
- Khái niệm kiểm thử phần mềm
- Mục đích của kiểm thử phần mềm
- Vai trò của kiểm thử trong quá trình phát triển phần mềm

### 2.2. Các mức độ kiểm thử
- Unit Testing
- Integration Testing
- System Testing
- Acceptance Testing

### 2.3. Kiểm thử đơn vị (Unit Testing)
- Khái niệm Unit Test
- Lợi ích của Unit Test
- Giới thiệu framework JUnit trong Java

## 3. Bài tập thực hành
- Làm quen với Git và GitHub
- Tạo repository trên GitHub
- Đẩy bài tập tuần 1 lên GitHub
- Tạo project Java Maven
- Viết class và test cơ bản bằng JUnit
  
## 4. Hình ảnh minh chứng bài tập
- Bài tập thực hành 1

<img width="1244" height="595" alt="git_push" src="https://github.com/user-attachments/assets/abc80ad7-ded3-4752-82df-b8f5d00db3bc" />


## 5. Công cụ và công nghệ sử dụng
- Ngôn ngữ: Java
- Công cụ quản lý mã nguồn: Git, GitHub
- IDE: IntelliJ IDEA
- Build tool: Maven
- Framework kiểm thử: JUnit 5
  
## 6. Kết quả đạt được
- Hiểu được khái niệm và vai trò của kiểm thử phần mềm
- Biết cách sử dụng Git để quản lý mã nguồn
- Tạo và đẩy repository lên GitHub
- Biết cách viết Unit Test cơ bản với JUnit

---

## 7. Khó khăn gặp phải
- Lỗi khi khởi tạo Git và đẩy code lên GitHub
- Chưa quen với việc sử dụng dòng lệnh Git
- Cần thời gian làm quen với JUnit

---

## 8. Hướng phát triển trong các tuần tiếp theo
- Viết nhiều test case hơn với JUnit
- Tìm hiểu sâu hơn về các loại kiểm thử
- Hoàn thiện các bài tập thực hành theo yêu cầu môn học

---
# BÁO CÁO TUẦN 3

## KIỂM THỬ TỰ ĐỘNG (AUTOMATION TESTING) VỚI CYPRESS

---

## 1. Thông tin chung

* **Môn học:** Kiểm thử phần mềm
* **Tuần:** Tuần 3
* **Chủ đề:** Kiểm thử tự động End-to-End với Cypress
* **Công cụ sử dụng:** Cypress (JavaScript)
* **Website kiểm thử:** [https://www.saucedemo.com](https://www.saucedemo.com)

---

## 2. Mục tiêu bài thực hành

* Làm quen với công cụ kiểm thử tự động Cypress
* Viết và thực thi các kịch bản kiểm thử End-to-End
* Kiểm tra các chức năng chính của website bán hàng mẫu SauceDemo
* Hiểu được quy trình viết test case và chạy test tự động

---

## 3. Môi trường và công cụ

* **Hệ điều hành:** Windows 10/11
* **Ngôn ngữ:** JavaScript
* **Framework:** Cypress
* **NodeJS:** Đã cài đặt
* **IDE:** Visual Studio Code / IntelliJ IDEA

Cấu trúc thư mục chính:

```
End-to-End-Cypress-JS
├── cypress
│   ├── e2e
│   │   ├── login_spec.cy.js
│   │   ├── cart_spec.cy.js
│   ├── fixtures
│   ├── support
├── cypress.config.js
├── package.json
```

---

## 4. Các kịch bản kiểm thử

### 🔹 Kịch bản 1: Kiểm tra đăng nhập thành công

**Mục tiêu:**
Kiểm tra người dùng có thể đăng nhập thành công với thông tin hợp lệ.

**Dữ liệu kiểm thử:**

* Username: `standard_user`
* Password: `secret_sauce`

**Các bước thực hiện:**

1. Truy cập trang đăng nhập
2. Nhập username và password hợp lệ
3. Nhấn nút Login
4. Kiểm tra URL chuyển sang trang `/inventory.html`

**Kết quả mong đợi:**
Đăng nhập thành công và hiển thị trang danh sách sản phẩm.

---

### 🔹 Kịch bản 2: Kiểm tra đăng nhập thất bại

**Mục tiêu:**
Kiểm tra hệ thống hiển thị thông báo lỗi khi đăng nhập với thông tin không hợp lệ.

**Dữ liệu kiểm thử:**

* Username: `invalid_user`
* Password: `wrong_password`

**Các bước thực hiện:**

1. Truy cập trang đăng nhập
2. Nhập thông tin sai
3. Nhấn Login
4. Kiểm tra thông báo lỗi hiển thị

**Kết quả mong đợi:**
Hệ thống hiển thị thông báo lỗi đăng nhập.

---

### 🔹 Kịch bản 3: Kiểm tra chức năng thêm sản phẩm vào giỏ hàng

**Mục tiêu:**
Kiểm tra người dùng có thể thêm sản phẩm vào giỏ hàng sau khi đăng nhập.

**Các bước thực hiện:**

1. Đăng nhập bằng tài khoản hợp lệ
2. Nhấn nút "Add to cart" của sản phẩm đầu tiên
3. Kiểm tra số lượng sản phẩm trong giỏ hàng

**Kết quả mong đợi:**
Biểu tượng giỏ hàng hiển thị số lượng là **1**.

---

### 🔹 Kịch bản 4: Kiểm tra chức năng lọc sản phẩm theo giá

**Mục tiêu:**
Kiểm tra bộ lọc sắp xếp sản phẩm theo giá từ thấp đến cao hoạt động đúng.

**Các bước thực hiện:**

1. Đăng nhập hệ thống
2. Chọn bộ lọc "Price (low to high)"
3. Kiểm tra giá sản phẩm đầu tiên

**Kết quả mong đợi:**
Sản phẩm đầu tiên có giá thấp nhất là **$7.99**.

---

## 5. Kết quả thực thi

* Tất cả các kịch bản kiểm thử đều **PASS**
* Không phát hiện lỗi trong các chức năng đã kiểm tra
* Cypress thực thi test nhanh và ổn định

---

## 6. Nhận xét và đánh giá

* Cypress dễ sử dụng, cú pháp rõ ràng
* Phù hợp cho kiểm thử End-to-End các ứng dụng web
* Có thể mở rộng thêm nhiều kịch bản như: logout, checkout, remove item

---

## 7. Kết luận

Thông qua bài thực hành tuần 3, em đã:

* Hiểu được cách viết test case tự động với Cypress
* Thực hiện kiểm thử các chức năng cơ bản của website
* Nắm được quy trình kiểm thử End-to-End trong thực tế

Bài thực hành giúp nâng cao kỹ năng kiểm thử tự động và làm nền tảng cho các bài học tiếp theo.

---

** Kết thúc báo cáo Tuần 3**

