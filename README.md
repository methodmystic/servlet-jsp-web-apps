# 📋 RegistrationApp

A Java Web Application that allows users to register via an HTML form. Form data is stored in a MySQL database using a Java Servlet backend, deployed on Apache Tomcat.

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
├── src/main/java/
│   └── RegisterServlet.java      # Handles form submission & DB insert
├── src/main/webapp/
│   └── index.html                # Registration form UI
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

## 🔮 Future Improvements

- [ ] Password hashing (BCrypt)
- [ ] Login & session management
- [ ] Server-side input validation
- [ ] Move credentials to a config file

---

## 👤 Author

**[@methodmystic](https://github.com/methodmystic)**
