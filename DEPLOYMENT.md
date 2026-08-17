# Deployment Guide - Quantum Weave Lead Manager

Your application is ready to deploy! Here are your options:

## Option 1: One-Click Deploy to Railway ⭐ (Recommended)

Click this link to deploy directly to Railway:

🚀 **[Deploy to Railway](https://railway.app/new?githubRepo=mallikarjun-coder/quantum-weave-lead-manager)**

**Setup Steps:**
1. Click the link above
2. Connect your GitHub account
3. Railway will automatically build and deploy
4. Add these environment variables in Railway dashboard:
   - `DB_URL`: Railway will provide the MySQL connection URL
   - `DB_USERNAME`: Railway will provide
   - `DB_PASSWORD`: Railway will provide
   - `OPENAI_API_KEY`: Get from https://platform.openai.com/api-keys
   - `PORT`: Set to 8080

5. Your app will be live at: `https://<your-app-name>.up.railway.app`

---

## Option 2: Deploy to Render

Visit: https://render.com/

1. Click "New +" → "Web Service"
2. Connect your GitHub repo: `mallikarjun-coder/quantum-weave-lead-manager`
3. Set build command: `mvn clean package -DskipTests`
4. Set start command: `java -jar target/lead-manager-0.0.1-SNAPSHOT.jar`
5. Add environment variables (same as above)

---

## Option 3: Deploy Locally (Testing)

```bash
# Run with default MySQL on localhost
java -jar target/lead-manager-0.0.1-SNAPSHOT.jar
```

Visit: http://localhost:8080

---

## Environment Variables Required

| Variable | Example | Where to Get |
|----------|---------|-------------|
| `OPENAI_API_KEY` | `sk-...` | https://platform.openai.com/api-keys |
| `DB_URL` | `jdbc:mysql://host:3306/lead_manager` | Railway/Render provides |
| `DB_USERNAME` | Database user | Railway/Render provides |
| `DB_PASSWORD` | Database password | Railway/Render provides |

---

## Getting Your OpenAI API Key

1. Go to https://platform.openai.com/api-keys
2. Sign in or create account
3. Click "Create new secret key"
4. Copy and add to your deployment platform's environment variables

---

## Status

✅ Application built successfully
✅ Docker configured
✅ Ready for deployment
⏳ Waiting for deployment confirmation

Your public link will be available after you complete the deployment steps above!
