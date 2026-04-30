# 📱 Mobile Automation Testing - Task Management App  
**Author:** Muhammad Soni  

---

## 📖 Overview  
Project ini merupakan automation testing untuk aplikasi mobile menggunakan Katalon Studio dengan pendekatan UI automation (Appium).  

Pengujian difokuskan pada fitur **Task Management**, seperti menambahkan task, memilih kategori, dan validasi input data.

---

## 🛠 Tech Stack  
- Katalon Studio  
- Appium  
- Groovy  
- Android Automation  

---

## 📂 Project Structure  

### 📁 Test Cases / Blocks  

#### ✅ Positive Case  
- `TC001_Add Category` → Menambahkan kategori task  
- `TC002_ADD Task` → Menambahkan task baru  
- `TC003_ADD Task By Setel Waktu` → Menambahkan task dengan pengaturan waktu  

#### 🔁 Reusable Case  
Digunakan untuk modularisasi dan reuse step automation  

---

## 🧪 Test Scenario: Add Task  

### 🔹 Flow Automation  
1. Tap tombol **Add Task**  
2. Input **Task Title**  
3. Input **Description**  
4. Set waktu (opsional berdasarkan kondisi)  
5. Pilih kategori  
6. Submit task  
7. Validasi task berhasil dibuat  

---

## 🔧 Test Data (Variables)  

| Variable        | Value              |
|-----------------|--------------------|
| tasktitle       | Jam Kerja          |
| description     | Kerja Jam 08:00 AM |
| UseCustomDate   | true               |
| category        | Business           |

---

## 🧠 Logic & Validation  

- Menggunakan **If-Else condition** untuk menentukan penggunaan custom date  
- Menggunakan **Switch Statement** untuk pemilihan kategori  
- Validasi menggunakan:
  - `Verify Element Text`  
- Memastikan data yang diinput tampil sesuai expected result  

---

## ▶️ How to Run  
1. Buka project di Katalon Studio  
2. Hubungkan device Android / emulator  
3. Pilih Test Case atau Test Suite  
4. Klik **Run (Mobile)**  
5. Lihat hasil di **Log Viewer / Report**  

---

## 🎯 Objective  
- Memastikan fitur Add Task berjalan dengan baik  
- Menguji interaksi UI aplikasi mobile  
- Mengurangi bug melalui automation testing  

---

## 📊 Expected Result  
- Task berhasil dibuat  
- Data tampil sesuai input  
- Tidak ada error saat proses input  

---

## ⭐ Highlight  
✔ Mobile Automation (Appium)  
✔ Dynamic Test Data (Variables)  
✔ Conditional Logic (If-Else & Switch)  
✔ UI Validation (Verify Element)  
✔ Reusable Test Case Structure  

---

## 📌 Notes  
Project ini menggunakan pendekatan modular dan parameterized testing untuk meningkatkan efisiensi dan maintainability automation script.

---

## 👨‍💻 Author  
Muhammad Soni  
