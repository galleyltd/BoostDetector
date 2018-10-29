# BoostDetector
[![Build Status](https://travis-ci.com/galleyltd/BoostDetector.svg?branch=master)](https://travis-ci.com/galleyltd/BoostDetector)

### Startup with Redis in Docker container
```bash
docker-compose run -d --service-ports redis
```

Run App.kt from your favourite IDE

### Complete startup
```bash
./gradlew clean build
docker-compose build
docker-compose up -d
```

If you want to shut down app later, run:
```bash
docker-compose down
```
