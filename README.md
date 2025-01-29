# Cloud-Native URL Shortener with Analytics

## 📌 Project Overview
This project is a **Cloud-Native URL Shortener** built using **Spring Boot**, **Docker**, and **Kubernetes**. It allows users to shorten long URLs, track analytics (clicks, location, browser, etc.), and provides a scalable deployment on **DigitalOcean Kubernetes**.

## 🚀 Features
- 🔗 **URL Shortening** – Convert long URLs into short, easy-to-share links.
- 📊 **Click Analytics** – Track user interactions, including timestamps and locations.
- 💾 **Database Integration** – Uses **PostgreSQL** for persistent storage.
- 🐳 **Dockerized** – Fully containerized for easy deployment.
- ☸️ **Kubernetes Deployment** – Runs on **DigitalOcean Kubernetes Cluster**.
- ⚡ **CI/CD Integration** – Automated deployment with **GitHub Actions**.
- 📈 **Monitoring & Logging** – Implements **Prometheus, Grafana, and ELK Stack**.
- 🔐 **Security & Autoscaling** – Uses **RBAC & Horizontal Pod Autoscaler (HPA)**.

## 🏗️ Tech Stack
| Technology     | Description |
|--------------|------------|
| **Spring Boot** | Backend API |
| **PostgreSQL** | Database for storing URLs and analytics |
| **Docker** | Containerization for portability |
| **Kubernetes** | Orchestration and deployment |
| **DigitalOcean Kubernetes** | Cloud hosting provider |
| **Prometheus & Grafana** | Monitoring and metrics |
| **ELK Stack** | Centralized logging (Elasticsearch, Logstash, Kibana) |
| **GitHub Actions** | CI/CD pipeline for automation |

## 📂 Project Structure
```
📁 cloud-native-url-shortener
│── 📂 src/main/java/com/example/urlshortener
│   ├── 📄 UrlShortenerApplication.java
│   ├── 📄 controller/UrlController.java
│   ├── 📄 service/UrlService.java
│   ├── 📄 repository/UrlRepository.java
│   ├── 📄 model/UrlEntity.java
│── 📂 src/main/resources
│   ├── 📄 application.properties
│── 📂 kubernetes
│   ├── 📄 deployment.yaml
│   ├── 📄 service.yaml
│   ├── 📄 ingress.yaml
│── 📂 docker
│   ├── 📄 Dockerfile
│   ├── 📄 docker-compose.yaml
│── 📄 README.md
│── 📄 .gitignore
│── 📄 pom.xml
```

## 🛠️ Setup & Installation
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/yourusername/cloud-native-url-shortener.git
cd cloud-native-url-shortener
```

### 2️⃣ Run Locally with Docker
```sh
docker-compose up --build
```

### 3️⃣ Deploy to Kubernetes (DigitalOcean)
#### **Step 1: Build & Push Docker Image**
```sh
docker build -t your-dockerhub-username/url-shortener .
docker push your-dockerhub-username/url-shortener
```

#### **Step 2: Apply Kubernetes Manifests**
```sh
kubectl apply -f kubernetes/
```

#### **Step 3: Verify Deployment**
```sh
kubectl get pods -n your-namespace
```

## 🔄 CI/CD Pipeline (GitHub Actions)
This project includes **GitHub Actions** to automate:
- ✅ Building the Docker image
- ✅ Pushing to Docker Hub
- ✅ Deploying to Kubernetes

## database setup

```sh
docker run --name url_shortener_db -e POSTGRES_USER=ubot202 -e POSTGRES_PASSWORD=ubot202 -e POSTGRES_DB=url_shortener_db -p 5432:5432 -d postgres
```


## 📈 Monitoring & Logging
- **Metrics** → **Prometheus & Grafana** for performance monitoring.
- **Logging** → **ELK Stack** (Elasticsearch, Logstash, Kibana) for centralized logs.

## 🚀 API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/shorten` | Generates a short URL |
| `GET` | `/{shortCode}` | Redirects to the original URL |
| `GET` | `/stats/{shortCode}` | Retrieves analytics |

## 🛡️ Security & Scalability
- 🛠️ **RBAC (Role-Based Access Control)** for restricted access.
- 🚀 **Horizontal Pod Autoscaler (HPA)** for handling high traffic.

## 🤝 Contributing
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit changes (`git commit -m "Added feature"`).
4. Push to your branch (`git push origin feature-name`).
5. Open a Pull Request.

## 📜 License
This project is licensed under the **MIT License**.

## 📬 Contact
👤 **Baftjar Tabaku**  
- ✉️ **Email**: [bafti@btabaku.info](mailto:bafti@btabaku.info)  
- 🌐 **Personal Website**: [btabaku.info](https://btabaku.info/)
