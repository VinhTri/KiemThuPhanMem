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
# BÁO CÁO TUẦN 2

## Chủ đề: Kiểm thử đơn vị với JUnit – Phân tích dữ liệu điểm số học sinh

---

## 1. Thông tin chung

* **Môn học:** (Sinh viên tự điền)
* **Tuần:** 2
* **Bài tập:** Thực hành kiểm thử với JUnit
* **Ngôn ngữ:** Java
* **Công cụ:** JDK, JUnit 5, Git, GitHub

---

## 2. Mục tiêu học tập

Thông qua bài tập này, sinh viên đạt được các mục tiêu sau:

* Hiểu cách viết **kiểm thử đơn vị (Unit Test)** bằng JUnit.
* Biết cách phân tích yêu cầu chức năng để xây dựng test case.
* Thực hành tổ chức mã nguồn theo cấu trúc chuẩn (`src/`, `test/`).
* Biết cách sử dụng **GitHub Issues** và **commit message** để quản lý công việc.
* Bước đầu khai thác **AI tạo sinh** để hỗ trợ lập trình và kiểm thử.

---

## 3. Mô tả bài toán

Bài toán yêu cầu xây dựng lớp `StudentAnalyzer` để phân tích điểm số học sinh.

### 3.1. Các chức năng chính

Lớp `StudentAnalyzer` gồm 2 phương thức:

1. **countExcellentStudents(List<Double> scores)**

   * Đếm số học sinh đạt loại **Giỏi** (điểm >= 8.0).
   * Bỏ qua các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10).
   * Nếu danh sách rỗng, trả về 0.

2. **calculateValidAverage(List<Double> scores)**

   * Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10).
   * Bỏ qua các điểm không hợp lệ.
   * Nếu không có điểm hợp lệ, trả về 0.

---

## 4. Phân tích yêu cầu kỹ thuật

### 4.1. Điều kiện xử lý

* **Validate dữ liệu:**

  * Điểm < 0 hoặc > 10 → bỏ qua.
* **Danh sách rỗng:**

  * Trả về kết quả mặc định là 0.

### 4.2. Thuật toán

* Sử dụng **vòng lặp** để duyệt qua danh sách điểm.
* Với mỗi điểm:

  * Kiểm tra hợp lệ.
  * Nếu hợp lệ:

    * Với hàm đếm: kiểm tra >= 8.0.
    * Với hàm trung bình: cộng tổng và tăng biến đếm.

---

## 5. Thiết kế kiểm thử với JUnit

### 5.1. Mục tiêu kiểm thử

* Đảm bảo các phương thức hoạt động đúng với:

  * Trường hợp bình thường.
  * Trường hợp biên.
  * Trường hợp dữ liệu không hợp lệ.

### 5.2. Các nhóm test case

#### a. Trường hợp bình thường

* Danh sách có cả điểm hợp lệ và không hợp lệ.
* Danh sách toàn bộ điểm hợp lệ.

#### b. Trường hợp biên

* Danh sách rỗng.
* Danh sách chỉ chứa 0 hoặc 10.

#### c. Trường hợp ngoại lệ

* Có điểm âm.
* Có điểm lớn hơn 10.

### 5.3. Lớp kiểm thử

Sử dụng JUnit 5 với lớp `StudentAnalyzerTest` để kiểm thử từng phương thức độc lập.

---

## 6. Tổ chức thư mục dự án

```
unit-test/
│── src/
│   └── StudentAnalyzer.java
│
│── test/
│   └── StudentAnalyzerTest.java
│
└── README.md
```

Cách tổ chức này giúp:

* Tách biệt rõ mã nguồn và mã kiểm thử.
* Dễ dàng chạy test tự động.

---

## 7. Quản lý công việc với GitHub

### 7.1. Danh sách Issues đã tạo

| STT | Tên Issue                         | Mô tả                                           |
| --- | --------------------------------- | ----------------------------------------------- |
| 1   | Viết hàm countExcellentStudents() | Xử lý kiểm tra điểm hợp lệ và đếm học sinh giỏi |
| 2   | Viết hàm calculateValidAverage()  | Tính trung bình các điểm hợp lệ                 |
| 3   | Viết test cho 2 hàm trên          | Viết test case bằng JUnit                       |
| 4   | Viết tài liệu README.md           | Mô tả bài toán và hướng dẫn chạy                |

### 7.2. Commit gắn với Issue

Ví dụ commit message:

* `feat: implement countExcellentStudents() #1`
* `feat: implement calculateValidAverage() #2`
* `test: add unit tests for StudentAnalyzer #3`
* `docs: update README with instructions #4`

Việc liên kết commit với issue giúp theo dõi tiến độ và quản lý dự án hiệu quả.

---

## 8. README.md – Hướng dẫn sử dụng

Nội dung chính của README:

* Mô tả bài toán và mục tiêu.
* Yêu cầu môi trường (JDK, JUnit).
* Hướng dẫn chạy chương trình.
* Hướng dẫn chạy kiểm thử đơn vị bằng JUnit.

---

## 9. Kết quả đạt được

* Hoàn thành đầy đủ 2 phương thức theo yêu cầu.
* Viết được các test case bao phủ nhiều tình huống khác nhau.
* Nắm được quy trình **viết code → viết test → commit → quản lý issue**.
* Hiểu rõ vai trò của kiểm thử đơn vị trong phát triển phần mềm.

---

## 10. Kết luận

Bài tập tuần 2 giúp sinh viên làm quen với kiểm thử tự động bằng JUnit và cách tổ chức dự án Java theo chuẩn. Thông qua việc kết hợp GitHub Issues, commit message và test case, sinh viên có cái nhìn thực tế hơn về quy trình phát triển phần mềm chuyên nghiệp.

**Hướng phát triển:**

* Bổ sung thêm test cho dữ liệu lớn.
* Áp dụng CI (GitHub Actions) để chạy test tự động khi push code.

---

**Sinh viên thực hiện:** (Tự điền tên)
**Ngày nộp:** (Tự điền)


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

