# 🧪 QA Automation Project - Login Testing

---

## 📌 Project Overview
This project is a basic QA Automation framework developed using Java and Selenium WebDriver.  
It automates the login functionality of an e-commerce website (SauceDemo) using the Page Object Model (POM) design pattern.

---

## 🛠️ Tools & Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- IntelliJ IDEA

---

## 🌐 Test Website
https://www.saucedemo.com

---

## 📂 Project Structure
src/test/java
│
├── base → Contains BaseTest (browser setup and teardown)
├── pages → Contains LoginPage (page elements and actions)
└── tests → Contains LoginTest (test cases)

---

## ✅ Features Implemented
- Automated login functionality
- Page Object Model (POM) design pattern
- WebDriverManager for automatic driver handling
- Test execution using TestNG
- Implicit wait for better synchronization

---

## 🧪 Test Scenarios
1. ✅ Valid Login  
   - Username: standard_user  
   - Password: secret_sauce  

2. ❌ Invalid Login  
   - Incorrect username/password  

---

## ▶️ How to Run the Project
1. Clone the repository  
2. Open project in IntelliJ IDEA  
3. Install Maven dependencies  
4. Run `LoginTest.java`  

---

## 📊 Expected Output
- Chrome browser opens automatically  
- Website loads successfully  
- Login credentials are entered  
- Login button is clicked  
- User is logged in (for valid test)  

---

## 📸 Screenshots
(Add your screenshot here)

Example:
![Login Test](screenshots/login.png)
![Success](screenshots/success.png)
![Test](screenshots/test.png)

---

## 🚀 Future Enhancements
- Add more test cases (cart, checkout)
- Implement explicit waits
- Add TestNG reports
- Capture screenshots on failure
- Integrate with Jenkins for CI/CD

---

## 👨‍💻 Author
Abhishek Yewale
