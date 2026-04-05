# 📋 RegistrationApp

A Simple Java Web Application that allows users to register via an HTML form. Form data is stored in a MySQL database using a Java Servlet backend, deployed on Apache Tomcat.

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Frontend | HTML, CSS |
| Backend | Java Servlet |
| Database | MySQL (JDBC) |
| Server | Apache Tomcat 9.0 |
| IDE | Eclipse |
| Java | Java SE 17 |

---

## 📁 Project Structure

```
RegistrationApp/
├── src/
│   └── main/
│       ├── java/
│       │   └── RegisterServlet.java        # Servlet handling form POST request
│       └── webapp/
│           ├── index.html                  # Registration form UI (HTML + CSS)
│           ├── WEB-INF/
│           │   ├── web.xml                 # Deployment descriptor
│           │   └── lib/
│           │       └── mysql-connector-j.jar  # MySQL JDBC driver
│           └── META-INF/
│               └── MANIFEST.MF
├── build/
│   └── classes/                            # Compiled .class files
├── .settings/                              # Eclipse IDE settings
├── .classpath                              # Eclipse classpath config
├── .project                                # Eclipse project config
└── .gitignore
```

---

## ⚙️ How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/methodmystic/RegistrationApp.git
   ```
2. **Import into Eclipse** → `File` → `Import` → `Existing Projects into Workspace`
3. **Add MySQL Connector/J JAR** to `WEB-INF/lib/`
4. **Update DB credentials** in `RegisterServlet.java`:
   ```java
   String user = "your_username";
   String password = "your_password";
   ```
5. **Run on Tomcat** and open `http://localhost:8080/RegistrationApp/index.html`

---

## 💡 Concepts Used

- **Java Servlets** — Server-side Java class handling HTTP POST requests from the form
- **JDBC (Java Database Connectivity)** — Connecting and executing queries on MySQL from Java
- **PreparedStatement** — Safely inserting user data into the DB, preventing SQL injection
- **HTML Forms** — Capturing user input and sending it to the servlet via POST method
- **CSS Styling** — Gradient background, card layout, and styled input fields
- **MVC Pattern** — Separation of UI (index.html) and logic (RegisterServlet.java)
- **Tomcat Deployment** — Running the app as a Dynamic Web Project on Apache Tomcat 9.0
- **Annotation-based Servlet Mapping** — Using `@WebServlet("/RegisterServlet")` instead of web.xml

---

## 👤 Author

**[@methodmystic](https://github.com/methodmystic)**
