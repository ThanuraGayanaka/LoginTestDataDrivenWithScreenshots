# Login Automation Data-Driven Test Project 🚀

## 📌 Overview
This project automates the login functionality of a web application using Selenium WebDriver with Java, TestNG, and Maven. It supports **Data-Driven Testing** (reading test data from a configuration file) and captures **screenshots** on both test success and failure.

---

## ⚙️ Features
- **Selenium WebDriver** for browser automation
- **TestNG** for test execution and assertions
- **Data-Driven Testing** using `config.properties` for flexible data management
- **Screenshot Capture** on both success and failure with timestamped filenames
- **Page Object Model (POM)** for better maintainability and reusability

---

## 🔧 Setup and Run Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/LoginAutomationDataDrivenScreenshot.git
cd LoginAutomationDataDrivenScreenshot
```

### 2️⃣ Install Dependencies
Ensure you have **Maven** installed, then run:
```bash
mvn clean install
```

### 3️⃣ Configure Test Data
Edit `src/main/resources/config.properties` with your details:
```properties
browser=chrome
url=https://example.com/login
username=testuser
password=testpassword
```

### 4️⃣ Run the Tests
Execute the tests with:
```bash
mvn test
```

---

## 📂 Project Structure

```
📁 LoginAutomationDataDrivenScreenshot
│
├── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java
│   │   │   ├── 📁 Basepage
│   │   │   ├── 📁 Pages
│   │   │   └── 📁 Utility
│   │   └── 📁 resources
│   │       └── config.properties
│   │
│   └── 📁 test
│       └── 📁 java
│           └── 📁 TestPages
│
├── 📁 screenshots
│
└── 📄 pom.xml
```

---

## 📸 Screenshot Capture
Screenshots are saved in the `/screenshots` folder after every test, with names generated based on the test case and timestamp (e.g., `LoginSuccess_20250315_102045.png`).

---

## 🎯 Future Improvements
- Extend `@DataProvider` to run multiple login data combinations
- Support cross-browser testing (Edge, Firefox, Safari, etc.)
- Implement detailed HTML reporting

---


