# QA Engineer Take-Home Assignment

## Candidate

Thyagaraj

---

## Application Chosen

OrangeHRM Demo

https://opensource-demo.orangehrmlive.com/

For API Automation I used JSONPlaceholder.

https://jsonplaceholder.typicode.com/

---

## Technologies Used

- Java
- Selenium WebDriver
- Cucumber BDD
- TestNG
- Maven
- Rest Assured
- Git
- GitHub

---

## Project Structure

BDD/
- UI Automation

RestAssured/
- API Automation

manual-test-cases/
- Finance_Test_Cases.xlsx

---

## Manual Test Cases

Created 8 manual test cases covering:

- Positive scenarios
- Negative scenarios
- Boundary value scenarios

---

## UI Automation

Automated Scenarios:

1. Login with valid credentials
2. Login with invalid password
3. Login without username

Assertions:

- Dashboard displayed
- Invalid Credentials message
- Required message

---

## API Automation

GET User

- Status Code 200

POST User

- Status Code 201

Invalid User

- Status Code 404

---

## How to Run

### UI Automation

Run the Test Runner class.

### API Automation

Run the TestNG classes inside the RestAssured project.

---

## Framework Design

- Page Object Model (POM)
- Explicit Waits
- TestNG Assertions
- Maven Project
