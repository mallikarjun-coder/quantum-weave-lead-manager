# Quantum Weave - Lead Manager

Java Spring Boot + MySQL + simple frontend + GenAI first-response drafting.

## Run
1. Install Java 17+, Maven and MySQL 8+.
2. Create DB: `CREATE DATABASE lead_manager;`
3. Set `DB_USERNAME` and `DB_PASSWORD` if different from root/root.
4. Optional GenAI: set `OPENAI_API_KEY` and `OPENAI_MODEL=gpt-5.6`.
5. Run: `mvn spring-boot:run`
6. Open: http://localhost:8080

## APIs
POST /api/leads
GET /api/leads
GET /api/leads/{id}
GET /api/leads?q=term
PUT /api/leads/{id}
DELETE /api/leads/{id}
POST /api/ai/first-response/{id}

## Architecture
Browser -> REST Controller -> Service -> JPA Repository -> MySQL
                         -> GenAI Service -> OpenAI Responses API

## Git
`git init` -> `git add .` -> `git commit -m "Build lead manager with GenAI"` -> push to GitHub.

## Business value
Centralizes enquiries, provides searchable lead data, and drafts consistent first responses to reduce repetitive sales work and improve response speed.
