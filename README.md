# Java Servlet Session Management & Age Filter

A lightweight web application built with **Java Servlets**, **JSP**, and **Filters** to demonstrate secure session handling and request interception.

## 🚀 Features
- **Age Validation Filter**: Intercepts requests to ensure only users aged 1-18 can proceed.
- **Session Management**: Uses `HttpSession` to persist user data (like name) across multiple servlets.
- **Server-Side Redirects**: Demonstrates the difference between `forward` and `sendRedirect`.
- **Secure Logout**: Invalidates the session and clears server-side data.

## 🛠️ Technologies Used
- **Language**: Java 8 (1.8)
- **Namespace**: `javax.servlet`
- **Server**: Apache Tomcat 9.0
- **Frontend**: JSP & HTML5
- **IDE**: Spring Tool Suite (STS) / Eclipse

## 📂 Project Structure
- `Session.jsp`: Entry point with a form to collect user name and age.
- `Filter1.java`: Validation logic to block users older than 18.
- `Servlet2.java`: Primary controller that creates the session and stores the user's name.
- `Servlet2_1.java`: Secondary servlet that retrieves and displays session data.
- `LogoutServlet.java`: Destroys the session and redirects to the home page.

## ⚙️ How to Run
1. Clone or download this project.
2. Import it into **STS/Eclipse** as a "Dynamic Web Project".
3. Ensure **Apache Tomcat 9.0** is configured in your "Targeted Runtimes".
4. Right-click the project -> **Run As** -> **Run on Server**.
5. Access the app at: `http://localhost:8080/SessionManagement-Using-ServletFilter`

## 📝 Prerequisites
- **JDK 1.8**
- **Apache Tomcat 9.0**
- **Eclipse/STS IDE**
