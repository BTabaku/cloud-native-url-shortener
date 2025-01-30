---

# Cloud-Native URL Shortener with Analytics

A production-ready URL shortener service with analytics capabilities, designed for cloud-native environments.

---

## ✨ Features

- **URL Shortening**: Create short, memorable aliases for long URLs.
- **Analytics Dashboard**: Track clicks, geographic data, and device information.
- **Docker-Ready**: Fully containerized for easy deployment.
- **Monitoring**: Integrated Prometheus metrics and Grafana dashboards.
- **Security**: Rate limiting, HTTPS support, and RBAC (Role-Based Access Control).

---

## 🛠️ Tech Stack

| Category       | Technologies                                                                 |
|----------------|-----------------------------------------------------------------------------|
| **Backend**    | Spring Boot 3, Spring Data JPA                                              |
| **Database**   | PostgreSQL (persistence), Redis (caching)                                   |
| **Infrastructure** | Docker, Docker Compose                                                  |
| **Monitoring** | Prometheus, Grafana, OpenTelemetry                                          |
| **CI/CD**      | GitHub Actions, Docker Hub                                                  |

---

## 🚀 Quick Start

### Prerequisites
- JDK 17+
- Docker & Docker Compose
- PostgreSQL 14+

### Local Development
1. Clone the repository:
   ```bash
   git clone https://github.com/BTabaku/cloud-native-url-shortener.git
   cd cloud-native-url-shortener
   ```

2. Start dependencies:
   ```bash
   docker-compose -f docker/db-compose.yml up -d
   ```

3. Build and run the application:
   ```bash
   ./gradlew bootRun
   ```

4. Access the API at `http://localhost:8080`.

---

## 📂 Project Structure

```
cloud-native-url-shortener/
├── build.gradle
├── gradle/
├── gradlew
├── gradlew.bat
├── settings.gradle
├── README.md
├── docker-compose.yml
└── src/
    ├── main/
    │   ├── java/com/urlshortener/
    │   │   ├── CloudNativeUrlShortenerApplication.java  # Main class
    │   │   ├── config/                                  # Configuration classes
    │   │   ├── controller/                              # REST Controllers
    │   │   ├── service/                                 # Business logic
    │   │   ├── repository/                              # Data access layer
    │   │   ├── model/                                   # Domain models
    │   │   ├── dto/                                     # Data Transfer Objects
    │   │   ├── exception/                               # Custom exceptions
    │   │   └── util/                                    # Utility classes
    │   └── resources/
    │       ├── application.yml                          # Main config
    │       ├── db/migration/                            # Flyway migrations
    │       └── static/docs/                             # API documentation
    └── test/
        └── java/com/urlshortener/
            ├── unit/                                    # Unit tests
            └── integration/                             # Integration tests
```

---

## 📄 API Documentation

**Base URL**: `http://localhost:8080/api`

| Endpoint       | Method | Description                     |
|----------------|--------|---------------------------------|
| `/shorten`     | POST   | Create short URL                |
| `/{shortCode}` | GET    | Redirect to original URL        |
| `/analytics`   | GET    | Get click statistics            |

### Testing with `curl`

To test the `shortenURL` endpoint using `curl`, use the following command:

```sh
curl -X POST -H "Content-Type: application/json" -d '"http://example.com"' http://localhost:8080/api/shorten
```

---

## 🐳 Deployment with Docker

### Build the Docker Image
```bash
docker build -t url-shortener .
```

### Run the Docker Container
```bash
docker run -d -p 8080:8080 --name url-shortener url-shortener
```

### Environment Variables
Configure via `application.yml` or Docker environment variables:
```yaml
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST}:5432/url_shortener
    username: ${DB_USER}
    password: ${DB_PASSWORD}
```

---

## 📊 Monitoring

Pre-configured dashboards include:
- **Application Health Metrics**: Track uptime and performance.
- **Request Rate Analytics**: Monitor API usage and traffic.
- **Database Performance**: Optimize PostgreSQL queries.
- **Error Rate Monitoring**: Identify and resolve issues quickly.

Access Grafana at `https://monitoring.yourdomain.com`.

---

## 🤝 Contributing

We welcome contributions! Here’s how to get started:
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/amazing-feature`).
3. Commit your changes (`git commit -m 'Add amazing feature'`).
4. Push to the branch (`git push origin feature/amazing-feature`).
5. Open a Pull Request.

---

## 📬 Contact

👤 **Baftjar Tabaku**
- ✉️ **Email**: [bafti@btabaku.info](mailto:bafti@btabaku.info)
- 🌐 **Website**: [btabaku.info](https://btabaku.info/)
- 💻 **GitHub**: [@btabaku](https://github.com/BTabaku)