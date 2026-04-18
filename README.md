# 🌐 Servlet-JSP Web Applications — MVC Architecture

A collection of Java web applications demonstrating real-world implementation of **Servlets**, **JSP**, **JDBC**, and **MVC Architecture**. Built around a structured user registration system with proper request handling, database interaction, and clean separation of concerns.

---

## 📚 Concepts Implemented

### 🔧 Servlet Fundamentals
| Concept | Description |
|---|---|
| Lifecycle Methods | `init()`, `service()`, `destroy()` |
| Request Processing | `request.getParameter()` to extract form data |
| Controller Logic | Centralized handling via a single Servlet |

### 🗄️ Database Layer — JDBC
| Concept | Description |
|---|---|
| Connection Handling | `DriverManager.getConnection()` via utility class |
| Query Execution | `PreparedStatement`, `executeUpdate()` |
| Resource Management | Safe closing of `Connection` and `PreparedStatement` |

### 🔀 Request Flow & Navigation
| API | Usage |
|---|---|
| `RequestDispatcher.forward()` | Server-side navigation without URL change |
| `RequestDispatcher.include()` | Reusing responses from other resources |
| `response.sendRedirect()` | Client-side redirect for success/failure flow |
| `request.getSession()` | Creating and managing user sessions |
| `setAttribute()` / `getAttribute()` | Passing data across pages via session/request |

### 📄 JSP — View Layer
- Dynamic content rendering using **Scriptlets**, **Expressions**, and **Declarations**
- Receives data from Servlet through **session** and **request attributes**
- Displays user-specific responses on `Success.jsp` and `failure.jsp`

---

## 🧩 MVC Architecture

### 🎮 Controller — `RegisterServlet.java`
- Handles HTTP POST requests from the registration form
- Extracts parameters using `request.getParameter()`
- Delegates to the Model layer for DB operations
- Controls navigation flow using `sendRedirect()`

### 🧠 Model — `Model.java`
- Encapsulates user data and business logic
- Executes INSERT queries via `PreparedStatement`
- Uses `DBConnection.java` utility for connection management

### 🎨 View — JSP / HTML
- `index.html` — Registration form for user input
- `Success.jsp` — Confirmation page after successful registration
- `failure.jsp` — Error page for failed DB operations

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java (JDK 8+) |
| Web Layer | Servlet API, JSP |
| Database | MySQL |
| DB Access | JDBC |
| Server | Apache Tomcat 9+ |
| Build | Maven |

---

## ✨ Key Features

- ✅ User Registration System with form-based input
- ✅ Secure data insertion using `PreparedStatement` (SQL Injection safe)
- ✅ Session-based data passing across pages
- ✅ MVC-structured, maintainable codebase
- ✅ Clean resource management (no connection leaks)

---

## 🔄 Application Flow

```
User → Registration Form (HTML)
     → RegisterServlet (Controller)
          → UserModel (Model — DB Insert via JDBC)
     → sendRedirect()
          → Success.jsp / failure.jsp (View)
               → Response to User
```

---

## 🎯 What This Project Demonstrates

- Real-world MVC implementation in Java Web Apps without any framework
- Clean separation of **Controller**, **Model**, and **View** layers
- End-to-end understanding of the **Servlet–JSP lifecycle**
- Practical JDBC usage with proper exception handling and resource cleanup
- A solid foundation for learning **Spring MVC** and **Spring Boot**

---

## 👤 Author

**Pranav** — [@methodmystic](https://github.com/methodmystic)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
